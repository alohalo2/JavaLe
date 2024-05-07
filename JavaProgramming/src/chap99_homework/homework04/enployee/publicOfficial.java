package chap99_homework.homework04.enployee;

public class publicOfficial extends Employee {

	@Override
	public void goToWork() {
		System.out.println("출근한다.");

	}

	@Override
	public void working() {
		System.out.println("일하는 중이다.");

	}

	@Override
	public void leaveWork() {
		System.out.println("퇴근한다.");

	}

}
