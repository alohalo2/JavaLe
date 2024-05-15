package chap99_homework.homework12.basic01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Basic01_TypeConversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요. 

		String userNum1 = "";
		String userNum2 = "";
		int result1 = 0;
		
		System.out.println("첫 번째 정수를 입력하세요.");
		userNum1 = sc.nextLine();
		
		System.out.println("두 번째 정수를 입력하세요.");
		userNum2 = sc.nextLine();
		
		for(int i = 0; i < userNum1.length(); i++) {
		
			userNum1.charAt(i);
			userNum2.charAt(i);
		}
		System.out.println("두 정수의 합: " + result1);
		
//		2. 사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)

//		int userNum3 = 1;
//		int userNum4 = 1;
//		double result2 = 0.0;
//
//		System.out.println("a 정수를 입력하세요.");
//		userNum3 = sc.nextInt();
//		
//		System.out.println("b 정수를 입력하세요, 0은 입력 불가능합니다.");
//		userNum4 = sc.nextInt();
//		
//		 if (userNum4 == 0) {
//	            System.out.println("0으로 나눌 수 없습니다.");
//	        } else {
//	            result2 = (double) userNum3 / userNum4;
//	        }
//	            
//		System.out.println("a/b 나눗셈 결과: " + result2);
		
//		3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.

//		double userNum5;
//		int result3;
//		
//		System.out.println("실수를 입력하세요.");
//		userNum5 = sc.nextDouble();
//		result3 = (int)userNum5;		
//		
//		System.out.println("입력한 실수를 정수형으로 출력: " + result3);

		
//		4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
		
//		double userNum6;
//		double result4;
//		
//		DecimalFormat df = new DecimalFormat("#.###"); //소숫점 몇번째 자리까지 나타내는 클래스
//		
//		System.out.println("실수를 입력하세요.");
//		userNum6 = sc.nextDouble();
//		result4 = userNum6*userNum6;
//		
//		System.out.println("입력한 실수의 제곱: " + df.format(result4));
		
		
//		5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.

//		int iNum = 10;
//		long lNum = 20;
//		
//		iNum = (int)lNum;
//		System.out.println("long lNum을 int iNum으로 값 변경: " + iNum);
//		
//		iNum = 10;
//		lNum = (long)iNum;
//		System.out.println("int iNum을 long lNum으로 값 변경: " + lNum);

//		6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
		
//		String userInput1 = "";
//		String userInput2 = "";
//		
//		char ch1 = 0;
//		char ch2 = 0;
//		
//		System.out.println("첫 번쨰 문자를 입력하세요.");
//		userInput1 = sc.nextLine();
//		
//		System.out.println("두 번쨰 문자를 입력하세요.");
//		userInput2 = sc.nextLine();
//		
//		for(int i = 0; i < userInput1.length(); i++) {
//			ch1 = userInput1.charAt(i);
//		}
//		for(int i = 0; i < userInput2.length(); i++) {
//			ch2 = userInput2.charAt(i);
//		}
//		
//		System.out.println("첫 번째 문자의 유니코드: " + (int)ch1);
//		System.out.println("두 번째 문자의 유니코드: " + (int)ch2);
		
		sc.close();
		
	}

}
