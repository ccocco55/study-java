package gptReview.d;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		AdvancedCalculator advancedCalculator = new AdvancedCalculator();
		
		calculator.add(2, 5);
		calculator.add(2.5,	4.5);
		calculator.add("hello", " nice meet you");
		advancedCalculator.add(2, 4);
	}
}
