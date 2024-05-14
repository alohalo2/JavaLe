package chap99_homework.homework11.basic;


public class NumPrintSyncShared {

	public static void main(String[] args) {
		
		NumberPrinter np = new NumberPrinter();
		
		NumPrint1 np1 = new NumPrint1();
		NumPrint2 np2 = new NumPrint2();
	
		np1.setNp(np);
		np2.setNp(np);
		
		np2.start();
		np1.start();

//		wait()과 notify() 사용:
//
//		스레드 1이 실행하고 나서 스레드 2를 실행시키고 싶은 경우, 스레드 1은 스레드 2를 실행하기 전에 notify()를 호출하여 스레드 2를 깨워야 합니다.
//		스레드 2는 wait()을 호출하여 대기 상태로 들어가 있어야 합니다. 스레드 1이 notify()를 호출할 때까지 대기 상태로 유지됩니다.
//		
//		join()과 start() 사용:
//
//		스레드 1을 먼저 실행하고 그 다음에 스레드 2를 실행시키고 싶은 경우, 스레드 1을 실행한 후에 스레드 1에 대해 join()을 호출하여 스레드 1이 종료될 때까지 대기합니다.
//		이후에 스레드 2를 시작할 수 있습니다.
			
	}

}
