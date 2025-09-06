package classTest;

public class Cupang {
int price;
int total;

public Cupang(int price) {
	this.price = price;
	this.total = total;
}

void calculate(Box box) {
	total = (box.kg * price);	// total은 키로 * 가격
}

}
