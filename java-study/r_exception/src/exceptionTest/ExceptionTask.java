package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
   public static void main(String[] args) {
//      정수 입력받기
//      5칸 배열을 만들어서 해당 인덱스에 입력받은 정수를 담는다.
      Scanner scanner = new Scanner(System.in);
      int[] arData = new int[5];
      String message = "번째 정수: ";
      int count = 0;
      String temp = null;
            
//      5개까지만 담을 수 있다.
//      6번째 정수가 담기면 오류가 발생한다.
//      단, q를 입력하면 입력을 중단해준다.
//      if문은 딱 한 번만 사용하기(q 입력 시 나가기)
      
//      오류 상황
//      6번째 정수를 입력했을 때
//      정수가 아닌 다른 것을 입력했을 때(q 제외)
      while(true) {
         System.out.print(++count + message);
         temp = scanner.next();
         
         if(temp.equals("q")) {	// 사용자가 q를 입력하면
            break;	// 종료
         }
         
         try {
            arData[count -1] = Integer.parseInt(temp);	// 오류가 날 수 있는 문장
         } catch (NumberFormatException e) {	// 다른 문자열을 입력했을때 오류주소
            System.out.println("정수만 입력하세요!");
            count--;	// 카운트 원상복구
            /*
             * } catch (ArrayIndexOutOfBoundsException e) {
             * System.out.println("더이상 입력하실 수 없습니다."); break; } catch (Exception e) {
             * System.out.println("다시 시도해주세요."); count--;
             */
         } finally {
            for (int i = 0; i < arData.length; i++) {
               System.out.println(arData[i]);	// 사용자가 입력한 배열 출력
            }
         }
      }
      
   }
}













