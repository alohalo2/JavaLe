package chap99_homework.homework12.basic02;

import chap99_homework.homework04.enployee.publicOfficial;

public class Account {

	
//	6. 잔액을 속성으로 가지고 입금, 출금, 잔액 조회를 메소드로 갖는 계좌 클래스를 생성하세요.
	
	private static int balance;
	
	public Account (int balance, int money) {
		this.balance = balance;
	}
	public int getBalance() { // 잔액조회
		return balance;
	}
	
//	setBalance: 불필요하며, 잔액을 직접 설정하지 않아야 하므로 제거합니다.
//	getMoney와 setMoney: money 변수는 입출금과 직접적으로 관련되지 않으며, 이를 위한 getter와 setter도 필요하지 않습니다. 따라서 제거합니다.
	
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}
//	public int getMoney() {
//		return money;
//	}
//
//	public void setMoney(int money) {
//		if(balance < money) return;
//		this.money = money;
//	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}

	public static void deposit(int money) {
	
		balance += money;
	}
	
	public static void withdraw(int money) {
		
		if(balance > money) {
			balance -= money;
		} else {
			System.out.println("잔액 부족입니다, 금액을 다시 입력하세요.");
		}
	}
	
}
