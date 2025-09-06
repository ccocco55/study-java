package stringTest;

public class StringTest03 {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		String message = null;
		
		stringBuilder.append("이름: ");
		stringBuilder.append("한동석");
		
		message = stringBuilder.toString();
		
		System.out.println(message);
	}
}
