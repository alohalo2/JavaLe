package chap99_homework.homework01;

import java.util.Random;

public class _0429_middle {

	public static void main(String[] args) {
		
//		1. 1~100까지의 숫자 중 2와 3의 공배수를 출력하세요.
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0 && i % 3 == 0)  {
				System.out.print(i + ", ");
			} // => if문의 조건만 완성
		}
		
		System.out.println("-----------------------");

		
		
//		3. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요.

		int num = 1;
		
		while(num <= 10) {
			num = num + 1;
			if(num % 2 == 0) {
				System.out.println(num);
			}
			
		}
		System.out.println("--------------------------");
		
//		4. 1000이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력하고,
//		   그 출력된 숫자들의 합을 구하는 프로그램을 작성하세요.
		int sum = 0;
		int i = 0;
		
		do {
			i++;
			if(i % 2 == 0 && i % 7 == 0) {
			System.out.println("2의 배수이면서 7의 배수: " + i);
			}
			sum = sum + i;
		} while(i <= 1000);
		System.out.println("출력된 숫자들의 합: " + sum);
		System.out.println("----------------------------");
		
//		5. 20개 배열을 선언하세요.
//		    20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고
//		    인덱스의 홀수번째는 앞에서부터 출력하고
//		    짝수번째는 뒤에서부터 출력하세요.
		Random random = new Random();
		
		int[] numArr = new int[20];
		
		for(int j = 1; j < numArr.length; j++) {
			numArr[j] = random.nextInt(100);
			
			if((int)numArr[j] % 2 != 0) {
				System.out.println((int)numArr[j]);
			} else {
				System.out.println((int)numArr[j]);
			}
		}
		System.out.println("-------------------------");
		
//		6. 중첩 for문을 이용해서 아래와 같이 출력하세요.
//		6-1)  
//		*
//		**
//		***
//		****
//		*****
		
		for(int m = 1; m <= 5; m++) {
			for(int n = 0; n < m; n++) {
				System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("------------------------------");

		
		
//		6-2)
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		for(int m = 1; m < 6; m++) {
			for(int n = 6; n > m; n--) {
				System.out.print(" ");
			}
			for(int n = 0; n < m; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
//		6-3)
//		*****
//		****
//		***
//		**
//		*
		for(int m = 1; m <= 5; m++) {
			for(int n = 5; n >= m; n--) {
				System.out.print("*");
				}
				System.out.println();
			}
		
		System.out.println("----------------------------");
		
//		6-4)
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		for(int m = 1; m <= 5; m++) {
			for(int n = 5; n > m; n--) {
				System.out.println(" ");
			}
			for(int n = 0; n < m; n++) {
				System.out.print("*");
				}
				System.out.println();
			}
		
		
	}
}


