package chap99_homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {     

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		int M = sc.nextInt();
		
		Integer[] intArr = new Integer[N];
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = i+1;
		}
		
		for(int i = 0; i < M; i++) {
			int K = sc.nextInt();
			int L = sc.nextInt();
			
//			for(int j = 1; j <  )
			if(intArr[K] < intArr[L]) {
				int temp = intArr[K];
				intArr[K] = intArr[L - 1];
				intArr[L - 1] = temp;
				
				Arrays.sort(intArr,Collections.reverseOrder());
			}
		
		}
		
		Arrays.sort(intArr,Collections.reverseOrder());
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		
		sc.close();
	}
}

