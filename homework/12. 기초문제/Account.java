package chap99_homework.homework12;

public class Account {
    //      6. 잔액을 속성으로 가지고 입금, 출금, 잔액 조회를 메소드로 갖는 계좌 클래스를 생성하세요.
    private int balance = 0;

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }
}
