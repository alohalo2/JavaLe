package chap99_homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {     

		Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
  
=======
>>>>>>> 59ac308750a30e5a0433b7635765fe3676db42bb
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] intArr = new int[N];

		for (int i = 0; i < N; i++) {
			intArr[i] = i+1;    
		}
		for (int i = 0; i < N; i++)
		System.out.print(intArr[i] + " ");

		for (int i = 0; i < M; i++) {

			int I = sc.nextInt();
			int J = sc.nextInt();   

			intArr[I - 1] = J;
			intArr[J - 1] = I;
			System.out.print(intArr[i] + " ");

		}

		for (int i = 0; i < N; i++) {
			System.out.print(intArr[i] + " ");
		}
	}
}
