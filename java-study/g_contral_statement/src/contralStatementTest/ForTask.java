package contralStatementTest;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
////		브론즈
//		
//		1-100까지 출력
		for(int i = 0; i <100; i++) {
			System.out.println(i + 1);
		}
//		100-1까지 출력
		for(int i = 0; i <100; i++) {
			System.out.println(100 - i);
		}
//		1-100까지 중 짝수만 출력
		for(int i = 0; i <50; i++) {
			System.out.println((i + 1) * 2);
		}
//		
//		
////		짝수: 2의 배수다
////		홀수: 2의 배수가 아니다
////		2의 배수란, 2로 나누었을 때 나머지가 0인 수이다.
////		나머지 연산자: %(모듈러스)
////		예시) 10 % 3 == 1
//		
//		System.out.println(11 % 2 == 0);
		
		for (int i = 0; i < 100; i++) {
			if((i + 1) % 2 ==0) {
				System.out.println(i + 1);
			}
		}
//		
//		실버
		
//		1~10 합 출력
//		1-n까지 합 출력 (n은 사용자에게 입력받는다.)
		
		int result = 0; 
		
		
		for(int i = 0; i <10; i++) {
			result += i + 1;
		}
		
		System.out.println(result);
		
//		
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		String message = "숫자를 입력하세요";
		
		System.out.println(message);
		
		int n = scanner.nextInt();
		int sum = 0;
		
		
		for(int i = 0; i < n; i++){
			sum += i + 1;
		}
		
		System.out.println(sum);
		
//		
//		
//		골드
//		A~F까지 출력
		
//		int result = 0;
//		
//		for (int i = 0; i <6; i++) {
//			result = i + 65;
//			
//			System.out.println((char)result);
//		}
//		
		
			
			
		
//      A ~ F까지 중 C 제외하고 출력
      for (int i = 0; i < 5; i++) {
         System.out.println((char)((i > 1 ? 66 : 65) + i));
      }

//      다이아
//      0 1 2 3 0 1 2 3 0 1 2 3 출력
		
//		
//      int  result = 0;
//      
//      
//      
//      for (int i = 0; i < 12; i++) {
//
//    	  
//    	  System.out.println(i % 4);
//      }
//      
      
      
//      aBcDeFgH...Z 출력
      
      int text = 0;
      
      for (int i = 0; i < 26; i++) {
    	  
    	  int target = (i % 2 == 0 ? i + 97 : i + 65);
    	  
    	  System.out.print( (char)target);
      }
      
      
      
		
	}
}
