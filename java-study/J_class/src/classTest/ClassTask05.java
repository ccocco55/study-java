package classTest;

public class ClassTask05 {
//   화면
//   학생의 점수를 입력받은 뒤 총점과 평균을 출력한다.
//   학생의 점수는 생성자로 초기화한다.
//   모든 학생은 공통적으로 총점과 평균을 구할 수 있다.
   public static void main(String[] args) {
      Subject[] arSubject = { new Subject("국어", 50), new Subject("영어", 77), new Subject("수학", 98) };
      Student 한동석 = new Student(1, arSubject);
      
      System.out.println(한동석.total);	// 모든 점수의 합 
      System.out.println(한동석.average);	// 평균 점수 
   }

}
