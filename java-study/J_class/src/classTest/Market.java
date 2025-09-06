package classTest;

public class Market {
   String name;
   int price;
   int stock;

   public Market(String name, int price, int stock) {
      this.name = name;
      this.price = price;
      this.stock = stock;
   }
   
   void sell(Customer customer) {
      customer.money -= this.price * (1 - customer.discount / 100.0);	// 손님의 돈은 가격에서 할인 후 원래 있던 돈에 뺸 가격  
      stock--;	// 재고 감소
   }
}
