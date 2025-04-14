package chap99_homework.boj.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1676_팩토리얼0의개수 {
	
	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int num = Integer.parseInt(br.readLine());
			
			System.out.println(countZeros(num));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 팩토리얼을 계산할 필요 없이 문제에서는 팩토리얼 값의 0의 개수를 구하는 것이기
	// 때문에 0을 만드는 수 5의 배수의 개수로 계산하면 된다.
	public static int countZeros(int n) {
		int count = 0;
		while(n >= 5) {
			count += n / 5;
			n /= 5;
		}
		return count;
	}
		
//		틀린 답
//		
//		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//			
//			int num = Integer.parseInt(br.readLine());
//			
//			String str = Integer.toString(factorial(num));
//			int count = 0;
//			
//			for(int i = 0; i < str.length(); i++) {
//				if(str.charAt(i) == '0') {
//					count++;
//				}
//			}
//			
////			System.out.println(factorial(num));
//			System.out.println(count);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
//	// 반복문으로 만든 factorial 함수
//	public static int factorial(int num) {
//		
//		int result = 1;
//		for(int i = 1; i < num + 1; i++) {
//			result *= i;
//		}
//		
//		return result;
//	}
//	
//	// 재귀함수로 만든 factorial 함수
////	public static int factorial(int num) {
////		if(num <= 1) return 1;
////		return num * factorial(num - 1);
//	}

}
