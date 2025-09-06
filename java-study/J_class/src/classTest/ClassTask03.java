package classTest;

// 회원의 정보를 저장할 클래스 선언
// 아이디, 비밀번호

// 아이디 중복검사
// 아이디는 항상 "test"이며, 전달받은 아이디와 검사하여 결과를 리턴한다.

// 로그인
// 아이디와 비밀번호는 항상 "test", "1234"이다.
// 로그인 성공 혹은 실패에 대한 결과를 리턴한다.
class Member {
   String id;
   String password;

//   회원가입
   public Member(String id, String password) {
      this.id = id;
      this.password = password;
   }
   
//   아이디 중복검사
   boolean checkId(String id) {
      return id.equals("test");
   }
   
//   로그인
   boolean login(String id, String password) {
      return id.equals("test") && password.equals("1234");
   }
   
}

public class ClassTask03 {

}
