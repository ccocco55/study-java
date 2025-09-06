package inputTest;

import java.util.Scanner;	

public class InputTest02 {	
   public static void main(String[] args) {	
      Scanner scanner = new Scanner(System.in);	// 입력 클래스
      int age = 0;	// 변수명 초기화
      
      String message = "이름을 입력해주세요.";	// 변수명 message에 문자열 값 입력
      String ageMessage = "나이를 입력해주세요.";	// 변수명 agemessage에 문자열 값 입력
      String name = "";	// 변수명 name 값 초기화
      
      System.out.println(ageMessage);	// ageMessage 출력
      age = scanner.nextInt();	// 스캐너에서 받은 값 age에 저장

//      nextLine()은 앞에서의 엔터(\n)를 먹기 때문에
//      기존 입력 알고리즘에 문제가 생길 수 있다.
//      따라서 nextLine()으로 입력받기 전 다른 입력이 실행되었다면,
//      반드시 \n을 먹어줄 nextLine()을 사용해준다.
      scanner.nextLine();	// 엔터 먹는것 받아주는 줄
      
      System.out.println(message);	// Message 출력
      name = scanner.nextLine();	// 스캐너에서 받은 값 name에 저장
      
      System.out.println(name);	// name 값 출력
      System.out.println(age + "살");	// age 값 출력

   }
}











