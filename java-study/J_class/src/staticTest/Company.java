package staticTest;

public class Company {
   int id;
   static int seq;
   
   String name;
   int income;
   static int totalIncome;

//   static 블록
//   최초 1번만 실행
   static {
      seq = 0;
   }
   
//   초기화 블록
//   생성자가 호출될 때마다 실행
   {
      id = ++seq;
   }
   
   public Company() {
   }
   
   public Company(int income) {
      this.income = income;
   }

   public Company(String name, int income) {
      this.name = name;
      this.income = income;
   }
}
















