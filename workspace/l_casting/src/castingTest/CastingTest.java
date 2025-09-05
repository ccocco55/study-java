package castingTest;

class Car {
	String brand;
	String color;
	int price;
	
	public Car() {;}
	
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	void engineStart() {
		System.out.println("열쇠로 시동 켜기");
	}
	
	void engineStop() {
		System.out.println("열쇠로 시동 끄기");
	}
}

class SuperCar extends Car{
	String mode;
	
	public SuperCar() {;}

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 켜기");
	}
	
	void openRoop() {
		System.out.println("뚜껑 열림");
	}
	
	void closeRoop() {
		System.out.println("뚜껑 닫힘");
	}
	
}

public class CastingTest {
	public static void main(String[] args) {
		Car matiz = new Car("마티즈", "황금색", 300);
		SuperCar ferrari = new SuperCar("페라리", "빨간색", 750_000_000, "Sport");
		
//		up casting
		Car noOptionFerrari = new SuperCar("페라리", "빨간색", 750_000_000, "Sport");	// 업 캐스팅
//		noOptionFerrari.engineStart();
		
//		오류
//		SuperCar brokenFerrari = (SuperCar) new Car();
		
//		down casting
		SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;	// 다운 캐스팅
//		fullOptionFerrari.openRoop();
		
		System.out.println(matiz instanceof Car);
		System.out.println(matiz instanceof SuperCar);
		System.out.println(ferrari instanceof Car);
		System.out.println(ferrari instanceof SuperCar);
		System.out.println(noOptionFerrari instanceof Car);
		System.out.println(noOptionFerrari instanceof SuperCar);
		System.out.println(fullOptionFerrari instanceof Car);
		System.out.println(fullOptionFerrari instanceof SuperCar);
	}
}

















