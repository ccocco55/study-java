package staticTest;

public class Gangnam {
   public static void main(String[] args) {
      Company 한동석 = new Company("한동석", 1000);
      Company 김태민 = new Company("김태민", 3000);
      Company 구민경 = new Company("구민경", 5000);
      
      Company.totalIncome += 한동석.income;
      Company.totalIncome += 김태민.income;
      Company.totalIncome += 구민경.income;
      
      
      System.out.println(Company.totalIncome);
      
      System.out.println(한동석.id);
      System.out.println(김태민.id);
      System.out.println(구민경.id);
   }
}
