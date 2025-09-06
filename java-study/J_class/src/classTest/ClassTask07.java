package classTest;

public class ClassTask07 {
//   화면
   
//   상품을 여러개 주문한다.
   
//   상품 클래스
//   상품명
//   상품 가격
//   상품 재고
   
//   주문 클래스
//   주문 번호
//   상품들
   
//   주문할 때 결제할 총 금액을 계산할 수 있다.
   
   
   public static void main(String[] args) {
      Product[] arProduct = {
            new Product("핸드폰", 550_000, 2),
            new Product("맥북", 1_250_000, 0),
            new Product("아령", 40_000, 3)
      };
      
      Order order = new Order(1, arProduct);	// 아이디 1번, 상품 배열 
      
      System.out.println(order.price);
      
      for (int i = 0; i < arProduct.length; i++) {
         System.out.println(arProduct[i].stock);	// 상품배열의 모든 재고 조회
      }
   }
}
















