package methodTest;

// main 메소드
// 개발자가 직접 사용하지 않고, 컴파일러가 대신 사용해준다.
// 외부에서 해당 프로그램을 명령어로 사용할 때,
// 옵션을 붙이거나 또는 네트워크 정보를 전달받아야 하는 상황에서
// args라는 매개변수를 활용하여 프로그램을 제작할 수 있다.
// 현재 과정에서는 불필요한 내용이다!
public class MainTest {
   public static void main(String[] args) {
      if(args!= null && args.length != 0) {	// 배열이 비어있거나 0이 아니면
         for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);	// 배열 i 번째 방 출력
         }
      }else {
         System.out.println("옵션 없음");
      }
   }
}
