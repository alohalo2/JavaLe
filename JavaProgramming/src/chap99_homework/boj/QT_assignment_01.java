package chap99_homework.boj;

import java.util.Scanner;

public class QT_assignment_01 {

	/* get_1_or_0() 함수 */
	public static int get_1_or_0() {
		return (int) (Math.random() * 2);
	}
	
	/* get_random 함수 */
	public static int get_random(int n) {
		if (n < 0) {
	        throw new IllegalArgumentException("Negative N is not allowed");
	    }
		
		int result = 0;
		
		do {
			//입력값을 이진수로 변경
			String N = Integer.toBinaryString(n);
			result = 0;
			
			for(int i = 0; i < N.length(); i++) {
				//result << 1는 비트를 왼쪽으로 1칸 이동
				result = (result << 1) | get_1_or_0();
			}
			
		} while (result > n || result < 0);
		
		return result;
	}
	
	/* Test Code */
	public static void test() {
		//Test Case 1: N = 0
		System.out.println("Testing N = 0");
		assert get_random(0) == 0 : "Failed: N = 0";
		//Test Case 2: N = 1
		System.out.println("Testing N = 1");
		for(int i = 0; i < 100; i ++) {
			int result = get_random(1);
			assert result == 0 || result == 1 : "Failed: N = 1";
		}
		//Test Case 3: N = 10
		System.out.println("Testing N = 10");
		for(int i = 0; i < 100; i++) {
			int result = get_random(10);
			assert result >= 0 && result <= 10 : "Failed: N = 10";
		}
		//Test Case 4: N = 1000
		System.out.println("Testing N = 1000");
		for(int i = 0; i < 1000; i++) {
			int result = get_random(1000);
			assert result >= 0 && result <= 1000 : "Failed: N = 1000";
		}
		//Test Case 5: N = Integer.MAX_VALUE
		System.out.println("Testing N = Integer.MAX_VALUE");
		for(int i = 0; i < 10000; i++) {
			int result = get_random(Integer.MAX_VALUE);
			assert result >= 0 && result <= Integer.MAX_VALUE : "Failed: N = Integer.MAX_VALUE";
		}
		//Test Case 6: N = 음수일 때
		System.out.println("Testing negative N");
		try {
			get_random(-1);
			assert false : "Failed: Negative N should throw exception";
		} catch (Exception e) {
			assert true : "Passed Negative N";
		}
	}
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);

//		int n = sc.nextInt();
		
//		int result1 = get_1_or_0();
//		System.out.println("result1: " + result1);
		
//		int result2 = get_random(n);
//		System.out.println("result2: " + result2);
		
		/*----------------Test-----------------*/
		
		try {
		    test(); // 모든 테스트 실행
		    System.out.println("All tests passed!");
		} catch (AssertionError e) {
		    System.err.println("Test failed: " + e.getMessage());
		    throw e; // 실패 메시지 출력 후 프로그램 종료
		}
		
	}

}
