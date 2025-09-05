package classTest;

public class GameShop {
String item;
int price;
int stock;

public GameShop(String item, int price, int stock) {
	super();
	this.item = item;
	this.price = price;
	this.stock = stock;
}

void sell(Player player) {
	player.gamemoney -= this.price * (1 - player.discount / 100.0);	// 각 플레리어에 할인율 적용 후 각 플레이어의 게임머니에서 차감
	stock--;	// 재고 -1
}


}
