package interfaceTest;

public class Puppy implements Animal {	// Animal 인터페이스 받아옴

	@Override
	public void showHands() {
		System.out.println("멍");
	}

	@Override
	public void sitDown() {
		System.out.println("멍멍");
		
	}

	@Override
	public void poop() {
		System.out.println("멍멍멍");
		
	}

	@Override
	public void waitNow() {
		System.out.println("ㅜㅜ");
		
	}
	
}
