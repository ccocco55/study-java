package exceptionTest;

import java.util.Scanner;

public class Game {
//   캐릭터 이름을 입력받고,
//   "멍청이", "바보", "똥개"가 포함된 이름에 예외를 발생시켜
//   사용자에게 경고 메세지를 출력해준다.
//   ※ 강제 종료하지 않는다.
   
//   출력 종류 예시
//   종류1: 캐릭터명: 홍길동
//   종류2: 사용할 수 없는 닉네임입니다.
   
   void checkNickname(String nickname) throws NicknameException {
      String[] arName = {"멍청이", "바보", "똥개"};
      
      for (int i = 0; i < arName.length; i++) {
         if(nickname.contains(arName[i])) {	// 배열에 포함된 문자가 속해있다면
            throw new NicknameException("닉네임에 비속어가 포함되었습니다.");
         }
      }
   }
   
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String message = "캐릭터명: ";
      String nickname = null;
      Game game = new Game();
      
      System.out.print(message);
      nickname = scanner.next();
      
      try {
         game.checkNickname(nickname);	// 오류가 날 수 있는 문장
         System.out.println("캐릭터명: " + nickname);
      } catch (NicknameException e) {	// 오류 주소값
//         무슨 오류인지, 어디서 발생했는지 알고 싶을 때에는 반드시 작성해야 한다.
         e.printStackTrace();
         System.out.println("사용할 수 없는 닉네임입니다.");
      }
   }
}

