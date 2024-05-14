package chap21_multithread;

import chap21_multithread.thread.PrintNumWaitNotify;
import chap21_multithread.thread.WaitNotifyThread01;
import chap21_multithread.thread.WaitNotifyThread02;

public class _09_WaitNotify {

	public static void main(String[] args) {
	
		PrintNumWaitNotify pnwn = new PrintNumWaitNotify();
		
		WaitNotifyThread01 wt01 = new WaitNotifyThread01();
		WaitNotifyThread02 wt02 = new WaitNotifyThread02();
	
		wt01.setPnwn(pnwn);
		wt02.setPnwn(pnwn);

		
		wt01.start();
		wt02.start();

	}

}
