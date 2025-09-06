package exceptionTest;

// Exception 상속: 컴파일러가 체크(컴파일 오류), try ~ catch문을 강제한다, 강제종료 시키면 안된다!
// RuntimeException 상속: 컴파일러가 체크하지 않음(빌드 오류 또는 런타임 오류), 강제 종료 시켜야한다!
public class BadWordException extends Exception {
   public BadWordException() {;}
   
   public BadWordException(String message) {
      super(message);
   }
   
}
