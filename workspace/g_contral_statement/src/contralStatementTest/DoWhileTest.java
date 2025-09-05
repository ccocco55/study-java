package contralStatementTest;
import java.util.Scanner;

public class DoWhileTest {
   public static void main(String[] args) {	
      String message = "1.통신 요금 조회\n2.번호 변경\n3.통신사 변경\n0.상담원 연결";	// message에 문자열 값 입력
      
      Scanner scanner = new Scanner(System.in);	// 스캐너 불러오기
      int choice = 0;	// choice에 정수 값 초기화
      do {
         System.out.println(message);	// message 값 출력
         choice = scanner.nextInt();	// 스캐너 값 choice에 입력
      } while(choice != 0);		// choice 값이 0이면 그만 반복한다.
   }
}
