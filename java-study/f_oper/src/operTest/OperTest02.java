package operTest;

import java.util.Scanner;

public class OperTest02 {
	public static void main(String[] args) {
//		두 정수 입력받기(nextInt())
		
		Scanner scanner = new Scanner(System.in);
		
		int number1 = 0;	// number1 초기화
		int number2 = 0;	// number2 초기화
		
		String nu = "두 정수를 입력하세요";	// nu에 문자열 값 입력
		String same = "두 수가 같습니다.";	// same에 문자열 값 입력
		String result = "";	// result에 초기화
		
		System.out.println(nu);	// nu 출력
		
		number1 = scanner.nextInt();	// 스캐너에서 받은 값 number1에 저장
		number2 = scanner.nextInt();	// 스캐너에서 받은 값 number2에 저장
		
		System.out.println(number1);	// number1 출력
		System.out.println(number2);	// number2 출력
		
		
//		두 정수 비교
//		더 큰 값을 출력한다.
//		단, 두 수가 같을 경우 "두 수 가 같습니다" 출력
		
	      result = number1 > number2 ? " 더 큰 값: " + number1 :
	    	  number1 == number2 ?  "두 수 가 같습니다." : "더 큰 값:" + number2; 
	      				// result에 number1이 number2 큰게 참이면 number1 아니면 number1이랑 number2 같으면 두 수 같다는 값 출력 아니면 number2
	      System.out.println(result);	// result 출력
	      
	      
	      
		
		
				
		
	}
}
