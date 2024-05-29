package chap99_homework.homework12;

public class Developer implements Worker {
    @Override
    public void goToWork() {
        System.out.println("개발자는 지하철을 타고 출근한다.");
    }

    @Override
    public void goBackHome() {
        System.out.println("개발자는 지하철을 타고 퇴근한다.");
    }

    @Override
    public void work() {
        System.out.println("개발자가 코드를 고친다.");
    }
}
