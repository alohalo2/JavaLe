package chap99_homework.homework12.basic01;

import java.util.Iterator;
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
//		System.out.println("사용자가 입력한 두 정수의 최소공배수: " + lcm(userNum3, userNum4));
//		System.out.println("사용자가 입력한 두 정수의 최대공약수: " + gcd(userNum3, userNum4));
//		System.out.println("-----------------------------");
		
//		8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.

//			   01234(j)
//		8-1. 0 *
//		     1 **
//		     2 ***
//		     3 ****
//		     4 *****
//		    (i)
		
//		for(int i = 0; i < 5; i++) { // i = 세로
//			for(int j = 0; j < 5; j++) { // j = 가로
//				if(j <= i) {
//					System.out.print("*");
//				}
//			}
//			System.out.println(); /* == System.out.print("\n"); */
//		}
	
//		       01234(j)
//		8-2. 0 *****
//		     1  ****
//		     2   ***
//		     3    **
//		     4     *
//		    (i) 
		
//		for(int i = 0; i < 5; i++) { // i = 세로
//			for(int j = 0; j < 5; j++) { // j = 가로 
//				if(i <= j)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			
//			System.out.println();
//		}
		
//		8-3.
//		 0123456 
//		0 ****** *****
//	    1  ***** ****
//	    2   **** ***
//	    3    *** **
//	    4     ** *
//		5      *
		
//		for(int i = 0; i < 6; i++) { // i = 세로
//			for(int j = 0; j < 6; j++) { // j = 가로 
//				if(i <= j) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}	
//			}
//			
//			for(int k = 5; k > i; k--) {
//					System.out.print("*");
//			}
//			
//			System.out.println();
//		}	
		
//		8-4.
		
//		  012345  01234
//		0 	   * 0 
//		1     ** 1*
//	    2    *** 2**
//	    3   **** 3***
//	    4  ***** 4****
//	    5 ****** 5*****
//	   (i)
		
//		for(int i = 0; i < 6; i++) { 
//			for(int j = 6; j >= 0; j--) {
//				if(i < j) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			
//			for(int k = 0; k < i; k++) { // 
//				System.out.print("*");
//			}
//			System.out.println();
//		}
			
//		8-5. 홀수를 입력하면 그에 맞는 다이아몬드(마름모) 모양의 별을 구현하세요.
		
//		  *
//		 ***
//		*****
//		 ***
//		  *
		
//		System.out.println("홀수를 입력해주세요.");
//		int userNum6 = sc.nextInt();
//		
//		int half1 = userNum6/2; // 사용자 설정값을 마름모 상/하단으로 나누어 작업하기 위해 2로 나누어 준다. 
//		                       // (ex: 사용자 설정값이 7일 경우 상단은 012, 하단은 01로 5개의 인덱스가 나오는셈)  
//		
//		
//		if(userNum6 % 2 == 0) {
//			System.out.println("잘못 입력했습니다, 다시 홀수로 입력하세요.");
//		}
//		
//		for(int i = 0; i <= half1; i++) { // 마름모 상단 부분 높이
//			for(int j = 0; j < half1 - i; j++) { // half - i는 각 행별로 공백의 수를 나타냄
//				System.out.print(" ");
//			}
//			for(int k = 0; k < 2 * i - 1; k++) { // 2 * i - 1은 각 행별로 별이 찍히는 수를 나타냄
//				System.out.print("*");
//			}
//			System.out.println(); // 엔터값
//		}
//		
//		for(int i = half1 - 1; i >= 0; i--) { // 마름모 하단 부분 높이, 하단 부분은 별이 거꾸로 찍히므로 외부 for문을 거꾸로 돌린다.
//			for(int j = 0; j < half1 - i; j++) {
//				System.out.print(" ");
//			}
//			for(int k = 0; k < 2 * i - 1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		8-6. 짝수를 입력하면 그에 맞는 모래시계 모양의 별을 구현하세요.
		
//		*****
//		 ***
//		  *
//		  *
//		 ***
//		*****
		
//		System.out.println("짝수를 입력해주세요.");
//		int userNum7 = sc.nextInt();
//		
//		int half2 = userNum7/2;
//		
//		for(int i = half2 ; i > 0; i--) {
//			for(int j = 0; j < half2 - i; j++) { // 3 - 3 = 0, 3 - 2  = 1, 3 - 1  = 2
//				System.out.print(" ");
//			}
//			for(int j = 0; j < 2 * i - 1; j++) { // 5 3 1 -1 1 3
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i = 0; i < half2; i++) {
//			for(int j = 0; j < (half2 - i) - 1; j++) { // 3 - i = 2, 3 = 1, 3 = 0
//				System.out.print(" ");
//			}
//			for(int j = 0; j < 2 * i + 1; j++) { // 0 = 1, 1 = 3 2 = 5
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		

//		8-7. 홀수를 입력하면 그에 맞는 아래 모양의 별을 구현하세요.	
		
//		****** ******
//		*****   *****
//		****     ****
//		***       ***
//		**         **
//		*           *
//		**         **
//		***       ***
//		****     ****
//		*****   *****		
//		****** ******
		
		
		for(int i = 11; i >= 0; i--) {
			for(int j = 0; j < 6; j++) {
				if(i < 6 && i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				if(i >= 6 && i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}
		
		
//		8-8.
		
//		  *
//		 ***
//		*****
//		 ***
//		*****
//	   *******
//		*****
//	   *******
//	  *********
		
		
		
//		9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.

	
//		int sum = 0;
//
//		while(true) {
//			
//			System.out.println("정수를 입력하세요. q를 입력하면 프로그램이 종료됩니다.");
//			
//			String userNum5 = sc.nextLine();
//			
//			if(userNum5.equals("q")) {
//				break;
//			} 
//			
//			Integer num1 = Integer.valueOf(userNum5); // 사용자 입력값을 int로 바꿔주기 위해 Integer의 valueOf 메소드 사용
//			                                          // 객체를 반환해야 해서 num1 변수가 필요함
//			
//			if(num1!= null) {
//				sum += num1;
//			}
//			
//		}
//		System.out.println("사용자가 입력한 수의 합은: " + sum);
//		
		sc.close();
	}

	
	// 최대공약수를 반복문으로 구하는 함수 (유클리드 호제법)
    public static int gcd(int usernum3, int usernum4) {
        while (usernum4 != 0) {
            int temp = usernum4;
            usernum4 = usernum3 % usernum4;
            usernum3 = temp;
        }
        return usernum3;
    }

    // 최소공배수를 구하는 함수
    public static int lcm(int usernum3, int usernum4) {
        return (usernum3 * usernum4) / gcd(usernum3, usernum4);
    }
	
}
