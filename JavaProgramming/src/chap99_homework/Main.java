package chap99_homework;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {     

		Scanner sc = new Scanner(System.in);
<<<<<<< HEAD

		int[] noSubmitArr = new int[30];
		int[] submitArr = new int[28];
		int[] resultArr = new int[2];
		int index = 0;
=======
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] intArr = new int[N];
>>>>>>> a4c2fc0f2220041c32f0dbca38424d0b5c3f8fad

			
		for (int i = 0; i < 30; i++) {
			noSubmitArr[i] = i+1;  
		}
		
		for (int i = 0; i < 28; i++) {
			submitArr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < noSubmitArr.length; i++) {
		    boolean found = false;
		    for (int j = 0; j < submitArr.length; j++) {
		        if (noSubmitArr[i] == submitArr[j]) {
		            found = true;
		            break; // 같은 사람이 발견되면 내부 루프를 종료
		        }
		    }
		    if (!found) { // noSubmitArr[i]가 submitArr에 존재하지 않으면
		        resultArr[index] = noSubmitArr[i];
		        index++; // resultArr의 다음 인덱스로 이동
		    }
		}
		
		Arrays.sort(resultArr);
		
		for (int i = 0; i < resultArr.length; i++) {
		    System.out.println(resultArr[i]);  // 배열 요소를 출력
		}
	}
}
