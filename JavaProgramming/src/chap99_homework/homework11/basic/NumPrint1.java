package chap99_homework.homework11.basic;

public class NumPrint1 extends Thread {

	private NumberPrinter np;
	
	public void setNp(NumberPrinter np) {
		this.np = np;
	}
	
	public NumberPrinter getNp() {
		return this.np;
	}
	
	@Override
	public void run() {
		// 동기화 메소드 호출
		this.np.numPrint1(10);
	}

}
