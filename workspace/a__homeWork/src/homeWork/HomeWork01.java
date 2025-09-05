package homeWork;

import java.util.Iterator;
import java.util.Scanner;

public class HomeWork01 {
	public static void main(String[] args) {
		
		
////    1. 1 ~ 10까지 배열에 담고 출력
//		
//		int[] arData = new int[10];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
//		for (int i = 0; i < arData.length; i++) {			
//			System.out.println(arData[i]);
//		}
		
		
		
////		1.1 4 ~ 18까지 배열에 담고 출력
//		
//		int[] arData = new int[15];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 4;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
		
////	2.	10 ~ 1까지 중 짝수만 배열에 담고 출력
//		
//		int[] arData = new int[5];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (5 - i) * 2;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
		
////		2.1 100 ~ 50 까지 중 짝수만 배열에 담고 출력
//		
//		int[] arData = new int[26];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (50 - i) * 2;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
		
////	3.	1 ~ 100까지 배열에 담은 후 홀수만 출력
//		
//		int[] arData = new int[100];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i * 2]);
//		}
		
		
		
////		3.1 250 ~ 450 까지 배열에 담은 후 홀수만 출력
//
//		int[] arData = new int[200];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 250;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i * 2] + 1);
//		}
		
		
		
////		4. 001.png ~ 010.png 를 배열에 담고 출력
//		
//		String[] arData = new String[10];
//		
//		for (int i = 0; i < arData.length; i++) {
//			String zero = "";
//			String fileName = "";
//			if ((i + 1) / 10 < 1) {
//				zero = "00";
//			}
//			else if ((i + 1) / 10 < 10) {
//				zero = "0";
//			}
//			
//			fileName += zero;
//			fileName += i + 1;
//			fileName += ".png";
//			
//			arData[i] = fileName;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
		
////		4.1	3자리 숫자 받아서 001.png 출력하기
//				
//		Scanner scanner = new Scanner(System.in);
//		String[] arData = new String[3];
//		String message = "3자리 숫자를 입력하세요. \n예) 3 5 7";
//				
//		System.out.println(message);
//		
//		for (int i = 0; i < arData.length; i++) {
//			String png = ".png";
//			String number = "" + scanner.nextInt();
//			
//			arData[i] = number + png;
//			
//	         if (arData[i].length() == 5) {
//				arData[i] = "00" + arData[i];
//	         } else if (arData[i].length() == 6) {
//	        	 arData[i] = "0" + arData[i];
//			}
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
		
////      5.	1 ~ 100까지 배열에 담은 후 짝수의 합 출력
//		
//		int[] arData = new int[100];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i * 2 + 1]);
//		}
		
		
		
////     6. A ~ F까지 배열에 담고 출력
//		
//		char[] arData = new char[6];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i + 65);
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
		
////      7. A ~ F까지 중 C를 제외하고 배열에 담은 후 출력
//
//		char[] arData = new char[5];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i > 1 ? i + 66 : i + 65);
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
		
////		7.1 A ~ F까지 중 E를 제외하고 배열에 담은 후 출력
//		
//		char[] arData = new char[5];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i > 3 ? i + 66 : i + 65);
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
		
//  	5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//   	단, 같은 수는 없다고 가정한다.
		
		int[] arData = new int[5];
		int min = 0;
		int max = 0;
		
		Scanner scanner = new Scanner(System.in);
		String message = "5개의 정수를 입력하세요";
		
		System.out.println(message);
		
		for (int i = 0; i < arData.length; i++) {
			arData[i] = scanner.nextInt();
			
			min = arData[0];
			max = arData[0];
		}
		for (int i = 1; i < arData.length; i++) {
			
		}
		System.out.println(min);
		System.out.println(max);
		
		
		
		
		
		
		
		
	}
}
