package chap99_homework.homework07.middle;

import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		
		
//		1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//	    비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.

		StringBuffer sb1 = new StringBuffer(30); // 크기가 30인 StringBuffer sb1을 생
		
		sb1.append("hello"); // sb1에 "hello"를 담는다.
		
		int remainBufferSize = sb1.capacity() - sb1.length(); // sb1에 남은 크기를 계산
		
		for(int i = 0; i < remainBufferSize; i++) { // sb1 남은 크기만큼 for문을 돌려서 해당하는 인덱스 번째에 
			                                        // "b", "i", "t"를 insert 메소드를 이용해서 넣는다.
			if(i > 4) {
				if(i % 3 == 2) {
					sb1.insert(i, "b");
				} else if(i % 3 == 0) {
					sb1.insert(i, "i"); 
				} else {
					sb1.insert(i, "t"); 
				}
			}
		}
		 System.out.println(sb1);
		System.out.println("---------------------------------");
		 
//		2. "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 StringBuffer이 있을 때 
//		사용자가 정수를 입력하고 위 StringBuffer를 거꾸로 만든 
//		StringBuffer의 사용자가 입력한 정수에 해당하는 인덱스의 문자를 출력하세요.
	
		Scanner sc = new Scanner(System.in);
		
		StringBuffer sb2 = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		
		System.out.println("정수를 입력하세요.");
		int userNum = sc.nextInt();
		
		char[] chArr = new char[sb2.length()];
		
		sb2.reverse(); // sb2를 거꾸로 뒤집는다.

		if (userNum >= 0 && userNum < sb2.length()) {

	            sb2.getChars(0, sb2.length(), chArr, 0);
	            // getCars: 0 ~ sb2.length()까지를 chArr로 0번째부터 입력
	            // sb2에 chArr를 담는다.

	            char result = chArr[userNum]; // userNum이 인덱스로 들어간 chArr의 배열을 result로 선언한다. 
	            System.out.println("결과: " + result);
	        } else {
	            System.out.println("잘못된 인덱스입니다.");
	        }
		
		sc.close();

	}

}
