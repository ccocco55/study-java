package operTest;

import java.util.Iterator;

public class OperTest04 {
	public static void main(String[] args) {
//		이름 10번 출력
//		
		for(int i = 0; i < 10; i = i + 1) {		// 정수 i는 0부터 시작해서 10이하 일때까지 한번씩 더해서 출력한다.
			System.out.println(i + 1 + ".임채민");	// 출력
		
		
//		이름 10번 출력
//		대신 i는 10-1까지 역순으로 
		
		String name = ".임채민";	// name에 문자열 값 넣기
		
		for(int i1 = 10; i1>0; i1--) {	// 정수 i가 10일때, 0보다 클때까지 1씩 뺀다
			
		System.out.println(i1 + name);	// 출력
		
		
		}
	}
	}
}
