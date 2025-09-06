package constantTest;	

public class ConstantTest {	
public static void main(String[] args) {	
	final int ON = 12345;	// ON에 상수 값 12345 입력
	final int OFF = 35534;	// OFF에 상수 값 35534 입력
	
	System.out.println(ON);	//ON값 출력
	System.out.println(OFF);	// OFF값 출력
	
//	로그인 실패: 0
//	로그인 성공: 1
//	관리자: 2
	
	final int FIAL = 0, SUCCESS = 1, ADMIN = 2;	// FIAL, SUCCES, ADMIN에 상수값 입력
	
	System.out.println(FIAL);	// FIAL 값 출력
	System.out.println(SUCCESS);	// SUCCES 값 출력
	System.out.println(ADMIN);	// ADMIN 값 출력
	
}
}
