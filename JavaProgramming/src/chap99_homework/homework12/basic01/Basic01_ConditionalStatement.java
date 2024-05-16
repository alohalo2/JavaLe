package chap99_homework.homework12.basic01;

import java.util.Scanner;

public class Basic01_ConditionalStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
		
//		System.out.println("첫 번째 정수를 입력하세요.");
//		int userNum1 = sc.nextInt();
//		
//		System.out.println("두 번째 정수를 입력하세요.");
//		int userNum2 = sc.nextInt();
//		
//		if(userNum1 > userNum2) {
//			System.out.println("입력한 두 수 중에 큰 수는 " + userNum1 + " 입니다.");
//		} else if(userNum1 < userNum2) {
//			System.out.println("입력한 두 수 중에 큰 수는 " + userNum2 + " 입니다.");
//		} else {
//			System.out.println("입력한 두 수 중에 큰 수는 같습니다.");
//		}
		
//		2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.

//		System.out.println("정수를 입력하세요.");
//		double userNum3 = sc.nextDouble();
//		
//		if(userNum3 > 0) {
//			System.out.println("입력한 정수는 양수 입니다.");
//		} else if(userNum3 < 0) {
//			System.out.println("입력한 정수는 음수 입니다.");
//		} else {
//			System.out.println("입력한 정수는 0 입니다.");
//		}
		
//		3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, "Python"인 경우 "공부중인 언어입니다."를 출력하고, 
//		   그렇지 않은 경우 "다른 언어를 공부해보세요."를 출력하세요.(switch~case~default 사용)
		
		System.out.println("컴퓨터 언어를 입력하세요.");
		String userInput1 = sc.nextLine();
	
		switch(userInput1) {
		
			case "Java":
				System.out.println("좋아하는 언어입니다.");
				break;
			case "Python":
				System.out.println("공부중인 언어입니다.");
				break;
			default:
				System.out.println("다른 언어를 공부해보세요.");
		
		}
		

//		4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)

		System.out.println("숫자를 입력하세요.");
		int userNum4 = sc.nextInt();
		int result1;
		
		if(userNum4 % 3 == 0) {
			result1 = userNum4 % 3;
		} else {
			result1 = userNum4 % 3;
		}
		
		
		switch(result1) {
			case 0:
				System.out.println("3의 배수입니다.");
				break;
			case 1:
				System.out.println("3의 배수가 아닙니다.");
				break;
			case 2:
				System.out.println("3의 배수가 아닙니다.");
				break;
			default:
					
		}
		
		
		
//		5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.

		
		
//		6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.

		
		
//		7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고, 그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.

		
		
//		8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다." 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.

		
		
//		9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다." 그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
