package operTest;	

public class OperTest01 {	
	public static void main(String[] args) {	
		boolean isTrue = 10 == 11;	//논리형 isTure에 값 저장
		boolean result = isTrue && 10 <= 20;	// 논리형 result에 값 저장
		
		System.out.println(10 == 11);	// flase 출력
		System.out.println(10 > 3);	// ture 출력
		System.out.println(isTrue); 	// isTure 출력
		System.out.println(result);	// result 출력
		
//		isTrue && 10 <= 20의 결과를 true가 나오도록 변경하기
//		단, 숫자는 변경하지 않는다.
		
		System.out.println(!result);	// result의 반대값 출력
}
}
