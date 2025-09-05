package variableTest;	

public class VariableTest {	
	public static void main(String[] args) {	
//      정수형, 변수명은 a, 값은 10, 단, 기본형으로 선언하다.
//      실수형, 변수명은 b, 값은 10.1563, 단, float으로 선언한다.
//      실수형, 변수명은 c, 값은 10.1563, 단, double로 선언한다.
//      문자형, 변수명은 d, 값은 A
//      문자열, 변수명은 e, 값은 ABC
		
		
//		각 변수를 사용하여 출력 메소드를 출력해본다.
		int age = 10;	// age에 정수 값 입력
		float floatNumber = 10.1563f;	// floatNumber에 자료형 float으로 실수 값 입력
		double doubleNumber = 10.1563;	// doubleNumber에 실수 값 입력
		char grade = 'A';	// grage에 문자형 입력
		String data = "ABC";	// data에 문자열 입력
		
		
		System.out.println(age);	// age 값 출력
		System.out.println(floatNumber);	// floatNumber 값 출력
		System.out.println(doubleNumber);	// doubleNumber 값 출력
		System.out.println(grade);	// grade 값 출력
		System.out.println(data);	// data 값 출력
	}
}
