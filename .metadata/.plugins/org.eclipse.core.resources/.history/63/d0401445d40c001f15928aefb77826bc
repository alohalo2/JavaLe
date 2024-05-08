package chap99_homework.homework06.basic;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		
//		1. 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
//		   0개면 '가, 바가 존재하지 않습니다.'라고 출력.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");

		String inputText = sc.nextLine();
		
		int ch1 = 0;
		int ch2 = 0;
		
		for(int i = 0; i < inputText.length(); i++) {
			if(inputText.charAt(i) == '가') {
				ch1++;
			} 
			if (inputText.charAt(i) == '바') {
				ch2++;
			}
		}
		
		if(ch1 == 0 && ch2 == 0) {
			System.out.println("가,바가 존재하지 않습니다.");
		}
		System.out.println("사용자가 입력한 문자열 중 " + "'가': " + ch1 + "개, " + "'바': " + ch2 + "개" );
		
		
		System.out.println("------------------------------------");
		
		
//		2. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
//		   대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u
		
		System.out.println("영문을 입력하세요.");
		String inputEng = sc.nextLine();
		
		String newStr = inputEng.replaceAll("[aeiouAEIOU]", "");
		System.out.println(newStr);
		
		System.out.println("-------------------");
		
//		3. 16.459를 소수점 둘 째 자리까지 반올림해서 출력(xx.xx), Math.round 메소드 이용

		double num = 16.459;
		
		System.out.println((double)(Math.round(num*100)/100.0));
		
		
	sc.close();	
	}
	
}


