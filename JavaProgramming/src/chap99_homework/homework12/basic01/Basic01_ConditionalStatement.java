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
//		System.out.println("---------------------");

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
//		System.out.println("---------------------");

//		3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, "Python"인 경우 "공부중인 언어입니다."를 출력하고, 
//		   그렇지 않은 경우 "다른 언어를 공부해보세요."를 출력하세요.(switch~case~default 사용)

//		System.out.println("컴퓨터 언어를 입력하세요.");
//		String userInput1 = sc.nextLine();
//	
//		switch(userInput1) {
//		
//			case "Java":
//				System.out.println("좋아하는 언어입니다.");
//				break;
//			case "Python":
//				System.out.println("공부중인 언어입니다.");
//				break;
//			default:
//				System.out.println("다른 언어를 공부해보세요.");
//		
//		}
//		System.out.println("---------------------");

//		4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)

//		System.out.println("숫자를 입력하세요.");
//		int userNum4 = sc.nextInt();
//		int result1;
//		
//		if(userNum4 % 3 == 0) {
//			result1 = userNum4 % 3;
//		} else {
//			result1 = userNum4 % 3;
//		}
//		
//		
//		switch(result1) {
//			case 0:
//				System.out.println("3의 배수입니다.");
//				break;
//			case 1:
//				System.out.println("3의 배수가 아닙니다.");
//				break;
//			case 2:
//				System.out.println("3의 배수가 아닙니다.");
//				break;
//			default:
//					
//		}
//		System.out.println("---------------------");

//		5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.

//		System.out.println("숫자를 입력하세요.");
//		int userNum5 = sc.nextInt();
//		
//		if(userNum5 != 0) {
//			if(userNum5 % 2 == 0) {
//				System.out.println("짝수입니다.");
//			} else {
//				System.out.println("홀수입니다.");
//			}
//		} else {
//			System.out.println("입력한 숫자는 0입니다.");
//		}
//		System.out.println("---------------------");

//		6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.

//		int[] intArr1 = new int[5];
//		
//		int max = intArr1[0];
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("정수를 입력하세요.");
//			intArr1[i] = sc.nextInt();
//			max = intArr1[0];
//			
//			if(intArr1[i] > max) {
//				max = intArr1[i];
//			}
//		}
//		
//		System.out.println("입력한 정수 중 최대값: " + max);
//		System.out.println("---------------------");

//		7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고, 그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.

//		System.out.println("문자열을 입력하세요.");
//		String userInput2 = sc.nextLine();
//
//		if(userInput2.equals("Yes")) {
//			System.out.println("예");
//		} else if(userInput2.equals("No")) {
//			System.out.println("아니오");
//		} else {
//			System.out.println("잘못 입력했습니다.");
//		}
//			
//		System.out.println("-----------------------");

//		8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다." 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.

//		System.out.println("첫 번째 정수를 입력하세요.");
//		int userNum6 = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.println("두 번째 정수를 입력하세요.");
//		int userNum7 = sc.nextInt();
//		
//		if(userNum6 == userNum7) {
//			System.out.println("두 수가 같습니다.");
//		} else if(userNum6 > userNum7) {
//			System.out.println("첫 번째 수가 더 큽니다.");
//		} else {
//			System.out.println("두 번째 수가 더 큽니다.");
//		}
//		
//		System.out.println("--------------------------");

//		9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다." 그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.
		
//		이 문제에서는 개별 정수에 대해 조건을 검사하고, 그에 따라 짝수와 홀수의 개수를 세는 로직이 필요하다.
		
		
		int userNum8 = 0;
		int userNum9 = 0;
		int userNum10 = 0;
		int evenNumCnt = 0;
		int oddNumCnt = 0;
		
		System.out.println("세 정수를 입력하세요:");
        userNum8 = sc.nextInt();
        userNum9 = sc.nextInt();
        userNum10 = sc.nextInt();

//		이 문제에서는 개별 정수에 대해 조건을 검사하고, 그에 따라 짝수와 홀수의 개수를 세는 로직이 필요
//      따라서 사용자 입력값을 각 변수에 저장 후 각 변수가 홀수인지 짝수인지 비교 필요
//      개별적으로 홀수, 짝수 비교가 필요하기 때문에 if-else 조건문도 비교하는 수만큼 필요
        
		if(userNum8 % 2 == 0) {
			evenNumCnt++;
		} else {
			oddNumCnt++;
		}
		
		if(userNum9 % 2 == 0) {
			evenNumCnt++;
		} else {
			oddNumCnt++;
		}
		
		if(userNum10 % 2 == 0) {
			evenNumCnt++;
		} else {
			oddNumCnt++;
		}
		
		if(evenNumCnt == 3) {
			System.out.println("입력한 정수가 모두 짝수입니다.");
		} else if(oddNumCnt == 3) {
			System.out.println("입력한 정수가 모두 홀수입니다.");
		} else {
			System.out.println("입력한 정수 중 " + "짝수 : " + evenNumCnt + "개, 홀수: " + oddNumCnt + "개");
		}

		
		sc.close();

	}

}
