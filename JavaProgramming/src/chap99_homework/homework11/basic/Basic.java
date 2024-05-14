package chap99_homework.homework11.basic;

public class Basic {

	public static void main(String[] args) {
		
		
//		1. 메인스레드는 1~20까지 3과 4의 공배수를 출력하는 작업을 하고 
//		   1~20까지의 숫자중 30의 약수를 출력하는 서브 스레드를 하나 갖는다. 각각의 스레드를 실행하십시오.

//		2. 1번 문제에서 join()메소드를 이용해서 서브 스레드가 먼저 실행돼서 끝난 후에 메인 스레드가 실행되도록 구현하세요.

		Thread subThread = new Thread() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 20; i++) {
					if(30 % i == 0) {
						System.out.println(i);
					}
				}
			}
			
		};
		
		subThread.start();
		
		try {
			subThread.join();
		} catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
		for(int i = 1; i <= 20; i++) {
			if(i % 12 == 0) {
				System.out.println(i);
			}
		}

		
//		4. 3번 문제에서 첫 스레드의 공유객체 점유가 끝날때까지 두 번째 스레드를 실행하지 못하도록 잠금 상태로 만드세요.

		
		
		
		
		
		
		
		
//		5. 3, 4번 문제에서 wait와 notify를 이용하여 스레드 두개가 각각 한 번씩 출력하도록 수정하세요.
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
