package chap99_homework04.advance;

public class TemporaryWorker extends Employee {

	public TemporaryWorker(int eno, int pay, int type, String name) {
		super(eno, pay, type, name);
		
	}

	@Override
	public double getMonthPay(int bonus, int hireYear, int workDay) {
		double getMonthPay = pay / 12;
		return getMonthPay;
	}

}
