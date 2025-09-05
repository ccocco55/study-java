package list.task.User;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import list.task.DBConnecter;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserService {
   private final static int CERTIFICATED_NUMBER_LENGTH = 5;
   
   
//   이메일 중복검사
   public User checkEmail(String email) {
      User user = null;

      for (int i = 0; i < DBConnecter.users.size(); i++) {
         if (DBConnecter.users.get(i).getEmail().equals(email)) {	// 디비에 유저 i번쨰 방과 사용자가 입력한 이메일이 같은지 확인
            user = new User(DBConnecter.users.get(i));	// 맞으면 유저에 DB에 있는 유저 값 입력
         }
      }

      return user;	// 없으면 널
   }

//   회원가입
   public void join(User user) throws NoSuchAlgorithmException {
      user.setPassword(hash(user.getPassword()));	// 유저의 비밀번호 담아줌
      DBConnecter.users.add(new User(user));	// 디비에 새로운 유저 등록
   }

//   로그인
   public User login(User user) throws NoSuchAlgorithmException {
      User foundUser = checkEmail(user.getEmail());	// 이메일 체크
      if (foundUser != null) {	// 유저가 있으면
         if (foundUser.getPassword().equals(hash(user.getPassword()))) {	// 비밀번호 검사 후 
            return new User(foundUser);	// 찾은 유저 리턴
         }
      }
      return null;	// 없으면 null 리턴
   }

//   해싱(Hashing)
//   데이터를 고정된 길이의 값(해시값)으로 변환하는 과정

//   해시(Hash)
//   데이터를 대표하는 고정된 길이의 값

//   해시 함수(Hash Function)
//   해싱을 수행하는 함수로서 SHA-256, MD5 등이 있다.
   public String hash(String password) throws NoSuchAlgorithmException {	// 비밀번호 해싱하는 메소드
      MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
      byte[] arHashByte = messageDigest.digest(password.getBytes());
      StringBuilder stringBuilder = new StringBuilder();
      for (byte b : arHashByte) {
         stringBuilder.append(String.format("%02x", b));
      }

      return stringBuilder.toString();
   }

//   비밀번호 변경
//   1. 비밀번호 찾기 -> 인증 완료 -> 새로운 비밀번호로 변경
//   2. 로그인 완료 -> 새로운 비밀번호로 변경
   public void update(String email, String password) throws NoSuchAlgorithmException {
      for (int i = 0; i < DBConnecter.users.size(); i++) {
         if (DBConnecter.users.get(i).getEmail().equals(email)) {	// 이메일 있는지 확인
            DBConnecter.users.get(i).setPassword(hash(password));	// 다시 비밀번호 설정
         }
      }
   }

//   인증번호 전송
   public String sendCertificatedNumber(String phone) {	// 인증번호 전송 메소드
      String api_key = "";
      String api_secret = "";
      Message coolsms = new Message(api_key, api_secret);
      String certificatedNumber = makeCertificatedNumber();

      // 4 params(to, from, type, text) are mandatory. must be filled
      HashMap<String, String> params = new HashMap<String, String>();
      params.put("to", phone);
      params.put("from", "01000000000");
      params.put("type", "SMS");
      params.put("text", certificatedNumber);
      params.put("app_version", "test app 1.2"); // application name and version

      try {
         JSONObject obj = (JSONObject) coolsms.send(params);
         System.out.println(obj.toString());
      } catch (CoolsmsException e) {
         System.out.println(e.getMessage());
         System.out.println(e.getCode());
      }
      
      return certificatedNumber;
   }
   
//   5자리 인증번호 생성
   private String makeCertificatedNumber() {
      Random random = new Random();
      String certificatedNumber = "";
      
      for (int i = 0; i < CERTIFICATED_NUMBER_LENGTH; i++) {
         certificatedNumber += random.nextInt(10);
      }
      
      return certificatedNumber;
   }
   
//   개인 정보 수정
   public void update(User user) {
      for (int i = 0; i < DBConnecter.users.size(); i++) {
         if (DBConnecter.users.get(i).getEmail().equals(user.getEmail())) {	// 이메일과 비밀번호 확인 후 
            DBConnecter.users.get(i).setName(user.getName());	// 유저에게 입력받은 이름 다시 설정
            DBConnecter.users.get(i).setPhone(user.getPhone());	// 유저에게 입력받은 핸드폰 번호 다시 설정
         }
      }
   }
}














