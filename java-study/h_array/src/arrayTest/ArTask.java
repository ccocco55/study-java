package arrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class ArTask {
   public static void main(String[] args) {
//      1 ~ 10까지 배열에 담고 출력
//      int[] arData = new int[10];	// 배열의 개수 10개
//      
//      for (int i = 0; i < arData.length; i++) {	
//         arData[i] = i + 1;	// 배열에 1- 10 담기
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);	// 출력
//      }
      
//      10 ~ 1까지 중 짝수만 배열에 담고 출력
//      int[] arData = new int[5];
//      
//      for (int i = 0; i < 5; i++) {
//         arData[i] = (5 - i) * 2;	//짝수만 배열에 담기
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);	// 출력
//      }
      
//      1 ~ 100까지 배열에 담은 후 홀수만 출력
//      int[] arData = new int[100];	// 배열의 개수는 100개
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;	// 배열에 100까지 담기 0부터 시작이니까 + 1
//      }
//      
//      for (int i = 0; i < 50; i++) {
//         System.out.println(arData[i * 2]);	// 출력
//      }
      
//      (1) 001.png ~ 010.png 를 배열에 담고 출력

//      i / 10 < 1      : 00
//      i / 10 < 10      : 0
//      i / 10 < 100   : 
      
//      String[] arData = new String[10];	// 배열의 개수 10개
//      
//      for (int i = 0; i < 10; i++) {
////         매 반복마다 이전 값을 초기화 해준다.
//         String fileName = "";
//         String zero = "";
//         
////         1의 자리수는 앞에 0을 2개 붙인다.
//         if ((i + 1) / 10 < 1) {
//            zero = "00";
//         } else if ((i + 1) / 10 < 10) {
////            10의 자리수는 앞에 0을 1개 붙인다.
//            zero = "0";
//         }
//         
////         만약 위의 조건식이 모두 false이면 zero에는 초기값인 ""이 들어있다.
////         100의 자리수는 앞에 0을 붙이지 않는다.
//         
////         앞에 붙여야 할 0을 붙여준다.
//         fileName += zero;
////         이미지 번호를 붙여준다.
//         fileName += i + 1;
////         확장자를 붙여준다.
//         fileName += ".png";
////         각 파일의 이름을 배열에 담아준다.
//         arData[i] = fileName;
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }

