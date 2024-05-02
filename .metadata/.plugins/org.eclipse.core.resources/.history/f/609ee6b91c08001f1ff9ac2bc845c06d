package chap99_homework;

import java.util.Random;
import java.util.Scanner;

public class _0429_basic {

	public static void main(String[] args) {
		
		Random random = new Random();
		
//		1. int num = 10;을 선언하고 증감연산자를 통해 다음과 같이 출력하세요. 출력된 값은 모두 증감연산자가 포함된 상태입니다.
//	    11
//	    12
//	    12
//	    10
//	    10
//	    8

		int num = 10;
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(num--);
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(--num);
		System.out.println("---------------------");
		
//		2. 관계연산자(<, >) 두 개를 사용하여 int a = 10; int b = 20; 의 관계를 다음과 같이 출력하세요.
//	    true
//	    false
		
		int a = 10;
		int b = 20;
		
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println("---------------------------");
		
//		3. 10 ~ 1까지 거꾸로 while문으로 출력
		
		int c = 10;
		
		while(c >= 1) {
			System.out.println("10~1까지 거꾸로 출력: " + c--);
		}
		System.out.println("-------------------------");
		
//		4. 10 ~ 1까지 거꾸로 do ~ while문으로 출력
		
	
		int m = 10;
		
		do {
			System.out.println("10~1까지 거꾸로 출력: " + m);
			--m;
		} while (m >= 1);
		System.out.println("----------------------------------");

	
//		5. 10 ~ 1까지 거꾸로 for문으로 출력
		
		for(int d = 10; d >= 1; d--) {
			System.out.println("10~1까지 거꾸로 출력: " + d);
		}
			System.out.println("-----------------------");
		
		
//		6. 1 ~ 100까지 합을 while문으로 출력
		int e = 1;
		int f = 0;
		
		while(e <= 100) {
			f += e++;
		}
		System.out.println("1~100까지 합: " + f);
		System.out.println("-----------------------------");
		
//		7. 1 ~ 100까지 합을 do ~ while문으로 출력
		
		int sum2 = 0;
		int n = 1;
		
		do {
			sum2 = sum2 + n++;  
		} while (n <= 100);
		System.out.println("1~100까지 합: " + sum2);
		System.out.println("---------------------------");

//		8. 1 ~ 100까지 합을 for문으로 출력
		
		int k = 0;
		
		for(int h = 1; h <= 100; h++) {
			k += h;
		}
		System.out.println("1~100까지의 합: "+ k);
		System.out.println("--------------------------------");

		
//		9. int 10개짜리 배열 생성하여
//		 int배열에 3의 배수를 차례대로 저장하세요.
//		 그리고 거꾸로 출력하세요.
		int[] sumArr = new int[10]; 
		
		for(int j = 10; j < sumArr.length; j--) {
			sumArr[j] = 3 * j;
			System.out.println(sumArr[j]);
		}
		System.out.println("-----------------------------");
			
//		10. int배열을 10개 생성해서
//		  사용자로부터 10개의 값을 입력받고
//		  순서대로 출력하고 총합을 구하세요.
		 int[] cumArr = new int[10]; 
		 int sum1 = 0;
		 
		 Scanner sc = new Scanner(System.in);
		 
		
		
	
//		11. int 배열로 10개의 공간을 생성하세요.
//		  1 ~ 10까지의 임의의 수를 저장하고
//		  홀수만 골라서 출력하세요.
		 
		 cumArr = new int[10];
		 
		 for(int o = 1; o <= 10; o++) {
		 cumArr[o] = random.nextInt(10);
		 
		 System.out.println(cumArr[o]);
		 }
		 
		 System.out.println("------------------------");

//		12. 정수 10개를 입력받아 배열에 저장하고, 
//		    이 정수 중에서 2의 배수와 3의 배수를 출력하세요.
		 
		 int[] numArr3 = new int[10];
		 
		 for(int p = 1; p <= 10; p++) {
			 if((int)numArr3[p] % 2 == 0 && (int)numArr3[p] % 3 == 0);
			 System.out.println((int)numArr3[p]);
		 }
		 
	}
	

}
