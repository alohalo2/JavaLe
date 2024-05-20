package chap99_homework.homework12.basic01;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Basic01_Variable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
 
//		String name;
//		int age;
//		String gender;
//		
//		System.out.println("이름을 입력하세요.");
//		name = sc.nextLine();
//		
//		System.out.println("나이를 입력하세요.");
//		age = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.println("성별을 입력하세요.");
//		gender = sc.nextLine();
//		
//		System.out.println("입력한 내용 출력합니다 => 이름: " + name + ", 나이: " + age + ", 성별: " + gender);
//		System.out.println("-----------------------------------");
		
//		2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
		
//		int num1;
//		int num2;
//		char ch1;
//		int result = 0;
//		
//		System.out.println("첫 번째 정수를 입력하세요.");
//		num1 = sc.nextInt();
//		
//		System.out.println("두 번쨰 정수를 입력하세요.");
//		num2 = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.println("연산자를 입력하세요.(+, -, *, /, % 중에 하나)");
//		ch1 = sc.nextLine().charAt(0);
//
//		switch (ch1) {
//			case '+': 
//				result = num1 + num2;
//				break;
//			case '-':
//				result = num1 - num2;
//				break;
//			case '*':
//				result = num1 * num2;
//				break;
//			case '/':
//				result = num1 / num2;
//				break;
//			case '%':
//				result = num1 % num2;
//				break;
//					
//		}
//		
//		System.out.println(result);
//		System.out.println("------------------------");
	
		
//		3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
//		    단, 원주율 3.14는 상수로 선언하세요.
		
//		final double Pi = 3.14;
//		DecimalFormat df = new DecimalFormat("#.###");
//		
//		double area;
//		double round;
//		int radius = 20;
//		
//		area = (2*Pi*radius)/2;
//		round = 4*Pi*radius;
//		
//		System.out.println("반지름이 20인 원의 넓이: " + df.format(area));
//		System.out.println("반지름이 20인 원의 둘레: " + df.format(round));
//		System.out.println("--------------------------");
		
//		4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
		
//		int[] intArr1 = new int[5];
//		int sum = 0;
//		int avg = 0;
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("정수를 입력하세요.");
//			intArr1[i] = sc.nextInt();
//			
//			sum += intArr1[i];
//			avg = sum/5;
//		}
//		
//		System.out.println("입력한 수의 합: " + sum);
//		System.out.println("입력한 수의 평균: " + avg);
//		System.out.println("-----------------------------");
		
//		5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.

//		int[] intArr2 = new int[5];
//		
//		//max
//		int max = intArr2[0]; // max를 배열의 첫번째로 초기화함
//		for(int i = 0; i < 5; i++) { // 
//			System.out.println("정수를 입력하세요.");
//			intArr2[i] = sc.nextInt(); // 사용자 입력값을 intArr2 배열에 저장함
//			
//			if(intArr2[i] > max) { // intArr2[i] 값이 max보다 클 경우에 max를 intArr[i]로 값을 초기화한다.
//				max = intArr2[i];
//			} 
//		}
//		// min
//		int min = intArr2[0]; // min을 배열의 첫번째로 초기화함
//		for(int i : intArr2) { // 향상된 for문을 통해 intArr2 배열에 int i를 각각 대입함
//			if(i < min) { // int i가 min(배열의 첫 번째 값) 보다 작을 경우 그 값을 min으로 설정함 
//				min = i;
//			}
//		}
//		
//		// mid
//		int mid = 0;
//		Arrays.sort(intArr2); // 사용자가 랜덤하게 입력한 수의 배열을 Arrays의 sort 메소드를 통해서 정렬해줌
//		mid = intArr2[intArr2.length/2]; // 정렬된 배열에서 배열의 길이 나누기 2로 중간 인덱스를 구함 
//		
//		
//		System.out.println("사용자 입력값 중 최대값: " + max + ", 중간값 " + mid + ", 최소값 " + min);
//		System.out.println("--------------------------");
		
//		6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
//													  2 * 2 = 4
//													  .....
//													  2 * 9 = 18 
//		System.out.println("출력할 구구단의 숫자를 입력하세요.");
//		int num3 = sc.nextInt();
//		
//
//		System.out.println(num3 + "단 시작");
//		for(int i=1; i <= 9; i++) {
//			System.out.println(num3 + " * " + i + " = " + (num3*i));
//				
//		}
//		System.out.println(num3 + "단 끝");
//		
//		System.out.println("------------------------");
		
//		7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
		
		
//		// 팩토리얼 => 4*3*2*1, 3*2*1
//		System.out.println("정수를 입력하세요.");
//		int num4 = sc.nextInt(); // 사용자 입력값을 num4로 초기화
//		
//		long result = 1; // 팩토리얼 결과를 저장할 변수 result를 long 타입을 사용하여 큰 수를 처리할 수 있게 하고 
//		                 // 0이 아닌 1도 초기화해서 값이 0이되지 않도록 한다.
//		
//		for(int i = 1; i <= num4; i++) { // for문으로 1~사용자 입력값만큼 돌려서 (result = result * i)로 설정해 i 값이 바뀔때마다 곱해준다. 
//			result *= i;				 // ex) result = result * i 
//										 //     result = result * i * (i - 1) 
//										 //     result = result * i * (i - 1) * (i - 2)
//										 //     ...
//			
//		}
//		System.out.println(result);
//		System.out.println("---------------------");
		
//		BigInteger bigInt = new BigInteger("1");
//		bigInt = BigInteger.ONE;
//		
//		int[] intArr = new int[100];
//		
//		for(int i = 1; i < 100; i++) {
//			bigInt = bigInt.multiply(BigInteger.valueOf(i));
//		}
//		System.out.println(bigInt);
//
//		long num = factorial(10);
//		
//		System.out.println(num);
//		
//		// 100!
//		System.out.println(factorialBigInteger(BigInteger.valueOf(100L)));
		

		
//		8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
//		   사용자가 입력할 수 있는 값은 2 ~ 30로 제한
		
//		int[] intArr3 = new int[10];
//		
//		for(int i = 2; i <= 30; i++) {
//			System.out.println("2 ~ 30까지 10개의 정수를 입력하세요.");
//			intArr3[i] = sc.nextInt();
//			if(i == 10) {
//				if(intArr3[i]%2 != 0 && intArr3[i]%3 != 0) {
//					System.out.println(intArr3[i]);
//					System.out.println(i);
//				}
//			} else if(i < 10) {
//				System.out.println("정수를 더 입력하세요.");
//				continue;
//			} else if(i > 10) {
//				System.out.println("입력 횟수를 초과했습니다.");
//				break;
//			}
//		
//		}
	
	sc.close();

	}

}
