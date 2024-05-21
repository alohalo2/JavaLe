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

//		int result1 = 1;
//
//		for (int i = 1; i <= 10; i++) { // result1 = result1 * 2 = (result * 2) * 2 = ((result * 2) * 2) * 2 ...
//			result1 = result1 * 2;
//
//			System.out.println("2의 " + i + " 제곱 = " + result1);
//		}

//		3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.

//		System.out.println("정수를 입력하세요.");
//		int userNum1 = sc.nextInt();
//		
//		// 2부터 userNum1까지 모든 숫자에 대해 소수 여부를 판별
//		for(int i = 2; i < userNum1; i++) {
//			boolean isPrime = true;
//			
//			// 2부터 i-1(j)까지의 숫자로 나누어 떨어지는지 확인, 소수는 같은 수로는 나누어 떨어지는게 항상 참이므로 제외시킨다.
//			for(int j = 2; j < i; j++) {
//				if(i % j == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			if(isPrime) {
//				System.out.print(i + " ");
//			}
//		}
//		System.out.println("--------------------------------");
//		
		/*
		 * 
		 *   
		 *   2 3 4 5 6 7 8 9 10 11 12 13 14(j)
		 * 2
		 * 3
		 * 4
		 * 5
		 * 6
		 * 7
		 * 8
		 * 9
		 * 10
		 * 11
		 * 12
		 * 13
		 * 14
		 * 15
		 * (i)
		 * 
		 * */

//		4. 사용자가 입력한 정수의 약수를 출력하세요.
		
//		System.out.println("정수를 입력하세요.");
//		int userNum2 = sc.nextInt();
//		
//		// 사용자 입력한 값을 약수인지 구별
//		for(int i = 1; i <= userNum2; i++) {
//			if(userNum2 % i == 0) {
//				System.out.println(i + " ");
//			}
//		}
//		System.out.println("-------------------------");
		
//		5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)

//		int[] intArr1 = new int[10];
//		
//		// 사용자가 입력한 10개의 정수를 intArr1에 저장
//		for(int i = 0; i < intArr1.length; i++) {
//			System.out.println("정수를 입력하세요.");
//			intArr1[i] = sc.nextInt();
//		}
//		
//		// intArr1에 저장된 내용 역순으로 출력
//		for(int i = intArr1.length - 1; i >= 0; i--) {
//			System.out.print(intArr1[i] + " ");
//		}
//		
//		System.out.println("\n--------------------------"); // \n: 엔터키, 한줄 내리기
		
//		6. 사용자가 입력한 문자열을 역순으로 출력하세요.

//		System.out.println("문자열을 입력하세요");
//		String userStr1 = sc.nextLine();
//		
//		// 사용자 입력값을 charAt으로 변경하는 for문
//		for(int i = 0; i < userStr1.length(); i++) {
//			userStr1.charAt(i);
//		}
//		
//		// charAt으로 바꾼 것을 거꾸로 출력하는 for문
//		for(int i = userStr1.length() - 1; i >= 0; i--) {
//			System.out.print(userStr1.charAt(i));
//		}

//		7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.

//		System.out.println("정수를 입력하세요.");
//		int userNum3 = sc.nextInt();
//		
//		System.out.println("정수를 입력하세요.");
//		int userNum4 = sc.nextInt();
//		
//		int multiple3 = 0;
//		int multiple4 = 0;
//		int divisor3 = 0;
//		int divisor4 = 0;
//		int lcm = 0;
//		int gcd = 0;
//		
//		int [] mulArr3 = new int[5];
//		int [] mulArr4 = new int[5];
//		
//		for(int i = 0; i < 5; i++) {
//			mulArr3[i] = userNum3 * i;	
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			mulArr4[i] = userNum4 * i;	
//		}
		
		
		
		// 최소 공배수
		
		
		
		// 최대 공약수
		
		
		
//		8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.

//			   01234
//		8-1. 0 *
//		     1 * *
//		     2 * **
//		     3 * ***
//		     4 * ****
		
		for(int i = 0; i < 5; i++) {
			System.out.println("*");
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		}
		
		
		
//
//		8-2. *****
//		      ****
//		       ***
//		        **
//		         *

//		9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.

	
//		int sum = 0;
//
//		
//		while(true) {
//			
//			System.out.println("정수를 입력하세요. q를 입력하면 프로그램이 종료됩니다.");
//			String userNum5 = sc.nextLine();
//			
//			// 사용자 입력값을 int로 바꿔주는 코드
//			int num = Integer.valueOf(userNum5);
//			
//			int[] intArr1 = new int[num];
//			
//			for(int i = 0; i < num; i++) {
//				intArr1[i] = num;
//				sum += intArr1[i];
//			}
//			
//			if(userNum5.equals("q")) {
//				System.out.println(sum);
//				break;
//			} 
//			
//		}
		
		sc.close();
	}

}
