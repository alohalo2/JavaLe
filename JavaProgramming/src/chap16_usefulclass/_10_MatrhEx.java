package chap16_usefulclass;

import java.util.Scanner;

public class _10_MatrhEx {

	public static void main(String[] args) {
		
		// 사용자가 5개의 정수를 입력하고 배열에 저장
		// 배열에 저장된 정수 5개 중 최대값과 최소값을 구하세요.
		// Math.max와 Math.min 메소드를 이용하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) { // for문을 돌려서 저장
			System.out.println("정수를 입력하세요.");
			arr[i] = sc.nextInt(); // 배열에 사용자가 입력한 값을 저장
			
		}	
			
		int max = arr[0];	
		int min = arr[0];	
		
		for(int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		System.out.println("최댓값: " +  max + "최소값: " + min);
		
		sc.close();
		
	}

}
