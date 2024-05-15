package chap99_homework.homework12.basic01;

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
		
		
//		2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
		
//		int num1;
//		int num2;
//		String ch1;
//		String result;
//		
//		System.out.println("첫 번째 정수를 입력하세요.");
//		num1 = sc.nextInt();
//		
//		System.out.println("두 번쨰 정수를 입력하세요.");
//		num2 = sc.nextInt();
//		
//		System.out.println("연산자를 입력하세요.");
//		ch1 = sc.nextLine();
//		sc.nextLine();
		
		
		
		
//		3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
//		    단, 원주율 3.14는 상수로 선언하세요.
		
//		final double Pi = 3.14;
//		
//		double area;
//		double round;
//		int radius = 20;
//		
//		area = (2*Pi*radius)/2;
//		round = 4*Pi*radius;
//		
//		System.out.println("반지름이 20인 원의 넓이: " + Math.round(area));
//		System.out.println("반지름이 20인 원의 둘레: " + Math.round(round));
	
		
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
		
//		5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.

//		int max;
//		int min;
//		int mid;
//		
//		int[] intArr2 = new int[3];
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.println("정수를 입력하세요.");
//			intArr2[i] = sc.nextInt();
//			
//			if(max > min) {
//				
//			}
//;		}
		
		
//		6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
//													  2 * 2 = 4
//													  .....
//													  2 * 9 = 18 
		System.out.println("출력할 구구단의 숫자를 입력하세요.");
		int num3 = sc.nextInt();
		

		System.out.println(num3 + "단 시작");
		for(int i=1; i <= 9; i++) {
			System.out.println(num3 + " * " + i + " = " + (num3*i) + "   ");
				
		}
		System.out.println(num3 + "단 끝");
		
		System.out.println("------------------------");
		
//		7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)

		
		
		
		
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
