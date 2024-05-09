package chap99_homework.homework07.basic;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용).

		StringBuffer sb1 = new StringBuffer();
		
		System.out.println("첫 번째 문자열을 입력하세요.");
		sb1.append(sc.nextLine()); // sb1에 append로 사용자가 첫 번째로 입력한 문자열을 저장
		
		System.out.println("두 번째 문자열을 입력하세요.");
		sb1.append(sc.nextLine()); // sb1에 append로 사용자가 두 번째로 입력한 문자열을 저장
		
		System.out.println("세 번째 문자열을 입력하세요.");
		sb1.append(sc.nextLine()); // sb1에 append로 사용자가 세 번째로 입력한 문자열을 저장
		
		String concat = sb1.toString(); // sb1을 String으로 변환
		
		System.out.println(concat);
		sc.close();
		
		System.out.println("-----------------------------------------");
		
		
//		2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//		    비어있는 바이트의 공간을 a로 모두 채우시오.
//		
		StringBuffer sb2 = new StringBuffer(30); // 크기가 30인 StringBuffer sb2를 선언한다.
		
		sb2.append("hello"); // sb2에 "hello"를 담는다.
		
		int remainBufferSize = sb2.capacity() - sb2.length(); // sb2에서 남은 크기를 계산한다.
		
		for(int i = 0; i < remainBufferSize; i++) { // sb2에서 남은 크기만큼 for문을 돌려 남은 크기만큼 "a" 를 담는다.
			sb2.append("a");
		}
		
		System.out.println(sb2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
