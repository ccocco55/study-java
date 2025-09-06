package classTest;

public class ClassTask11 {
// 화면
//	온라인 게임 아이템 구매
	
//	게임샵
//	아이템이름
//	가격
//	재고
//	
//	플레이어
//	닉네임
//	게임머니
//	할인율
	
	public static void main(String[] args) {
		Player player1 = new Player("dkssud", 20000, 10);
		Player player2 = new Player("slrspdla", 5000, 50);
		GameShop gameShop = new GameShop("칼", 200, 10);
		
		gameShop.sell(player1);	// gameShop에서 sell메소드 사용
		System.out.println(player1.gamemoney);
		System.out.println(gameShop.stock);
		
		gameShop.sell(player2);	// gameShop에서 sell메소드 사용
		System.out.println(player2.gamemoney);
		System.out.println(gameShop.stock);
		
	}
}
