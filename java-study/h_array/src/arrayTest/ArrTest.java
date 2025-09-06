package arrayTest;

public class ArrTest {
   public static void main(String[] args) {
      int[][] arrData = { { 3, 4, 5 }, { 7, 8, 9 } };	// 2중 배열

//      int rowLength = arrData.length;
//      int colLength = arrData[0].length;
//      int length = rowLength * colLength;

//      for (int i = 0; i < length; i++) {
//         System.out.println(arrData[i / 3][i % 3]);
//      }

      for (int i = 0; i < arrData.length; i++) {	// 행의 반복
         for(int j = 0; j < arrData[i].length; j++) {	// 열의 반복
            System.out.println(arrData[i][j]);	// 행과 열에 있는 모든 값 출력
         }
      }
   }
}
