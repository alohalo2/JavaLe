package chap99_homework.homework11.answer;

public class Thread2 extends Thread{
	private NumberPrinterSync np;

	public NumberPrinterSync getNp() {
		return np;
	}

	public void setNp(NumberPrinterSync np) {
		this.np = np;
	}
	
	@Override
	public void run() {
		np.numPrint2(30);
	}
}
