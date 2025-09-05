package homeWork01;

public class AppleManager {
	void provideService(Apple apple) {
		if (apple instanceof IPhone) {
			apple.service();
		}
		else if (apple instanceof IPad) {
			apple.service();
		}
		else if (apple instanceof MacBook) {
			apple.service();
		}
		else {
			apple.service();
		}
	}
	public static void main(String[] args) {
		AppleManager appleManager = new AppleManager();
		Apple apple = new Apple();
		
		Apple iPadAir5 = new IPad(819000, "iPad Air 5");
		Apple iPhone16Pro = new IPhone(1620_000, "iPhone 16 Pro");
		Apple macBookProM4 = new MacBook(4219000, "MacBook Pro M2");
		
		Apple iPad10th = new Apple(530_000, "iPad10th");
		Apple macBookAirM1 = new Apple(2200000, null);
		
		iPadAir5.checkName();
		iPadAir5.checkPrice();
		appleManager.provideService(iPadAir5);
		
		iPhone16Pro.checkName();
		iPhone16Pro.checkPrice();
		appleManager.provideService(iPhone16Pro);
		
		macBookProM4.checkName();
		macBookProM4.checkPrice();
		appleManager.provideService(macBookProM4);
		
		appleManager.provideService(iPad10th);
		appleManager.provideService(macBookAirM1);
		
	}
}
