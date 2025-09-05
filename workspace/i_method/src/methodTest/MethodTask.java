package methodTest;

import java.util.Iterator;
import java.util.Scanner;

public class MethodTask {
////   1 ~ 10까지 println()으로 출력하는 메소드
//   void printFrom1To10(){
//      for (int i = 0; i < 10; i++) {
//         System.out.println(i + 1);
//      }
//   }
//   
////   "홍길동"을 n번 println()으로 출력하는 메소드
//   void printHong(int n){
//      for (int i = 0; i < n; i++) {
//         System.out.println("홍길동");
//      }
//   }
//   
////   이름을 n번 println()으로 출력하는 메소드
//   void printName(String name, int n){
//      for (int i = 0; i < n; i++) {
//         System.out.println(name);
//      }
//   }
   
//   세 정수의 뺄셈 메소드
//   int subtract(int number1, int number2, int number3){
//      return number1 - number2 - number3;
//   }
   
//   int subtract(int[] arNumber){
//      int result = 0;
//      
//      arNumber[0] *= -1;
//      
//      for (int i = 0; i < arNumber.length; i++) {
//         result -= arNumber[i];
//      }
//      return result;
//   }
   
////   두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
////   return 값은 반드시 1개만 가능하다.
//   int[] divide(int number1, int number2){
//      int[] arResult = new int[2];
//      
//      if(number2 != 0) {
//         arResult[0] = number1 / number2;
//         arResult[1] = number1 % number2;
//         return arResult;
//      }
//      
//      return null;
//   }
   
////   1 ~ n까지의 합을 구해주는 메소드
//   int getTotal(int n){
//      int result = 0;
//      for (int i = 0; i < n; i++) {
//         result += i + 1;
//      }
//      return result;
//   }
   
////   문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//   String changeABC(String content){
//      String result = "";
//      
//      for (int i = 0; i < content.length(); i++) {
//         char c = content.charAt(i);
//         
//         if(c >= 97 && c <= 122) {	//만약 대문자면
//            result += (char)(c - 32);	// 소문자로 변환
//            
//         }else if(c >= 65 && c <= 90) {	//만약 소문자면
//            result += (char)(c + 32);	// 대문자로 변환
//            
//         }else {
//            result += c;
//         }
//      }
//      
//      return result;
//   }
   
////   한글을 정수로 바꿔주는 메소드
////   일공이사 -> 1024
//   int changeToInteger(String data){
//      String hangeul = "공일이삼사오육칠팔구";
//      String temp = "";
//      
//      for (int i = 0; i < data.length(); i++) {
//         temp += hangeul.indexOf(data.charAt(i));	// 데이터에 있는 숫자들을 한글 문자열에서 찾아서 그 번호를 temp에 넣어주기
//      }
//      
//      return Integer.parseInt(temp);
//   }
   
////   정수를 한글로 바꿔주는 메소드
////   1024 -> 일공이사
//   String changeToHangeul(int number){
//      String hangeul = "공일이삼사오육칠팔구";
//      String result = "";
//      
//      while(number != 0) {
//         result = hangeul.charAt(number % 10) + result;	// 숫자가 0이 될때까지 나눈 나머지를 하나씩 불러와서 한글 문자열이랑 비교후 결과 값어 넣어주기
//         number /= 10;	// 10씩 정수 나눠주기
//      }
//      
//      return result;
//   }
   
////   문자열과 문자를 입력받고 해당 문자가 몇 개 있는지 구하기
////   입력 예) banana, a
////   출력 예) 3
//   int getCount(String content, char c){
//      int count = 0;
//      for (int i = 0; i < content.length(); i++) {
//         if(content.charAt(i) == c) {	// c와 같은 문자가 있다면, 
//            count ++;	// count 개수 + 1
//         }
//      }
//      return count;
//   }
   
////   1~100을 입력받고 짝수만 리턴하는 메소드
//   int[] getEven(int[] arData){
//      int[] arEven = new int[50];
//      for (int i = 0; i < arEven.length; i++) {
//         arEven[i] = arData[i * 2 + 1];	// 배열에서 짝수만 arEven에 담기
//      }
//      return arEven;
//   }
   
//   숙제
//   문제 5개 만들어서 풀어오기
   
   
//   1. 5개의 정수를 입력받고 배열에 담은 후 최대값 리턴하는 메소드
   
   int alphabet(int[] arNumber) {
	   int max = 0;
	   max = arNumber[0];
	   
	   for (int i = 1; i < arNumber.length; i++) {
		max = max > arNumber[i] ? max : arNumber[i];
	}
	   return max;
   }
   
   
//   2. 3자리 숫자 받아서 00n.png 리턴하는 메소드
   
   String png(int n) {
	   String fileName = "" + n + ".png";
	   String zero = "";
	   
		if (n / 10 < 1) {
			zero = "00";
			fileName = zero + fileName;
		} else if (n / 10 < 10) {
			zero = "0";
			fileName = zero + fileName;
		} 		
		return fileName;
   }
   
   
   
//   3. 아래의 주소들을 배열에 담고, 마지막 경로가 samsung인 것만 출력하기
//	 www.naver.com/baseball/samsung
//	 www.naver.com/baseball/lg
//	 www.naver.com/baseball/lotte
//	 www.naver.com/baseball/kt
//	 www.naver.com/phone/samsung
   
