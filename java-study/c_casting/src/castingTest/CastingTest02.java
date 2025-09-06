package castingTest;	

public class CastingTest02 {	
public static void main(String[] args) {	
	
	  System.out.println("" + 3 + 8);	// 문자열을 입력하여 3 과 8 연결하여 값을 출력한다.
      
//    아래 코드를 수정하여 결과가 11이 나오도록 한다.
    System.out.println(3 + 8 + "");	// 문자열ㅇ르 뒤로 보내여 연산 먼저 하고 값을 출력한다.
    
//    "1 + 3 = 4"
//    위의 문자열에서 4를 변수로 사용한다.
//    변수 선언
//    아래의 출력 메소드에서 사용한다.
    System.out.println("1 + 3 = ");	// 문자열을 출력한다.
    
//    출력 결과: "1 + 3 = 4"
    
	int nu1 = 4;	// nu1에 정수 값을을 입력한다.
    
	System.out.println("1 + 3 = " + nu1);	// 문자열과 nu1값을 연결하여 값을 출력한다. 
	
}
}
