package chap99_homework;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {     

		Scanner sc = new Scanner(System.in);
   
		
		
		int N = sc.nextInt();
		sc.nextLine();
		int[] intArr = new int[N];
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = sc.nextInt();
		}
		
		Arrays.sort(intArr);
		
		for(int i : intArr) {
			System.out.println(i);
		}
		
		sc.close();
	}
}

