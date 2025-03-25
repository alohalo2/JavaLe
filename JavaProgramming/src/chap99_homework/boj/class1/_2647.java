package chap99_homework.boj.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2647 {

	public static void main(String[] args) {

		try (
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int testCase = Integer.parseInt(br.readLine());
			
			StringBuilder sb = new StringBuilder();

			while (testCase-- > 0) {
				String[] userInput = br.readLine().split(" ");
				int repetition = Integer.parseInt(userInput[0]);
				String str = userInput[1];


				for (char ch : str.toCharArray()) {
					sb.append(String.valueOf(ch).repeat(repetition));
				}

				sb.append("\n");
			}
			
			System.out.print(sb);

		} catch (Exception e) {
			e.printStackTrace();
		}

//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//			int testCase = Integer.parseInt(br.readLine());
//			
//			while(testCase > 0) {
//				
//				String[] userInput = br.readLine().split(" ");
//				
//				int repetition = Integer.parseInt(userInput[0]);
//				
//				String[] strArry = userInput[1].split("");
//				
//				for(int i = 0; i < strArry.length; i++) {
//						strArry[i] = strArry[i].repeat(repetition);
//				}
//				
//				String result = String.join("", strArry);
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
