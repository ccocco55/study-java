package classTest;

// 동물이 3마리 있다.
// 모든 동물은 이름, 나이, 성별이 있다.
// 3마리 동물은 각자 자기소개를 할 수 있다.
// 클래스를 활용하여 3마리 동물이 자기소개할 수 있게 구현한다.

class Animal{
   String name;
   int age;
   String gender;
   
   public Animal(String name, int age, String gender) {
      this.name = name;
      this.age = age;
      this.gender = gender;
   }

   void introduce() {	// 소개 메소드 작성
      System.out.println("안녕, 내 이름은 " + name + "이야");
      System.out.println("난 " + age + "살이야");
      System.out.println("그리고 난 " + gender + "야^^");
   }
}

public class ClassTask01 {
   public static void main(String[] args) {
      Animal tiger = new Animal("랑이", 3, "수컷");
      Animal duck = new Animal("꽥꽥이", 5, "암컷");
      Animal dog = new Animal("바둑이", 3, "수컷");
      
      tiger.introduce();	// 메소드 사용
      duck.introduce();
      dog.introduce();
   }
}









