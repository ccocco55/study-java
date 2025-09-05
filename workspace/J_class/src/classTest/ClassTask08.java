package classTest;

public class ClassTask08 {
   
//   화면
   
//   회원마다 여러 종류의 운동을 한다.
//   진행한 운동마다 칼로리를 기록한다.
//   이 때, 회원들은 각각 운동한 총 칼로리를 계산할 수 있다.
   
//   회원(User)
//   회원번호
//   이름
//   나이
   
//   운동(Exercise)
//   종목명
//   칼로리(정수)
   
   public static void main(String[] args) {
	   Exercise[] arExerscise = {
    		  new Exercise("달리기", 100), new Exercise("웨이트", 300)
      };
      
      User user = new User(12345, "홍길동", 22, arExerscise);
      
      System.out.println(user.totalCal);	// 유저가 운동한 총 칼로리 계산
   }
}
