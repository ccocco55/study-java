package contralStatementTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		두 정수 입력받기(nextInt())
		
		Scanner scanner = new Scanner(System.in);
		
		int number1 = 0, number2 = 0;
		
		String message = "두 정수를 입력하세요";
		String result = "";
		
		System.out.println(message);
		
		number1 = scanner.nextInt();
		number2 = scanner.nextInt();
		
		if(number1 > number2) {	// 숫자의 큰값 비교
			result = "큰 값:" + number1;	// 1이 더 클때 1 출력
			
		}else if (number1 < number2) {
			result = "큰 값:" + number2;	// 2가 더 클때 2 출력
			
		}else {
			result = "두 수는 같습니다.";	// 둘다 아니면 같은 수
		}
		
		System.out.println(result);
		
	}
}
