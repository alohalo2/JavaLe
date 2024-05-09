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
		
		char prechar = '\0';

//		'\0'는 널 문자(Null character)를 나타냅니다. 이는 문자열이나 문자 배열에서 종료를 나타내는데 사용됩니다. 
//		Java에서는 문자열의 끝을 표시하기 위해 널 문자를 사용하지 않습니다. 대신, 문자열의 끝은 문자열의 길이로 판단됩니다.
//
//		이 코드에서는 이전 문자를 추적하기 위해 초기에 \0를 사용했습니다. 이전 문자가 없는 경우를 표시하기 위한 것입니다. 
//		코드에서 이전 문자를 초기화할 때, 이전 문자가 없음을 나타내기 위해 사용된 것입니다. 이후에는 실제 문자로 대체됩니다.
		
		for(int i = 0; i < userInput.length(); i++) {
			char currentchar = userInput.charAt(i);
			if(userInput.indexOf(currentchar) == i || userInput.indexOf(currentchar) < i) {
				sb.append(userInput.charAt(i));
			}
		
		}
		System.out.println(sb);
		
		sc.close();
		
	}

}
