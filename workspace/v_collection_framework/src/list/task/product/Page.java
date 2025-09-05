package list.task.product;

import list.task.DBConnecter;

public class Page {
   public static void main(String[] args) {
      ProductService productService = new ProductService();
      Product product1 = new Product(1L, "모니터", 35000, 20);
      Product product2 = new Product(2L, "키보드", 75000, 12);
      
      productService.insert(product1);
      productService.insert(product2);
      
      System.out.println(DBConnecter.products.get(0).hashCode());
      System.out.println(product1.hashCode());	// DBConnecter products에있는 0번쨰 방 값이랑 product1의 해시코드 값은 같다.(해시 재정의해서)
      
//      System.out.println(DBConnecter.products.indexOf(product1));
      
   }
}
