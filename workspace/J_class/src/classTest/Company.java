package classTest;

public class Company {
   int id;
   String name;
   Department[] arDepartment;

   int total;
   double average;
   
   public Company(int id, String name, Department[] arDepartment) {
      this.id = id;
      this.name = name;
      this.arDepartment = arDepartment;
      for (int i = 0; i < arDepartment.length; i++) {
         total += arDepartment[i].income;	// 부서의 수입을 total에 하나씩 더해주기
      }
      this.average = (double)total / arDepartment.length;	// 회사 수입의 평균
   }
   
   
}