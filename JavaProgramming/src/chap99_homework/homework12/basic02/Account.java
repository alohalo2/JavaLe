package chap99_homework.homework12.basic02;

import chap99_homework.homework04.enployee.publicOfficial;

public class Account {

	
//	6. 잔액을 속성으로 가지고 입금, 출금, 잔액 조회를 메소드로 갖는 계좌 클래스를 생성하세요.
	
	private static int balance;
	private int money;
	
	public Account (int balance, int money) {
		this.balance = balance;
		this.money = money;
	}


	
	public int getBalance() { // 잔액조회
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}



	@Override
	public String toString() {
		return "Account [balance=" + balance + ", money=" + money + "]";
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
