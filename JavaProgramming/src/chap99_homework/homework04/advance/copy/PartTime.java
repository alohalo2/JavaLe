package chap99_homework.homework04.advance.copy;

public class PartTime extends Employee {

	@Override
	public double getMonthPay(int bonus, int hireYear, int workDay) {
		double getMonthPay = pay * workDay;
		return getMonthPay;
	}

}
