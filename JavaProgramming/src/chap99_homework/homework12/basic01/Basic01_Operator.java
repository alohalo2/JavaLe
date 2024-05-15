package chap99_homework.homework12.basic01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Basic01_Operator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		1. 사용자가 입력한 두 정수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//		  (메소드로 따로 만들지 말고 메인메소드에서 구현)

//		int userNum1;
//		int userNum2;
//		
//		DecimalFormat df = new DecimalFormat("#.###"); //소숫점 몇번째 자리까지 나타내는 클래스
//		
//		System.out.println("첫 번째 정수를 입력하세요.");
//		userNum1 = sc.nextInt();
//		
//		System.out.println("두 번째 정수를 입력하세요.");
//		userNum2 = sc.nextInt();
//		
//		int add;
//		int sub;
//		int mul;
//		int div = 0;
//		double mod = 0.0;
//		
//		add = userNum1 + userNum2;
//		sub = userNum1 - userNum2;
//		mul = userNum1 * userNum2;
//		
//		if(userNum2 != 0) {
//			div = userNum1 / userNum2;
//			mod = userNum1 % userNum2;
//		} else if(userNum2 == 0) {
//			System.out.println("0으로는 나눌 수 없습니다.");
//		}
//		
//		System.out.println("두 정수의 덧셈은: " + userNum1 + " + " + userNum2 + " = " + add);
//		System.out.println("두 정수의 뺄셈은: " + userNum1 + " - " + userNum2 + " = " + sub);
//		System.out.println("두 정수의 곱셈은: " + userNum1 + " * " + userNum2 + " = " + mul);
//		System.out.println("두 정수의 나눗셈은: " + userNum1 + " / " + userNum2 + " = " + div);
//		System.out.println("두 정수의 나눗셈의 나머지는: " + userNum1 + " % " + userNum2 + " = " + df.format(mod));

		
//		2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요. 
//		21, 22, 22, 21, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20
		
//		int num1 = 20;
//		
//		System.out.println(++num1); // 출력:21 , num1:21
//		System.out.println(++num1); // 출력:22 , num1:22
//		System.out.println(num1--); // 출력:22 , num1:21
//		System.out.println(num1--); // 출력:21 , num1:20
//		System.out.println(num1); // 출력:20 , num1:20
//		System.out.println(num1--); // 출력:20 , num1:19
//		System.out.println(num1++); // 출력:19 , num1:20
//		System.out.println(num1);
		
//		3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 아니면 "2와 7의 공배수가 아님"이라고 출력하세요.

//		System.out.println("정수를 입력하세요.");
//		int userNum3 = sc.nextInt();
//		
//		if(userNum3 % 14 == 0) {
//			System.out.println("입력한 정수가 2와 7의 공배수 입니다.");
//		} else {
//			System.out.println("입력한 정수가 2와 7의 공배수가 아닙니다.");
//		}
		
//		4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.

//		System.out.println("문자열을 입력하세요.");
//		String userInput1 = sc.nextLine();
//		
//		int result1 = userInput1.compareTo("hello");
//
//        if (result1 == 0) {
//        	System.out.println("입력한 문자열이 hello와 같습니다.");
//        } else {
//            System.out.println("입력한 문자열이 hello와 다릅니다.");
//        }
		
//		5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.

//        System.out.println("정수를 입력하세요.");
//        int userNum4 = sc.nextInt();
//        
//        String result2 = (userNum4 % 2 == 0) ? "짝수" : "홀수";
//        
//        System.out.println("입력한 정수는 " + result2 + "입니다.");

		
//        if(userNum4 % 2 == 0) {
//        	System.out.println("입력한 정수는 짝수입니다.");
//        } else if(userNum4 % 3 == 0) {
//        	System.out.println("입력한 정수는 홀수입니다.");
//        }
        
//		6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼" 작으면 "100보다 작음" 같으면 "100"을 출력하세요.
        
//        System.out.println("정수를 입력하세요.");
//        int userNum5 = sc.nextInt();
//        
//        String result3 = (userNum5 > 100)? "100보다 큽니다." : (userNum5 < 100) ? "100보다 작습니다." : "100 입니다.";
//        
//        System.out.println("입력한 정수는 " + result3);	
		
//		7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
		
//		DecimalFormat df = new DecimalFormat("#.###"); //소숫점 몇번째 자리까지 나타내는 클래스
//		
//		System.out.println("첫 번째 실수를 입력하세요.");
//		double userNum6 = sc.nextDouble();
//		
//		System.out.println("두 번째 정수를 입력하세요.");
//		double userNum7 = sc.nextDouble();
//		
//		double add;
//		double sub;
//		double mul;
//		double div = 0;
//		double mod = 0.0;
//		
//		add = userNum6 + userNum7;
//		sub = userNum6 - userNum7;
//		mul = userNum6 * userNum7;
//		
//		if(userNum7 != 0) {
//			div = userNum6 / userNum7;
//			mod = userNum6 % userNum7;
//		} else if(userNum7 == 0) {
//			System.out.println("0으로는 나눌 수 없습니다.");
//		}
//		
//		System.out.println("두 정수의 덧셈은: " + userNum6 + " + " + userNum7 + " = " + add);
//		System.out.println("두 정수의 뺄셈은: " + userNum6 + " - " + userNum7 + " = " + df.format(sub));
//		System.out.println("두 정수의 곱셈은: " + userNum6 + " * " + userNum7 + " = " + df.format(mul));
//		System.out.println("두 정수의 나눗셈은: " + userNum6 + " / " + userNum7 + " = " + df.format(div));
//		System.out.println("두 정수의 나눗셈의 나머지는: " + userNum6 + " % " + userNum7 + " = " + df.format(mod));

//		8. 사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.

		System.out.println("문자열을 입력하세요.");
		String userInput2 = sc.nextLine();
		
		System.out.println("정수를 입력하세요.");
		String str = "";
		str = str.valueOf(sc.nextInt());
		
		System.out.println("입력한 문자열은 " + userInput2 + "이고, " + 
				"입력한 숫자는 " + str + "입니다.");
		
		sc.close();

	}

}
