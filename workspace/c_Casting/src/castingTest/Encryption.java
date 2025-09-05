package castingTest;	

public class Encryption {	
	   public static void main(String[] args) {	
		      String password = "ehdtjrdl1234";	// password에 문자열 값 입력
		      String encryptedPassword = "", decryptedPassword = "";	// encryptedPassword, decryptedPassword 값 초기화
		      final int KEY = 3;	// KEY 정수 값 입력
		      
		      for (int i = 0; i < password.length(); i++) {
		         encryptedPassword += (char)(password.charAt(i) * KEY);
		      }
		      
		      System.out.println(encryptedPassword);	// encryptedPassword값 출력
		      
		      for (int i = 0; i < encryptedPassword.length(); i++) {
		         decryptedPassword += (char)(encryptedPassword.charAt(i) / KEY);
		      }
		      
		      System.out.println(decryptedPassword);	//decryptedPassword 값 출력
}
}
