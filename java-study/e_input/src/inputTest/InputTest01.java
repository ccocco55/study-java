package inputTest;	

import java.util.Scanner;	

public class InputTest01 { 	
   public static void main(String[] args) {	
//      이름을 입력받고 출력하기
      String nameMessage = "이름: ";			// nameMassage 문자열 값 입력하기
      String name = "";	// name 문자열 값 초기화
      
      Scanner scanner = new Scanner(System.in);	//입력 클래스
      
      System.out.println(nameMessage);	// nameMessage 출력
      name = scanner.next();	// 스캐너 값 name에 입력
      
      System.out.println(name);	// name 값 출력
      
   }
}

