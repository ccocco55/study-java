package interfaceTest;

public class Cat implements Animal{	// Animal 인터페이스 받아옴

	@Override
	public void showHands() {
		System.out.println("?");
		
	}

	@Override
	public void sitDown() {
		System.out.println("?");
		
	}

	@Override
	public void poop() {
		System.out.println("냥");
		
	}

	@Override
	public void waitNow() {
		System.out.println("?");
		
	}

}
