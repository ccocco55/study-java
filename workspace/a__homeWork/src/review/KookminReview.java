package review;

public class KookminReview extends BankReview {
	@Override
	public void withdraw(int money) {
		money *= 1.5;
		super.withdraw(money);
	}
}
