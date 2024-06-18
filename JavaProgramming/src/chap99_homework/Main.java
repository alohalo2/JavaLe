package chap99_homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 정수의 갯수

		int[] nArry = new int[N]; // 정수를 담는 배열

		for (int i = 0; i < nArry.length; i++) {
			nArry[i] = sc.nextInt();
		}

		int v = sc.nextInt(); // 찾으려고 하는 정수
		int vCnt = 0;

		for (int i = 0; i < nArry.length; i++) {
			if (nArry[i] == v) {
				vCnt++;
			}
		}

		System.out.println(vCnt);

		sc.close();
	}
}
