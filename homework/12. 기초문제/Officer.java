package chap99_homework.homework12;

public class Officer implements Worker {
    @Override
    public void goToWork() {
        System.out.println("공무원은 자차를 타고 출근한다.");
    }

    @Override
    public void goBackHome() {
        System.out.println("공무원은 자차를 타고 퇴근한다.");
    }

    @Override
    public void work() {
        System.out.println("공무원이 민원처리를 한다.");
    }
}
