package gptReview.d;

public class Calculator {
	public void add(int a, int b) {
		System.out.println("정수 덧셈: " + a + " + " + b + " = " + (a + b)); 
	}
	public void add(double a, double b) {
		System.out.println("실수 덧셈: " + a + " + " + b + " = " + (a + b)); 
	}
	public void add(String a, String b) {
		System.out.println("문자열 덧셈: " + a + " + " + b + " = " + a + b);
	}
}
