package homeWorkException;

public class BadWord extends Exception{
	public BadWord() {;}
	
	public BadWord (String message) {
		super(message);
	}
}
