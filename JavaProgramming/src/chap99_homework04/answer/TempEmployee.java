package chap99_homework04.answer;

public class TempEmployee extends Employee {
	private int hireYear;

	public TempEmployee(int eno, String name, int pay, int type, int hireYear) { // 매개변수가 있는 생성자
		super(eno, name, pay, type);
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return this.getPay()/12;
	}
	
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("근무년수 : " + this.hireYear);
		System.out.println("월급 : " + this.getMonthPay());
	}
}
