package exceptionTest;

import java.util.Scanner;

public class Chatting {
//   throws: 메소드 내에서 해당 예외를 처리하지 않고
//   메소드를 사용한 부분에서 처리할 때 사용한다.
//   하나의 메소드 내에 같은 예외가 반복해서 발생하면,
//   매번 try ~ catch문을 사용하는 것은 번거롭기 때문에
//   throws를 작성한 뒤 해당 메소드를 사용한 부분에서 
//   딱 1번만 try ~ catch문을 사용한다.
   public void chat(String message) throws BadWordException{
      if(message.contains("바보")) {
//         사용자가 비속어를 사용하면 게임을 튕기게 할 것이냐?
//         throw new BadWordException();
         
//         사용자가 비속어를 사용하면 안내메시지가 나오게 할 것이냐?
//         try {
//            throw new BadWordException();
//         } catch (BadWordException e) {
//            message = "으응~ 안돼 나쁜말";
//         }
         
         throw new BadWordException();
      }
      
//      System.out.println(message);
   }
   
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Chatting chatting = new Chatting();
      String message = "메시지: ";
      String data = null;
      
      while(true) {
         System.out.print(message);
         data = scanner.nextLine();
         try {
            chatting.chat(data);
            System.out.println(data);	// 오류가 날 수 있는 문장
            
         } catch (BadWordException e) {	// 오류 주소
            System.out.println("으응~ 안돼 나쁜말");
            
         }
      }
   }
}










