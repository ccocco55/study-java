package review;

public class ShinhanReview extends BankReview {
	@Override
	public void deposit(int money) {
		money /= 2;
		super.deposit(money);
	}
}
