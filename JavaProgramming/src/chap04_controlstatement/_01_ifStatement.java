package chap04_controlstatement;

public class _01_ifStatement {

	public static void main(String[] args) {
		
		int lunchPrice = 10000;
		
		if(lunchPrice > 10000) {
			System.out.println("비싸다");
		} else if(lunchPrice > 8500) {
			System.out.println("조금 비싸다");
		} else if(lunchPrice > 6000) {
			System.out.println("적당하다");
		} else if(lunchPrice > 5000) {
			System.out.println("조금 싸다");
		} else { 
			System.out.println("싸다");
		}
		
		System.out.println("-----------------------");
		
		int num = 12345;
		
		// num가 짝수인지 홀수인지 출력하는 조건문을 완성하세요.
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		// num1가 짝수인지 홀수인지 출력하는 조건문을 완성하세요.
		
//		if(num % 2 == 0)
		
	}

}
