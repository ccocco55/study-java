package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
//		런타임 오류
//		System.out.println(10 / 0);
		
//		try {
//			System.out.println(10 / 0);
//		} catch (Exception e) {
//			System.out.println("분모가 0입니다.");
//		}
//		
//		System.out.println("반드시 실행해야 하는 문장");
		
		
//		사용자에게 정수 1개를 입력받고 출력한다.
//		만약, 사용자가 정수가 아닌 문자열을 입력하면 런타임 오류가 발생한다.
//		이 때. 예외처리응 사용해서 프로그램이 강제 종료되는 것을 막아본다.
		
		Scanner sc = new Scanner(System.in);
		
		int number = 0;
		
		System.out.println("정수를 1개를 입력해주세요.");
		
		
		try {
			number = sc.nextInt();	// 오류가 날 수 있는 문장
			
		} catch (InputMismatchException e) {	// 정수가 아닌 다른 자료형을 입력 했을 떄 오류 주소
			System.out.println("정수를 입력해 주세요");
		} catch (Exception e) {	// 다른 오류 전체
			System.out.println("다시 입력해 주세요.");
		}
		System.out.println(number);
	}
}
