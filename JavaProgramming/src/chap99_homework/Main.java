package chap99_homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {     

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			int element = Integer.parseInt(str.substring(i,i+1));
			sum += element;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}

