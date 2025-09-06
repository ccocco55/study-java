package homeWork01;

public class IPad extends Apple {	
	public IPad() {;}
	
	public IPad(int price, String name) {
		super(price, name);
	}

	public void service() {
		System.out.println("제공 서비스 : 펜 입력 지원");
	}
}
