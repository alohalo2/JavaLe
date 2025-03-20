package chap99_homework.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _8958_OX퀴즈 {

	public static void main(String[] args) {

		// gpt 코드
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int testCase = Integer.parseInt(br.readLine());

			while (testCase-- > 0) {
				String line = br.readLine();
				int sum = 0, oCount = 0;

				for (char ch : line.toCharArray()) {
					oCount = (ch == 'O') ? oCount + 1 : 0;
					sum += oCount;
				}

				System.out.println(sum);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 내 코드
//		
//		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//
//			int testCase = Integer.parseInt(br.readLine());
//
//			while (testCase > 0) {
//
//				String[] userInput = br.readLine().split("");
//
//				int[] intArry = new int[userInput.length];
//				int oCount = 0;
//
//				for (int i = 0; i < userInput.length; i++) {
//					if (userInput[i].equals("O")) {
//						oCount++;
//						intArry[i] = oCount;
//					} else {
//						intArry[i] = 0;
//						oCount = 0;
//					}
//				}
//
//				int result = Arrays.stream(intArry).sum();
//
//				System.out.println(result);
//
//				testCase--;
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}
