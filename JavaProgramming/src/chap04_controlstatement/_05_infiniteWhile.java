package chap04_controlstatement;

import java.util.Scanner;  // ctrl + shift + o(영문 o)

public class _05_infiniteWhile {

	public static void main(String[] args) {
		
		// Scanner: 사용자의 입력 값을 받아주는 클래스
		// System: 현재 사용중인 운영체제의 정보를 가져오는 클래스
		// System.in: 현재 사용중인 운영체제의 입력장치 ex) 키보드, 마우스
		Scanner sc = new Scanner(System.in);
		
		// 무한루프 구문
		// 특정 조건일 때 break구문을 사용해서 while문을 종료시킨다.
		while(true) {
			System.out.println("문자열을 입력하세요."); // println에서 ln은 line으로 엔터값을 포함한다.
			// Scanner.nextInt(): 입력받은 정수값을 리턴해주는 메소드. 엔터값 포함되지 않음.
			// Scanner.next(): 입력받은 문자열을 리턴해주는 메소드. 엔터값 포함하지 않음.
			// Scanner.nextLine(): 입력받은 문자열을 리턴해주는 메소드. 엔터값을 포함한 문자열을 리턴.
			
			String inputStr = sc.nextLine();
			
			System.out.println("입력한 문자열: " + inputStr);
			
			// 입력한 문자열이 q일때 while문을 종료시키는 if문을 작성하세요.
			// String.equalsIgnoreCase(): 대소문자 구분없이 값비교(기준점은 소문자로 비교)
			if(inputStr.equalsIgnoreCase("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}

		sc.close(); // 
		
	}

}
