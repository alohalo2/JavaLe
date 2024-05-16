package chap99_homework.homework13.basic;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		
//		1. 매개변수로 받아온 정수배열에서 짝수만 찾아서 출력하는 printEvenNum을 람다식으로 구현하세요. 
//		   PrintNumber 함수형 인터페이스 생성, printEnvenNum(int[] numArr) 추상 메소드로 선언.

		printEvenNum(numArr -> {
		
		int[] intArr = new int[5];	
		int index = 0;
		
		for(int i = 0; i < numArr.length; i++) {
			if(numArr[i] % 2 == 0 && numArr[i] != 0) {
				intArr[index++] = numArr[i]; 
				}
			}
			return intArr;
		});
		
	}
	
	public static void printEvenNum(PrintNumber pNumber) {
		
		Scanner sc = new Scanner(System.in);

		int[] numArr = new int[5];
		
		System.out.println("정수를 입력하세요.");
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = sc.nextInt();
		}
		
		int[] evenArr =  pNumber.printEnvenNum(numArr);
		
		for(int i : evenArr) {
			if(i != 0) {
				System.out.print(i +" ");
				sc.close();
			}
		}
	}

}
