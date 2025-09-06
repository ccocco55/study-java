package lambdaTest;

public class LambdaTest {
   public static void main(String[] args) {
//      LambdaInter lambdaInter = new LambdaInter() {
//         
//         @Override
//         public boolean checkMultipleOf10(int number) {
//            return number % 10 == 0;	// 10으로 나눈 나머지 리턴값
//         }
//      };
      
//      (1)
//      LambdaInter lambdaInter = (number) -> number % 10 == 0;
//      (2)
//      LambdaInter lambdaInter = (number) -> {
//         System.out.println("10의 배수인가요?");
//         return number % 10 == 0;
//      };
//      (3)
//      LambdaInter lambdaInter = number -> number % 10 == 0;
//      (4)
//      LambdaInter lambdaInter = number -> {
//         System.out.println("10의 배수인가요?");
//         return number % 10 == 0;
//      };
//      
//      System.out.println(lambdaInter.checkMultipleOf10(30));
//            
	   
	   LambdaInter lambdaInter = n -> n % 10 == 0;
	   System.out.println(lambdaInter.checkMultipleOf10(40));
}
}











