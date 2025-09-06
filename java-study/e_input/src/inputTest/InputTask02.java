
package inputTest;	

import java.util.Scanner;	

public class InputTask02 { 
   public static void main(String[] args) {	
//      두 정수를 입력받은 뒤 곱셈 결과를 출력한다.
//      단, nextInt()가 아닌 next()로 사용한다.
      Scanner scanner = new Scanner(System.in);	// 입력 클래스
      
      String message = "두 개의 정수를 입력하세요.";	// message에 지시 값 입력하기
      String example = "예)4 5";		// example에 예시 값 입력하기
      String format = "%d * %d = %d";	// format에 연산 입력하기
      
      int number1 = 0, number2 = 0;		// number1,2에 정수 0으로 값 초기화
      int result = 0;		// result에 정수 0으로 값 초기화
      
      System.out.println(message);		// message 값 출력
      System.out.println(example);		// example 값 출력
      
      number1 = Integer.parseInt(scanner.next());	// 스캐너에서 받은 값 정수를 추출하여 number1으로 입력
      number2 = Integer.parseInt(scanner.next());	// 스캐너에서 받은 값 정수를 추출하여 number2으로 입력
      
      result = number1 * number2;	// result 값에 연산 넣기
      
      System.out.printf(format, number1, number2, result);	// format 서식에 number1, number2, result  대입 후 출력
   }
}













