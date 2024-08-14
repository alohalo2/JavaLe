package chap99_homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {     

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();

		StringBuffer sb = new StringBuffer(sc.nextLine());
		
		int sum = 0;
		
		System.out.println(sb);
		for(int i = 0; i < N; i++) {
			System.out.println(sb.charAt(i));
			sum += sb.charAt(i) - '0';
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}

