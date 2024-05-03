package chap99_homework04.advance;

public abstract class Employee {

//	2. 추상클래스 회사원
//	  - 사번 => int eno
//	  - 이름 => String name
//	  - 급여 => int pay
//	  - 근무형태 => int type //1: 정규직, 2: 계약직, 3. 임시직
//	 생성자(사번, 이름, 급여, 근무형태);
//	 추상메서드 double getMonthPay();
//	 일반메서드 void showEmployeeInfo();
//
//	위 추상클래스 회사원을 상속받은 아래 세 클래스를 만들고 
//	메서드 getMonthPay와 showEmployeeInfo를 오버라이드하여 구현하세요.
//	정규직 : int bonus, 월급 = pay / 12 + bonus/12
//	임시직 : int hireYear, 월급 = pay / 12;
//	계약직 : int workDay, 월급 = pay * workDay
	
	String name;
	int eno;
	int pay;
	int type;
	
	public Employee(int eno, int pay, int type, String name) {
		this.eno = eno;
		this.pay = pay;
		this.type = type;
		this.name = name;
	}
	
	public abstract double getMonthPay();
	public void showEmployeeInfo() {
		System.out.println("이름은: " + this.name);
		System.out.println("사번은:" + this.eno);
		System.out.println("급여는:" + this.pay);
		System.out.println("근무형태는:" + this.type);
	}
	
}
