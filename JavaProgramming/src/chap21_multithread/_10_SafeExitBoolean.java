package chap21_multithread;

import chap21_multithread.thread.SafeExitThread;

public class _10_SafeExitBoolean {

	public static void main(String[] args) {
		
		SafeExitThread st = new SafeExitThread();
		
		st.start();
		
		try {
			Thread.sleep(5000); // 메인 Thread를 5초 뒤에 일시정지 시킨다
		} catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
		// SafeExitThread의 run 메소드의 내용을 종료시킨다.
		st.setStop(true);

	}

}
