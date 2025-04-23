package chap99_homework.boj.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2839_설탕배달 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int N = Integer.parseInt(br.readLine());

			int result = -1;
			
			// for문을 어떻게 쓸지 생각해보는게 중요!
			for (int i = N / 5; i >= 0; i--) { // 5kg 최대 개수부터 줄여가며
				int remain = N - (i * 5);
				if (remain % 3 == 0) {
					int j = remain / 3;
					result = i + j;
					break; // 최소 봉지 수 찾으면 바로 종료
				}
			}

			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
