package inputTest;	

import java.util.Scanner;	

public class InputTask03 { 
	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력 받은 후 덧셈 결과 출력
//		nextInt() 사용하기
		
		Scanner scanner = new Scanner(System.in);	//입력 클래스
		
		String askNumber = " 세개의 정수를 입력하세요";		// askNumber 문자열 값 입력하기
		String example = "예시) 3 5 6";
		String threeNumber = "%d + %d + %d = %d";	// askNumber 문자열 값 입력하기
		
		int number1 = 0, number2 = 0, number3 = 0;	// number1-3 정수 값 초기화 해주기
		int result = 0;		// 결과 정수 값 초기화 해 주기

		System.out.println(askNumber);	// askNumber 출력하기
		System.out.println(example);	// example 출력하기
		
		
		number1 = scanner.nextInt();	// 스캐너에서 정수로 받은 값 number1에 입력
		number2 = scanner.nextInt();	// 스캐너에서 정수로 받은 값 number2에 입력
		number3 = scanner.nextInt();	// 스캐너에서 정수로 받은 값 number3에 입력
		
		result = number1 + number2 + number3;	// result 값에 연산 넣기
		
		System.out.printf(threeNumber, number1, number2, number3, result);	// threeNumber 서식에 number1, number2, number3, result 대입 후 출력
		
		
		
		
	
	}
}
