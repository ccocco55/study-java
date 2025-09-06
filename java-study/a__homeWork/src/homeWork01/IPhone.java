package homeWork01;

public class IPhone extends Apple {	
	public IPhone() {;}

	public IPhone(int price, String name) {
		super(price, name);
	}
	
	@Override
	public void service() {
		System.out.println("제공 서비스 : 5G 연결");
	}
}
