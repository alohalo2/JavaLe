package chap99_homework.homework13.basic;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		
//		1. 매개변수로 받아온 정수배열에서 짝수만 찾아서 출력하는 printEvenNum을 람다식으로 구현하세요. 
//		   PrintNumber 함수형 인터페이스 생성, printEnvenNum(int[] numArr) 추상 메소드로 선언.

		printEvenNum(numArr -> { // printEvenNum이라는 메소드에 람다식 적용, 
							     // numArr라는 int[] 변수 설정(추상메소드에서 매개변수가 int[]이기 때문에 해당 변수도 int[]이다.)
		
		int[] intArr = new int[5]; // numArr의 값들을 받을 intArr라는 int[] 객체 생성 
		int index = 0; // index 값 0으로 초기화
		
		for(int i = 0; i < numArr.length; i++) { // 짝수를 찾기 위해 numArr길이만큼 for문을 돌린다.
			if(numArr[i] % 2 == 0 && numArr[i] != 0) { // 짝수이거나 0이 아닌 값을 찾는다.
				intArr[index++] = numArr[i]; // numArr의 값들을 intArr에 넣어준다.(index에 증감식이 없다면 하나에 인덱스에 값들이 전부 들어감)
				}
			}
			return intArr; // 추상 메소드에서 return 값을 받는 것으로 메소드를 선언했기 때문에 return 값이 필요함
		});
		
	}
	
	public static void printEvenNum(PrintNumber pNumber) {
		
		Scanner sc = new Scanner(System.in); // 사용자 입력값 필요하여 Scanner 객체 생성

		int[] numArr = new int[5]; // 사용자 입력값을 저장해줄 int[] 객체 생성
		
		System.out.println("정수를 입력하세요."); 
		for(int i = 0; i < numArr.length; i++) { // 사용자 입력값을 int[]만큼 for문을 돌려 저장
			numArr[i] = sc.nextInt();
		}
		
		int[] evenArr =  pNumber.printEnvenNum(numArr); // 위에 람다식을 받아와 evenArr 라는 새로운 int 배열에 담는다.
		
		for(int i : evenArr) { // 향상된 for문으로 evenArr에 int 값을 대
			if(i != 0) { // int 값이 0이 아닐때 int 값을 출력
				System.out.print(i + " "); // int 값을 출력할때 각 값을 구분하기 위해 빈 문자열에 띄어쓰기 추가 
				sc.close(); // Scanner 객체 닫기
			}
		}
	}

}
