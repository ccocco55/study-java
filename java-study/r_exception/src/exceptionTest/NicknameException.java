package exceptionTest;

public class NicknameException extends Exception{
   public NicknameException() {;}
   
   public NicknameException(String message) {
      super(message);
   }
}
