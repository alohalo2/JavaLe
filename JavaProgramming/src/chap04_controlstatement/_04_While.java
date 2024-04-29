package chap04_controlstatement;

public class _04_While {

	public static void main(String[] args) {
		
		// 1. 1~100까지의 합
		int num = 1;
		int sum = 0;
		
		while(num <= 100) {
			sum += num++; // sum = sum + num++
		}

		System.out.println("1~100까지의 합: " + sum);
		System.out.println("------------------------");
		
		// 2. while문을 이용해서 1~10까지 거꾸로 출력하세요.
		
		int m = 10;
		
		while(m >= 1) {
			
		System.out.println("1~10까지 거꾸로 출력: " + m--);
		}
		System.out.println("-------------------------");
		
		for(int j=10; j > 0; j--) {
			
		System.out.println("1~10까지 거꾸로 출력: " + j);	
			
		}
		
		
	}

}
