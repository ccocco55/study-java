package classTest;

public class ClassTask10 {
//   화면
//   손님이 상품을 마켓에서 구매하면
//   그 손님의 할인율에 맞게 잔액이 반영된다.
   public static void main(String[] args) {
      Customer 한동석 = new Customer("한동석", "01012341234", 10000, 30);
      Customer 조영인 = new Customer("조영인", "01055556666", 100000, 10);
      Market 이마트 = new Market("과자", 1500, 5);
      
      이마트.sell(한동석);	// 과자를 한동석에게 팔았음
      System.out.println(한동석.money);	// 한동석의 남은돈 조회
      System.out.println(이마트.stock);	// 마트에 남은 재고 조회
      
      이마트.sell(조영인);	// 과자를 조영인에게 팔았음
      System.out.println(조영인.money);	// 조영인의 남은 돈 조회
	      System.out.println(이마트.stock);	// 마트에 남은 재고 조회
	      
   }
}













