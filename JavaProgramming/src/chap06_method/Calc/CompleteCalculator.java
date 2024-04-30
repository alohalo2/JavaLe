package chap06_method.Calc;

public class CompleteCalculator {
	
	// int형 매개변수 2개를 받는 메소드 add(더하기), sub(빼기), mul(곱하기), div(나누기), mod(나머지)를 구현하세요.
	// 접근제어자는 모두 public으로 생성하고 div와 mod의 리턴타입만 double 나머지 메소드는 int로 지정하세요.
	// div와 mod의 두 번째 매개변수가 분모이고 분모에 0이 들어오면 0을 리턴하세요.
	
	public int add(int num1, int num2) {
		// return문은 결과값을 반환하는 의미도 있지만 메소드의 종결을 의미하기도 한다.
		// return문 뒤에 코드는 실행되지 않는다.
		return num1 + num2;
	}	
	
	
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
		
	
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	
	public double div(double num1, double num2) {
		if (num2 == 0) 
			return 0;
		return (double) num1 / num2;
	}
	
	
//	public int[] (int a, int b) {
//		int[] arr = new int [5];
//		
//		for(int i = 1; )
//			
// 	}
	
	public int mod(int num1,int num2) {
		if (num2 == 0) 
			return 0;
		return num1 % num2;
	}
	
}
