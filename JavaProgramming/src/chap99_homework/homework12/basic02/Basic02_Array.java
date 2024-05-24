package chap99_homework.homework12.basic02;

import java.util.Arrays;
import java.util.Scanner;

public class Basic02_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		--------------------배열--------------------
//		1. 1부터 10까지의 정수를 배열에 저장하고 배열의 모든 요소를 출력하세요.

//		int[] intArr1 = new int[10];
//		
//		for(int i = 0; i < 10; i++) {
//			intArr1[i] = i + 1;
//			System.out.print(intArr1[i]);
//		}

//		2. 사용자가 q를 입력하기 전까지 정수를 입력받아 배열에 저장하고 배열의 모든 요소를 출력하세요.

//		int[] intArr2 = new int[10];
//		int count1 = 0; // 사용자가 입력한 숫자를 카운팅하는 변수
//
//		while (true) {
//			System.out.println("정수를 입력하세요, q를 누르면 종료합니다.");
//			String userInput1 = sc.nextLine();
//
//			if (userInput1.equals("q")) {
//				break;
//			}
//
//			try {
//
//				int num1 = Integer.parseInt(userInput1);
//
//				intArr2[count1] = num1;
//				count1++;
//
//				if (count1 > intArr2.length) {
//					intArr2 = Arrays.copyOf(intArr2, intArr2.length * 2);
//				}
//
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//
//		}
//
//		int[] resultArr1 = Arrays.copyOf(intArr2, count1);
//
//		System.out.println("사용자 입력한 모든 정수는: " + Arrays.toString(resultArr1));

//		3. 사용자가 입력한 10개의 정수를 배열에 저장하고 평균을 계산하여 출력하세요.

//		int[] intArr3 = new int[10];
//		int sum = 0;
//		int avg = 0;
//
//		for (int i = 0; i < 10; i++) {
//			System.out.println("정수를 입력하세요.");
//			intArr3[i] = sc.nextInt();
//			sum += intArr3[i];
//			avg = sum / intArr3.length;
//		}
//
//		System.out.println("사용자가 입력한 정수들의 평균: " + avg);

//		4. 1부터 100까지의 숫자 중에서 짝수만 배열에 저장하고 배열의 합을 계산하여 출력하세요.

//		int[] intArr4 = new int[101];
//		int sum2 = 0;
//		
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 ==0) {
//				intArr4[i] = i;
//				sum2 += intArr4[i];
//			}
//		}
//		
//		System.out.println("1~100까지의 숫자 중 짝수들의 합: " + sum2);
//		
//		int[] intArr5 = new int[101];
//		int sum3 = 0;
//		
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 !=0) {
//				intArr5[i] = i;
//				sum3 += intArr5[i];
//			}
//		}
//		
//		System.out.println("1~100까지의 숫자 중 홀수들의 합: " + sum3);

//		5. 사용자가 입력한 10개의 정수를 배열에 저장하고 최소값과 최대값을 찾아서 출력하세요.

//		int[] intArr6 = new int[10];
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println("정수를 입력하세요.");
//			intArr6[i] = sc.nextInt();
//			if(intArr6[i] > max) {
//				max = intArr6[i];
//			} 
//			if(intArr6[i] < min) {
//				min = intArr6[i];
//			}
//		}
//			
//		System.out.println("사용자가 입력한 수 중 최대값: " + max);
//		System.out.println("사용자가 입력한 수 중 최소값: " + min);

//		6. 사용자가 입력한 5개의 문자열을 배열에 저장하고 길이가 가장 긴 문자열과 길이가 가장 작은 문자열을 출력하세요.

//		String[] strArr1 = new String[5];
//		int intMax = Integer.MIN_VALUE;
//		String strMax = null;
//		int intMin = Integer.MAX_VALUE;
//		String strMin = null;
//		
//		for(int i = 0; i < strArr1.length; i++) {
//			System.out.println("문자열을 입력하세요.");
//			strArr1[i] = sc.nextLine();
//			
//			if(strArr1[i].length() > intMax) {
//				intMax = strArr1[i].length();
//				strMax = strArr1[i]; 
//			}
//			if(strArr1[i].length() < intMin) {
//				intMin = strArr1[i].length();
//				strMin = strArr1[i]; 
//			}
//		}
//		
//		System.out.println("사용자가 입력한 문자열 중 가장 긴 문자열: " + strMax);
//		System.out.println("사용자가 입력한 문자열 중 가장 짧은 문자열: " + strMin);

//		7. 두 개의 정수형 배열을 만들고 1 ~ 100까지의 랜덤한 값으로 첫 번째 배열은 4개 두 번째 배열은 3개를 저장하고 두 배열을 합친 새로운 배열을 생성하세요.

//		int[] intArr7 = new int[4];
//		int[] intArr8 = new int[3];
//		int[] newArr1 = new int[7];
//		
//	
//		
//		for(int i = 0; i < intArr7.length; i++) {
//			intArr7[i] = (int)(Math.random()*100) + 1;
//			System.out.print(intArr7[i] + " ");	
//		}
//		System.out.println();
//		
//		for(int i = 0; i < intArr8.length; i++) {
//			intArr8[i] = (int)(Math.random()*100) + 1;
//			System.out.print(intArr8[i] + " ");	
//		}
//		System.out.println();
//	
//		for(int i = 0; i < newArr1.length; i++) {
//			if(i <= intArr7.length) {
//				newArr1[i] = intArr7[i];
//			} else {
//				newArr1[i] = intArr8[i];
//			}
//			System.out.print(newArr1[i] + " ");
//		}

//		8. 사용자가 문자열을 입력하는데 문자열 사이사이에 -을 넣어 구분자로 만들어준다. -기준으로 잘라진 문자열 배열을 생성하고 잘라진 문자열 중에
//		    가장 길이가 긴 문자열의 인덱스와 그 문자열을 출력하세요.

		System.out.println("'-'를 넣어 구분자로 나누어진 문자열을 입력하세요.");
		String userInput1 = sc.nextLine();

		String[] str = userInput1.split("-");

		String longest = null;
		int index = 0;

		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if (str[i].length() < str[j].length()) {
					longest = str[j];
					index = j;
				}
			}
		}
		System.out.println("가장 긴 문자열: " + longest + ", 그 인덱스: " + index);

		sc.close();

	}

}
