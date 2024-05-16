package chap22_lambda;

import java.util.Scanner;

import chap22_lambda.basiclambda.IndexOfString;

public class _05_LambdaEx01 {

	public static void main(String[] args) {
		
		// 람다식은 메소드를 거꾸로 넣는거라고 생각
		findIndex((st1, st2) -> st1.indexOf(st2)); // indexOf: 포함하고 있는지를 비교해주고 return 값이 false면 -1, 
												   // true면 0을 return 받음 
		
	}
	
	// 문자열 2개를 입력받아서 
	// 첫 번째 입력받은 문자열에서 
	// 두 번째 입력받은 문자열이 어느 위치(인덱스)에 있는지 검사하는 메소드를 구현하세요.
	// 매개변수는 함수형 인터페이스인 IndexOfString을 받습니다.
	// 검사해서 첫 번째 문자열에 두 번째 문자열이 포함되어있으면 
	// 감사합니다.에서 합니의 인덱스는 2입니다. 라고 출력
	// 검사해서 첫 번째 문자열에 두 번째 문자열이 포함되어있지 않으면 
	// 감사합니다.에서 가나다를 찾을 수 없습니다. 라고 출력
	
	public static void findIndex (IndexOfString indexOfString) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요");
		String str1 = sc.nextLine();
		
		System.out.println("문자열을 입력하세요");
		String str2 = sc.nextLine();
		
		// findIndex 메소드를 호출하면서 매개변수로 전달한 람다식이 실행된다.
		int index = indexOfString.indexOf(str1, str2);
		
		if(index != -1) {
			System.out.println(str1 + "에서 " + str2 + "의 인덱스는 " + index + "입니다.");
		} else {
			System.out.println(str1 + "에서 " + str2 + "를(을) 찾을 수 없습니다. ");
		}
		
		
//		String[] strArr = new String[str1.length()];
//		
//		for(int i = 0; i < str1.length(); i++) {
//			strArr[i] = str1;
//		}
//		
//		for(int i = 0; i < strArr.length; i++) {
//			if(strArr[i].equals(str2)) {
//				System.out.println(str1 + "에서 " + str2 + "의 인덱스는 " + i + "입니다.");
//			} else if(!strArr[i].equals(str2)) {
//				System.out.println(str1 + "에서 " + str2 + "를 찾을 수 없습니다. ");
//			}
//		}
		
		
	}
}
