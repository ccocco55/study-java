package homeWork01;

public class Apple {
	int price;
	String name;
	
	public Apple() {;}

	public Apple(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	
	public void service() {
		System.out.println("제공 서비스 : 기본 서비스");
	}
	
	void checkPrice() {
		System.out.println("가격은 " + price + "원 입니다.");
	}
	
	void checkName () {
		System.out.println("제품 명은" + name + "입니다.");
	}
}
