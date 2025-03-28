package chap99_homework.boj.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2775_부녀회장이될테야 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int testCase = Integer.parseInt(br.readLine());

			while (testCase != 0) {

				int k = Integer.parseInt(br.readLine());
				int n = Integer.parseInt(br.readLine());

				int[][] peopleCount = new int[k][n];
				int count = 0;

				for (int i = 0; i < k; i++) {
					for (int j = 0; j < n; j++) {
						peopleCount[i][j] = count + j;
						count += j;
						System.out.println("peopleCount" + "[" + i + "]" + "[" + j + "]" + peopleCount[i][j]);
					}
				}
				testCase--;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
