package chap99_homework.homework12;

public class CoupangMan extends ParttimeJob {
    public CoupangMan(int workTime, int pay) {
        super(workTime, pay);
    }

    @Override
    public void work() {
        System.out.println("쿠팡맨은 " + this.workTime + "동안 배송해서 " + (this.workTime * this.pay) + " 급여를 받는다.");
    }
}