//      (2) 001.png ~ 010.png 를 배열에 담고 출력
//      String[] arData = new String[10];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1 + ".png";
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         switch(arData[i].length()) {
//         case 5:
//            arData[i] = "00" + arData[i];
//            break;
//         case 6:
//            arData[i] = "0" + arData[i];
//            break;
//         }
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
      
//      (3) 001.png ~ 010.png 를 배열에 담고 출력
//      String[] arData = new String[10];
//      
//      for (int i = 0; i < 10; i++) {
//         arData[i] = String.format("%03d.png", i + 1);
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
      
	   
	   
	   
	   
	   
	   
//      1 ~ 100까지 배열에 담은 후 짝수의 합 출력
	   
//     int[] arData = new int[100];
//     int total = 0;
//     
//     for (int i = 0; i < arData.length; i++) {
//        arData[i] = i + 1;	// 1-100 배열에 담기
//     }
     
//     for (int i = 0; i < 50; i++) {
//        total += arData[i * 2 + 1];	// 짝수만 total에 담기
//     }
     
//     for (int i = 0; i < arData.length; i++) {
//        if(arData[i] % 2 == 0) {
//           total += arData[i];	// if검사로 배열에 있는 짝수만 total에 담기
//        }
//     }
     
//     for (int i = 0; i < arData.length; i++) {
//        if(arData[i] % 2 == 1) {	// 홀수면 건너 뛰고
//           continue;
//        }
//        total += arData[i];	// 남은 짝수만 total에 담기
//     }
     
//     System.out.println(total);
//	   
	   
//	   int[] arData = new int[100];
//	   int sum = 0;
//	   for (int i = 0; i < arData.length; i++) {
//		arData[i] = i + 1;	// 배열에 1-100까지 담기
//	}
//	   for (int i = 0; i < 50; i++) {
//		sum += arData[i * 2 + 1];	// 짝수만 sum에 더해주기
//	}
	   
//	   for (int i = 0; i < arData.length; i++) {
//		if (arData[i] % 2 == 1) {	// 홀수 제외하고
//			continue;
//		}
//		sum += arData[i];	// 짝수만 더해주기
//	}
	   
//	   for (int i = 0; i < arData.length; i++) {
//		if (arData[i] % 2 == 0) {	// 값이 짝수인것만 배열에 담기
//			sum += arData[i];
//		}
//	}
//	   
//	   System.out.println(sum);
	   
	   
	   
//      A ~ F까지 배열에 담고 출력
	   	

	   	
//	   char[] arData = new char[6];
//	   
//	   for (int i = 0; i < arData.length; i++) {
//		arData[i] = (char)(i + 65);	// 아스키 코드 참조하여 배열에 알파벳 담기
//	}
//	   for (int i = 0; i < arData.length; i++) {
//		System.out.println(arData[i]);	// 출력
//	}
	   
	   	
	   	
	   	
//      A ~ F까지 중 C를 제외하고 배열에 담은 후 출력
	   

	   
	   
//	   char[] arData = new char[5];
//	   
//	   for (int i = 0; i < arData.length; i++) {
//		arData[i] = (char)((i > 1 ? 66 : 65) + i);	// C제외하기 위해서 66을 제외한 수 배열에 담기
//	}
//	   for (int i = 0; i < arData.length; i++) {
//		System.out.println(arData[i]);	// 출력
//	}
	   	
	   	
   
   
//  	5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//   	단, 같은 수는 없다고 가정한다.
   
//	   int[] arData = new int[5];
//	   int number = 0;
//	   
//	   Scanner scanner = new Scanner(System.in);
//	   String message = "정수 5개를 입력해 주세요.\n 예) 2,4,5,6,8";
//	   
//	   System.out.println(message);
//	   
//	   
//	   for (int i = 0; i < arData.length; i++) {
//		   arData[i] = scanner.nextInt();	// 입력한 값 배열에 담기
//		
//	}
	   
	   
//     int[] arData = new int[5];
//     Scanner scanner = new Scanner(System.in);
//     String message = "5개의 정수를 입력하세요.\n예)4 3 2 6 7";
//     
//     int max = 0, min = 0;
//     
//     System.out.println(message);
//     for (int i = 0; i < arData.length; i++) {
//        arData[i] = scanner.nextInt();
//     }
//
//     max = arData[0];
//     min = arData[0];
//     
//     for (int i = 1; i < arData.length; i++) {
//        if(max < arData[i]) {	// 두 수 비교하기 크면 큰 수 를 max에 담기
//           max = arData[i];
//        }
//        if(min > arData[i]) {	// 두 수 비교하기 작으면 작은수 를 min에 담기
//           min = arData[i];
//        }
//     }
//     
//     System.out.println(max);
//     System.out.println(min);
	   
//	   
   
//   	사용자에게 칸 수를 입력받고, 그 칸 수만큼 정수를 다시 입력 받는다.
//   	입력한 정수들의 평균값을 구한다.
	   
	   
	   
//	   int[] arData = null;
//	   int length = 0;
//	   int sum = 0;
//	   double aver = 0;
//	   
//	   Scanner scanner = new Scanner(System.in);
//	   String message = "칸수를 입력하세요. \n 예) 10";
//	   String numessage = "칸수에 맞는 정수를 입력하세요.";
//	   
//	   System.out.println(message);
//	   
//	   length = scanner.nextInt();
//	   arData = new int[length];	// 사용자가 입력 한 값으로 배열의 크기 정하기
//	   
//	   System.out.println(length);
//	   
//	   System.out.println(numessage);
//	   
//	   
//	   for (int i = 0; i < arData.length; i++) {
//		   
//			arData[i] = scanner.nextInt();
//		}
//	   for (int i = 0; i < arData.length; i++) {
//			sum += arData[i];	// 배열의 합 구하기
//		}
//	   
//	   aver = sum / length;	// 평균 구하기
//	   
//	   System.out.println(aver);
	   
	   
//	   (1) 1 ~ 100까지 중 홀수만 배열에 담기	   
//	   (2) 1 ~ 100까지 중 짝수만 배열에 담기
//	   (3) 두 배열을 합쳐서 1 ~ 100까지 배열에 담고 각 요소 출력하기
	   
//	      int length = 50;
//	      int[] arOddData = new int[length];
//	      int[] arEvenData = new int[length];
//	      int[] arData = new int[length * 2];
//	      
//	      for (int i = 0; i < arOddData.length; i++) {
//	         arOddData[i] = i * 2 + 1;	// 홀수만 배열에 담기
//	         arEvenData[i] = (i + 1) * 2;	// 짝수만 배열에 담기
//	      }
//	      
//	      for (int i = 0; i < arEvenData.length; i++) {
//	         arData[i * 2 + 1] = arEvenData[i];	// 짝수를 배열 홀수 칸에 담기
//	      }
//	      for (int i = 0; i < arOddData.length; i++) {
//	         arData[i * 2] = arOddData[i];	// 홀수를 배열 짝수칸에 담기
//	      }
//	      
//	      for (int i = 0; i < arData.length; i++) {
//	         System.out.println(arData[i]);
//	      }
	   
	   
	   


////	   당신은 3칸 방이 있는 건물주이다.
////	   각 방에는 세입자가 살고있다.
////	   방마다 월세를 받아서 총 월세와 평균 월세를 구해주는 프로그램을 만들고자 한다.
	   
//	   int[] arData = new int[3];
//	   int sum = 0;
//	   double average = 0;
//	   
//	   Scanner scanner = new Scanner(System.in);
//	   String message = "호 월세를 입력해주세요: ";
//	   String sumMessage = "총 월세는 %d 입니다.\n";
//	   String averMessage = "평균 월세는 %.2f 입니다.";
//	   
//	   
//	   
//	   for (int i = 0; i < arData.length; i++) {
//		   System.out.println("10" + (i + 1) +message);	// 호수별 월세를 묻는 문자열 출력
//		   arData[i] = scanner.nextInt();
//		
//	}
//	   for (int i = 0; i < arData.length; i++) {
//		   sum += arData[i];	// 배열에 합 구하기
//	}
//	   
//	   System.out.printf(sumMessage,sum);
//	   
//	   average = (double)sum / arData.length;	// 배열의 평균 구하기
//	   
//	   System.out.printf(averMessage,average);
//	   
	   
//	   int[] arIncome = new int[3];
//	      Scanner scanner = new Scanner(System.in);
//	      String message = "호 월세: ";
//	      int total = 0;
//	      double average = 0.0;
//	      
//	      for (int i = 0; i < arIncome.length; i++) {
//	         System.out.println("10" + (i + 1) + message);
//	         arIncome[i] = scanner.nextInt();
//	      }
//	      
//	      for (int i = 0; i < arIncome.length; i++) {
//	         total += arIncome[i];
//	      }
//	      
//	      average = (double)total / arIncome.length;
//	      average = Double.parseDouble(String.format("%.2f", average));
//	      
//	      System.out.println("총 월세: " + total);
//	      System.out.println("평균 월세: " + average);
//	   }
	   
	   
	   
////	   코드분석
//	   
//	   int[] arOriginalData = { 9, 1, 9, 2, 9 };
//       boolean[] arCheck = new boolean[5];
//       int[] arData = null;
//       int count = 0, index = 0;
//
//       for (int i = 0; i < arOriginalData.length - 1; i++) {
//          for (int j = i + 1; j < arOriginalData.length; j++) {
//             if (arOriginalData[i] == arOriginalData[j]) {	// 배열에 들어있는 수가 같은 수인지 확인하기
//                count++;	// 맞으면 count 수 + 1
//                arCheck[i] = true;	// 배열에는 true 담기
//                break;
//             }
//          }
//       }
//       
//       arData = new int[arOriginalData.length - count];	// arData에 원래 배열 개수 - 같은 문자 개수 만큼 배열 만들어주기
//       for (int i = 0; i < arCheck.length; i++) {
//          if(!arCheck[i]) {	// 만약 배열이 false이면, 다른 수 이니까
//             arData[index++] = arOriginalData[i];	// arData에 넣어주기
//          }
//       }
//       
//       for (int i = 0; i < arData.length; i++) {
//          System.out.println(arData[i]);
//       }
	   
	   
	   
	   
   }

}






















