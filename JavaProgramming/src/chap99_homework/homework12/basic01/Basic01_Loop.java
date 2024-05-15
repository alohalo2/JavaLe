package chap99_homework.homework12.basic01;

import java.util.Scanner;

public class Basic01_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		1. 1부터 10까지의 정수의 합을 출력하세요.

//		int sum = 0;
//		
//		for(int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		
//		System.out.println(sum);
	
//		2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력

		int num1 = 2;
		
		for(int i = 1; i <= 10; i++) {
			int result1 = 1;
			for(int j = 1; j < i; i++) {
				result1 *= num1;
			}
			System.out.println("2 " + " * " + num1 + " = " + result1);
		}


//		System.out.println(num3 + "단 끝");
		
		
//		3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.

		
		
//		4. 사용자가 입력한 정수의 약수를  출력하세요.

		
		
//		5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)

		
		
//		6. 사용자가 입력한 문자열을 역순으로 출력하세요.

		
		
//		7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.

		
		
//		8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.

//		8-1. *
//		     **
//		     ***
//		     ****
//		     *****
//
//		8-2. *****
//		      ****
//		       ***
//		        **
//		         *

		
		
//		9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.
		
		
		
		
		
		sc.close();
	}

}
