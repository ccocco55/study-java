package castingTest;

public class CastingTest {
	public static void main(String[] args) {
//		자동형변환
		System.out.println(5 / 2.0);	// 연산 값 실수로 출력
		System.out.println(5 / 2);	// 연산 값 정수로 출력
		
		
//		강제형 변환
		System.out.println(5 / (double)2);	// 2를 실수로 강제형 변환하여 값 출력
		System.out.println((int)2.9 + 5);	// 2.9를 정수로 강제형 변환하여 값 출력
		
//		8.43 + 2.59 = 10
		
	
		 double number1 = 8.43, number2 = 2.59;	// 실수 number1,2 값 입력
		 int result = (int)number1 + (int)number2;	// 정수 result에 number1,2 강제형 변환하여 연산 값 입력
		 
		 System.out.println(result);	// result 값 출력
		
	}
}
