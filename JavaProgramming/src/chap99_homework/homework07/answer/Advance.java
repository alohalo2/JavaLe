package chap99_homework.homework07.answer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자 입력한 문자열에서 연속된 동일한 문자를 찾고
//		     연속된 동일한 문자를 발견했을 때 하나빼고 다 제거하여
//		     출력하세요. (단, 대소문자 구분함. StringBuilder를 사용하세요.)
//		     ex) aabbcdeffaaaaynguuuuuu -> abcdefayngu
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요.");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		
		System.out.println("입력한 문자열 : " + sb);
		
		for(int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) == sb.charAt(i - 1)) {
				sb = sb.delete(i, i + 1);
				i--; // delete로 삭제된 부분의 인덱스를 상쇄시키기 위함 / 1234 -> 124(3을 삭제 후 4는 3의 인덱스 자리에 있게됨)
			}
		}
		
		System.out.println("연속된 동일한 문자를 제거한 문자열 : " + sb);
	}
}
