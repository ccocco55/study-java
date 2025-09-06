package classTest;

public class Order {
   int id;
   Product[] arProduct;
   int price;

   public Order(int id, Product[] arProduct) {
      this.id = id;
      this.arProduct = arProduct;
      for (int i = 0; i < arProduct.length; i++) {
         if(arProduct[i].stock < 1) {	// 재고가 1보다 작으면
            continue;	// 건너 뛰기
         }
         this.price += arProduct[i].price;	// 값은 재품 배열 안에 들어가있는 값이다.
         arProduct[i].stock--;	// 재고 - 1
      }
   }
}
