package order;

import java.util.ArrayList;
import java.util.Arrays;

public class Fillter {
	public static void main(String[] args) {
		Order[] arOrder = {
				new Order("12345678", "임채민", 20000),
				new Order("23456789", "어쩌구", 100000),
				new Order("34567890", "저쩌구", 200000)
		};
		ArrayList<Order> orders = new ArrayList<Order>(Arrays.asList(arOrder));
		
		orders.stream().filter(order -> order.getPrice() >= 100000).forEach(System.out::println);;
		
		

	}
}
