package chap99_homework.homework07.advance;

import java.util.Scanner;


public class Advance {

	public static void main(String[] args) {
		
//		1. 사용자 입력한 문자열에서 연속된 동일한 문자를 찾고
//	     연속된 동일한 문자를 발견했을 때 하나빼고 다 제거하여
//	     출력하세요. (단, 대소문자 구분함. StringBuilder를 사용하세요.)
//	     ex) aabbcdeffaaaaynguuuuuu -> abcdefayngu
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String userInput = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		String result = null;
		
		for(int i = 0; i < userInput.length(); i++) {
			if(userInput.indexOf(sb.charAt(i)) != userInput.charAt(i)) {
				result += userInput.charAt(i);
			}
		
		}
		System.out.println(result);
		
		sc.close();
		
	}

}
