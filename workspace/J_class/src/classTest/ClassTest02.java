package classTest;

class Car {
   String brand;
   int price;
   String color;
   
   Car(String brand, int price, String color){
      this.brand = brand;
      this.price = price;
      this.color = color;
   }
   
   Car(int price, String color){
      this.price = price;
      this.color = color;
   }
   
   Car(String color){
      this.color = color;
   }
   
   void printInfo() {	// 정보 메소드
      System.out.println(brand + ", " + price + ", " + color);
   }
}

public class ClassTest02 {
   public static void main(String[] args) {
      Car mom = new Car("Benz", 15000, "Black");
      Car daddy = new Car("Blue");
      Car mine = new Car(3000, "White");
      
      mom.printInfo();
      daddy.printInfo();
      mine.printInfo();
   }
}






