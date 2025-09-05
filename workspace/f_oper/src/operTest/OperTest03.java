package operTest;

public class OperTest03 {
   public static void main(String[] args) {
      int data = 10;	// data에 정수 값 10 저장
      data = data + 1;	// data에 data + 1
      System.out.println(data++); 	// 후위형으로 증감 data 출력
      System.out.println(++data);	// 전위형으로 증감 data 출력
   }
}

