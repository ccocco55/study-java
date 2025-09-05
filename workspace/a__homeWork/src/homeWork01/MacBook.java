package homeWork01;

public class MacBook extends Apple{
	
	public MacBook() {;}
	
	public MacBook(int price, String name) {
		super(price, name);
	}

	public void service() {
		System.out.println("제공 서비스 : 게이밍 모드 지원");
	}
}
