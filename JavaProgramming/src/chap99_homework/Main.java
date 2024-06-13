package chap99_homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); 
		int longCnt = N/4;
		String[] longArry = new String[longCnt];
		
		for(int i = 0; i < longCnt; i++) {
			longArry[i] = "long";
			System.out.print(longArry[i] + " ");
		}
		System.out.println("int");
		sc.close();
	}
}



