package gptReview.d;

public class AdvancedCalculator extends Calculator{
	@Override
	public void add(int a, int b) {
		System.out.println("AdvancedCalculator 사용 중...");
		super.add(a, b);
	}
	
}
