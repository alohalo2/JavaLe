package chap99_homework.homework12;

public class Cashier extends ParttimeJob{
    Cashier(int workTime, int pay) {
        super(workTime, pay);
    }

    @Override
    public void work() {
        System.out.println("캐셔는 " + this.workTime + "동안 계산해서 " + (this.workTime * this.pay) + " 급여를 받는다.");
    }
}
