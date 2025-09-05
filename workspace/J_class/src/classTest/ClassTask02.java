package classTest;

import java.util.Scanner;

// 슈퍼카 2대를 만들어야 한다.
// 모든 슈퍼카는 브랜드, 색상, 가격이 있다.
// 시동 켜기, 시동 끄기 기능이 있다.

// ※ 메소드
// 시동 켜기
// 이미 시동이 켜져있으면 "시동이 켜져있습니다" 출력
// 시동이 꺼져있으면 시동 켜기

// 시동 끄기
// 이미 시동이 꺼져있으면 "시동이 꺼져있습니다" 출력
// 시동이 켜져있으면 시동 끄기
class SuperCar {
   String brand;
   String color;
   int price;
   boolean engineCheck;

   public SuperCar(String brand, String color, int price) {
      this.brand = brand;
      this.color = color;
      this.price = price;
   }
   
   void engineStart() {
      engineCheck = true;
   }
   
   void engineStop() {
      engineCheck = false;
   }
}

public class ClassTask02 {
   public static void main(String[] args) {
      SuperCar ferrari = new SuperCar("ferrari", "red", 57000);
      String menu = "1.시동 켜기\n2.시동 끄기";
      String errorMessage1 = "이미 시동이 켜져있습니다.";
      String errorMessage2 = "이미 시동이 꺼져있습니다.";
      int choice = 0;
      Scanner scanner = new Scanner(System.in);
      
      while(true) {
         System.out.println(menu);
         choice = scanner.nextInt();
         
         if(choice == 1) {	// 사용자가 시동 켜기 선택하면
            if(!ferrari.engineCheck) {	// 시동이 안켜져 있었다면
               ferrari.engineStart();	// 시동 킴
               System.out.println(ferrari.brand + " 시동 켜짐");
               continue;
            }
            
            System.out.println(errorMessage1);	// 시동 켜져있었으면 에러 메세지 출력
         }else if(choice == 2) {
            if(ferrari.engineCheck) {	// 시동이 켜져있다면
               ferrari.engineStop();	// 시동 끄기
               System.out.println(ferrari.brand + " 시동 꺼짐");
               break;
            }
            
            System.out.println(errorMessage2);	// 이미 꺼져있었으면 에러 메세지 출력
         }
         
      }
   }
}






















