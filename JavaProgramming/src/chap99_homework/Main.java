package chap99_homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {     

		Scanner sc = new Scanner(System.in);
		
		int testCaseCnt = sc.nextInt();
		int N = sc.nextInt();
		double min = 0;
		double max = 0;
		String ten = "1";
		int sum = 0;
		
		for(int i = 0; i < testCaseCnt; i++) {
			if(N % 2 == 0) {
				for(int j = 0;  j < N/2; j++) {
					if(j == 0) {
						ten = "1";
					} else {
						ten += "0";
					}
					int intTen = Integer.parseInt(ten);
					max = intTen;
					sum += max;
				}
			}
		}
		
		System.out.println(sum);
		
//		1 + 10 + 100 + 1000 + 10000 + 100000
		sc.close();
	}
}