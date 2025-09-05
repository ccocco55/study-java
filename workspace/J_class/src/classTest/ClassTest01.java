package classTest;

class A {
//   전역 변수(global variable)
//   자동 초기화
//   프로그램 종료 시 메모리 해제
   int data;
   
//   기본 생성자
   A(){
      System.out.println("생성자 호출");
   }

   void printData() {
//      지역 변수(local variable)
//      직접 초기화
//      해당 영역이 끝날 때
      int data = 10;
      
//      System.out.println(this);
      
      System.out.println(data);
      System.out.println(this.data);
   }
}

public class ClassTest01 {
//   프로그램을 만들어주는 메소드
   public static void main(String[] args) {
      A a1 = new A();
      A a2 = new A();
      
      a1.data = 100;
//      System.out.println(a1);
      a1.printData();
      
      a2.data = 20;
//      System.out.println(a2);
      a2.printData();
   }
}







