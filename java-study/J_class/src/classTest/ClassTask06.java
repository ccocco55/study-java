package classTest;

public class ClassTask06 {
//   부서별 매출 관리
//   부서는 여러개다
   
//   회사 클래스
//   회사 고유 번호
//   부서 이름
//   부서 매출
   
//   회사는 부서 총 매출과 평균 매출을 구할 수 있다.
   public static void main(String[] args) {
      Department[] arDepartment = {	// 부서 배열 만들기
            new Department("개발", 3000),
            new Department("기획", 3500)
      };
      Company company = new Company(1, "네이버", arDepartment);	// 회사 안에 부서배열 
      
      System.out.println(company.total);
      System.out.println(company.average);
   }
}
