package lambdaTest;

import java.util.Scanner;

public class MyMath {
	public static Calc operate(String oper) {
		return oper.equals("+") ? (n1, n2) -> n1 + n2 : (n1, n2) -> n1 - n2;	// 연산자 + 이면 더하기 아니면 빼기 출력
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String message = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요.";
		String example = "예)9+7-5";
		String expression = null;
		String[] arOper = null;
		String[] arTemp = null;
		int number1 = 0, number2 = 0;
		int index = 0;
		
		OperCheck operCheck = (e) -> {
			String result = "";
			
			for (int i = 0; i < e.length(); i++) {
				if(e.charAt(i) == '+' || e.charAt(i) == '-') {	// 문자에 +,- 있으면 결과 값에 넣기
					result += e.charAt(i);
				}
			}
			
			return result.split("");	// 빈공간으로 나눠 리턴값에 담아주기
		};
		
		System.out.println(message);
		System.out.println(example);
		expression = scanner.next();
		
		arOper = operCheck.getOper(expression);
		
		arTemp = expression.split("\\+|\\-");	// +, - 기준으로 숫자 나누기
		
		if(arTemp[0].isEmpty()) {	// 배열temp가 비어있으면
			number1 = Integer.parseInt(arOper[0] + arTemp[1]);	// oper 0번째 배열과 temp 1번쨰 배열 더하기 
			index = 1;	// 인덱스는 1
			
		}else {
			number1 = Integer.parseInt(arTemp[0]);	// 아니면 temp 0 번쨰방만 강제 형 변환
			
		}
		
		for (int i = index; i < arOper.length; i++) {
			number2 = Integer.parseInt(arTemp[i + 1]);
			number1 = MyMath.operate(arOper[i]).calc(number1, number2);
		}
		
		System.out.println(number1);
	}
}










