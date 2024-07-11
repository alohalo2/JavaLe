package chap99_homework;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] intArr = new int[N];
		
		for(int i = 0; i < N; i++) {
			int I = sc.nextInt();
			int J = sc.nextInt();
			int K = sc.nextInt();
			intArr[i] = K;
		}
		for(int i = 0; i < N; i++) {
			System.out.print(intArr[i] + " ");
		}
	}
}
