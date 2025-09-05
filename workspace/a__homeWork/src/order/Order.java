package order;

import java.util.Objects;

public class Order {
//	주문번호, 고객명, 주문금액, 주문날짜
	String orderNumber;
	String name;
	int price;

	public Order() {;}
	
	public Order(Order order) {
		this(order.getOrderNumber(), order.getName(), order.getPrice());
	}

	public Order(String orderNumber, String name, int price) {
		super();
		this.orderNumber = orderNumber;
		this.name = name;
		this.price = price;

	}

	protected String getOrderNumber() {
		return orderNumber;
	}

	protected void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getPrice() {
		return price;
	}

	protected void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", name=" + name + ", price=" + price + ",]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
}
