package chap99_homework.homework07.basic;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용).

		StringBuffer sb1 = new StringBuffer();
		
		System.out.println("첫 번째 문자열을 입력하세요.");
		sb1.append(sc.nextLine());
		
		System.out.println("두 번째 문자열을 입력하세요.");
		sb1.append(sc.nextLine());
		
		System.out.println("세 번째 문자열을 입력하세요.");
		sb1.append(sc.nextLine());
		
		String concat = sb1.toString();
		
		System.out.println(concat);
		sc.close();
		
		System.out.println("-----------------------------------------");
		
		
//		2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//		    비어있는 바이트의 공간을 a로 모두 채우시오.
//		
		StringBuffer sb2 = new StringBuffer(30);
		
		sb2.append("hello");
		
		int remainBufferSize = sb2.capacity() - sb2.length();
		
		for(int i = 0; i < remainBufferSize; i++) {
			sb2.append("a");
		}
		
		System.out.println(sb2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
