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

				int[][] peopleCount = new int[k + 1][n + 1];
				
				for(int i = 1; i <= n; i++) {
					peopleCount[0][i] = i;
				}

				for (int i = 1; i < k + 1; i++) {
					for (int j = 1; j <= n; j++) {
						for(int m = 1; m <= j; m++) {
							peopleCount[i][j] += peopleCount[i-1][m];
						}
//						System.out.printf("peopleCount[%d][%d]: %d%n",i,j,peopleCount[i][j]);
//						System.out.println("peopleCount" + "[" + i + "]" + "[" + j + "]" + peopleCount[i][j]);
					}
				}
				System.out.println(peopleCount[k][n]);
				testCase--;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
