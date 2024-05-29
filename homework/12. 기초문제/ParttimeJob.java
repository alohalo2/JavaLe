package chap99_homework.homework12;

public class ParttimeJob {
    //      2. 일한 시간, 시간당 급여를 속성으로 갖는 알바라는 클래스를 만들고 일한다(일한 시간동안 일해서 일한 시간 * 시간당 급여를 받는다. 라고 출력하는)를 메소드로 만드세요.
    //              알바를 상속받는 캐셔와 쿠팡맨 클래스를 만들고 일한다 메소드를 오버라이딩하여 캐셔는 "캐셔는 일한 시간동안 계산해서 일한 시간 * 시간당 급여를 받는다."
    //      쿠팡맨은  "쿠팡맨은 일한 시간동안 배송해서 일한 시간 * 시간당 급여를 받는다."라고 출력하도록 구현하세요. 일한 시간과 시간당 급여는 생성자에서 초기화합니다.
    public int workTime;
    public int pay;

    public ParttimeJob(int workTime, int pay) {
        this.workTime = workTime;
        this.pay = pay;
    }

    public void work() {
        System.out.println(this.workTime + "동안 일해서 " + (this.workTime * this.pay) + " 급여를 받는다.");
    }

}
