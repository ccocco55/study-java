package classTest;

// 동물 클래스 선언

// 변수
// 이름, 나이, 체력, 먹이 개수, 먹이 종류

// 메소드
// 먹기, 산책하기

// 먹기
// 체력 1증가, 먹이 개수 1감소

// 산책
// 체력 1감소
class Pet {
   String name;
   int age;
   int hp;
   int feedCount;
   String feed;

   public Pet(String name, int age, int hp, int feedCount, String feed) {
      this.name = name;
      this.age = age;
      this.hp = hp;
      this.feedCount = feedCount;
      this.feed = feed;
   }
   
   void eat(){
      hp++;
      feedCount--;
   }
   
   void walk() {
      hp--;
   }
}

public class ClassTask04 {
   public static void main(String[] args) {
      Pet rabbit = new Pet("초롱이", 2, 10, 0, "당근");
      Pet wolf = new Pet("복실이", 4, 15, 2, "토끼");
      
      if(rabbit.feedCount > 0) {
         rabbit.eat();	// eat 메소드 실행 먹이 감소 체력 증가
         System.out.println("냠냠");
      }
      
      if(rabbit.hp > 0) {
         rabbit.walk();	// 체력 감소
         System.out.println("헉헉");
      }
   }
}













