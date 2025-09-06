package homeWork;
//요구사항:

import java.util.Scanner;

//BankAccount 클래스를 만들어보세요. 이 클래스는 은행 계좌를 모델링해야 합니다.
//계좌번호 (accountNumber: 문자열)
//예금주 (owner: 문자열)
//잔액 (balance: 정수)
//
//요구사항 추가:
//생성자를 만들어 초기화
//입금 메서드 deposit(int amount)
//출금 메서드 withdraw(int amount)
//출금할 금액이 잔액보다 많으면 출금하지 않고 경고 메시지 출력
//현재 잔액을 반환하는 getBalance() 메서드 만들기

class BankAccount {
	String accountNumber;
	String owner;
	int balance;

	public BankAccount(String accountNumber, String owner, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}

	int deposit(int amount) {
		balance += amount;
		return balance;
	}

	int withdraw(int amount) {
		if (amount > balance) {
			// 출금 불가
			return -1;
		} else {
			balance -= amount;
			return balance;
		}
	}

	int getBalance() {
		return balance;
	}
}

public class Homework02 {
	public static void main(String[] args) {
		int amount = 0;
		int number = 0;

		BankAccount bankAccount = new BankAccount("12309-123-432", "임채민", 300000);
		Scanner scanner = new Scanner(System.in);
		String message = " 1. 입금 \n 2. 출금 \n 3. 잔액 조회 \n 4. 종료";
//		String depositMessage = null;

		while (true) {
			System.out.println(message);

			number = scanner.nextInt();

			if (number == 1) {
				System.out.println("입금 할 금액을 입력하세요.");
				amount = scanner.nextInt();
				bankAccount.deposit(amount);
				System.out.println("총 " + bankAccount.getBalance() + "원 입니다.");
			} else if (number == 2) {
				System.out.println("출금 할 금액을 입력하세요.");
				amount = scanner.nextInt();
				int result = bankAccount.withdraw(amount);
				if (result == -1) {
					System.out.println("잔액이 부족합니다.");
				} else {
					System.out.println("총 " + bankAccount.getBalance() + "원 입니다.");
				}
			} else if (number == 3) {
				System.out.println("잔액은" + bankAccount.getBalance() + "원 입니다.");
			} else if (number == 4) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("입력 오류입니다.");
			}
		}

	}
}
