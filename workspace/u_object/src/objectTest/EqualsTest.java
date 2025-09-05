package objectTest;

public class EqualsTest {
	public static void main(String[] args) {
		Customer customer = new Customer(1, "임채민");
		
		boolean isSame =  customer.equals(new Customer(1, "임채민"));
		
		System.out.println(isSame);
		
	}
}