   	void urlPrint(String[] arUrl) {
   		String target = "samsung";
   		
        for (int i = 0; i < arUrl.length; i++) {
       	 String[] arAaddress = arUrl[i].split("/");
       	 if (arAaddress[arAaddress.length - 1].equals(target)) {
   				System.out.println(arUrl[i]);
       	 }
        }
   	}
   	
   	
 //	4. 입력된 문자열에서 모음(a, e, i, o, u)의 개수를 반환하는 메서드를 작성
 // 대소문자 구분 없이 처리
 // 메서드 이름: countVowels

 // 예시 입력: countVowels("Hello World")
 // 예시 출력: 3
   	
   	int countVowels(String text) {
   		String vowels = "aeiouAEIOU";
   		
   		int count = 0;
   		
   		for (int i = 0; i < text.length(); i++) {
   			char ch = text.charAt(i);
			if ( vowels.indexOf(ch) != -1){
				count++;
			}
		}
   		return count;
   	}
   	
   	
//   5. 정수 n을 받아 n단 구구단 메소드 작성하기
//   	예) 2  => 2x1 = 2, 2x2 = 4...
   	
   	String getMult(int n) {
   		int mult = 0;
   		String result = "";
   		for (int i = 0; i < 9; i++) {
			mult = n * (i + 1);
			result += String.format("%d * %d = %d\n", n, (i + 1), mult);
		}
   		return result;
   	}
   	
//  두 정수를 입력받고 두 정수 사이의 수를 모두 합한다.
//  단, 양수만 가능
  int getTotalFromStartToEnd(int firstNumber, int lastNumber){
     if(firstNumber > lastNumber) {
        return getTotal(lastNumber, firstNumber);
     }
     
     return getTotal(firstNumber, lastNumber);
     
  }
  
//  n~m까지의 합
  int getTotal(int start, int end){
     int result = 0;
     for (int i = start + 1; i < end; i++) {
        result += i;
     }
     
     return result;
  }
  
  
  //   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
  void getMaxAndMin2(int[] arData, int[] result){
     
     for (int i = 0; i < result.length; i++) {
        result[i] = arData[0];
     }
     
     for (int i = 1; i < arData.length; i++) {
        if(result[0] < arData[i]) {
           result[0] = arData[i];
        }
        if(result[1] > arData[i]) {
           result[1] = arData[i];
        }
     }
  }
   	
   
   
   
   public static void main(String[] args) {
//      메소드를 선언했다면, 반드시 사용해서 테스트한다.
      
      Scanner scanner = new Scanner(System.in);
      
      MethodTask methodTask = new MethodTask();
//      methodTask.printFrom1To10();
//      methodTask.printHong(10);
      
//      String message = "이름: ";
//      System.out.print(message);
//      methodTask.printName(scanner.next(), 5);
      
//      int[] arNumber = {3, 4, 1};
//      int result = methodTask.subtract(arNumber);
//      System.out.println(result);
      
//      int[] arResult = methodTask.divide(10, 3);
//      
//      if(arResult == null) {
//         System.out.println("0으로 나눌 수 없습니다.");
//      }else {
//         System.out.println("몫: " + arResult[0]);
//         System.out.println("나머지: " + arResult[1]);
//      }
      
//      int result = methodTask.getTotal(10);
//      System.out.println(result);
      
//      String result = methodTask.changeABC("aBcDefff!@#!@#123");
//      System.out.println(result);
      
//      int result = methodTask.changeToInteger("공공공공공공공일");
//      System.out.println(result);
      
//      String data = methodTask.changeToHangeul(48125750);
//      System.out.println(data);
      
//      int count = methodTask.getCount("banana", 'z');
//      System.out.println(count);
      
//      int[] arData = new int[100];
//      int[] arEven = null;
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//      }
//      
//      arEven = methodTask.getEven(arData);
//      
//      for (int i = 0; i < arEven.length; i++) {
//         System.out.println(arEven[i]);
//      }
      
//      Scanner scanner = new Scanner(System.in);
      
      
      
//    숙제 1
      int[] arNumber = new int[5];
      int number = 0;
      
      String message = "5개의 정수를 입력하세요.";

      System.out.println(message);
      
      for (int i = 0; i < arNumber.length; i++) {
    	 arNumber[i] = scanner.nextInt();
		number = methodTask.alphabet(arNumber);
      }
      System.out.println(number);
      
      
      
      
////      숙제 2
//      int n = 0;
//      
//      String message = "최대 3자리 수를 입력하세요.";    		  
//      System.out.println(message);
//      
//      n = scanner.nextInt();
//      
//      String check = methodTask.png(n);      
//      
//      System.out.println(check);
      
      
////      숙제 3
//      
//      String [] arData = {"www.naver.com/baseball/samsung",
//    		  				"www.naver.com/baseball/lg",      
//    		  				"www.naver.com/baseball/lotte",
//    		  				"www.naver.com/baseball/kt",
//    		  				"www.naver.com/phone/samsung"};
//     
//      methodTask.urlPrint(arData);
          
      
////      숙제 4
//      
//      String message = "대소문자 관계없이 문장을 작성하세요.";
//      int count = 0;
//      
//      System.out.println(message);
//      
//      message = scanner.next();
//      
//      count = methodTask.countVowels(message);
//      
//     System.out.println(count);
      
//      숙제 5
      
//      int number = 0;
//      String result = "";
//      
//      String message = "구구단의 단수를 알고 싶은 정수를 입력해 주세요.";
//      System.out.println(message);
//      
//      number = scanner.nextInt();
//      result = methodTask.getMult(number);
//      
//      System.out.println(result);
      
      
      int[] result = new int[2];
      methodTask.getMaxAndMin2(new int[] {3, 5, 1, 2, 6}, result);
      for (int i = 0; i < result.length; i++) {
         System.out.println(result[i]);
      }
      
      
      
      
   }
}
