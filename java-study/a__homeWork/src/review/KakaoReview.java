package review;

public class KakaoReview extends BankReview {
	@Override
	public int showBalance() {
		this.setMoney(this.getMoney() / 2);
		return super.showBalance();
	}
}
