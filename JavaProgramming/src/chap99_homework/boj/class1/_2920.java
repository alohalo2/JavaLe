package chap99_homework.boj.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2920 {

	public static void main(String[] args) {

		// gpt 코드
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] userInput = br.readLine().split(" ");
            boolean ascending = true, descending = true;

            for (int i = 0; i < userInput.length - 1; i++) {
                int cur = Integer.parseInt(userInput[i]);
                int next = Integer.parseInt(userInput[i + 1]);

                if (cur < next) {
                    descending = false; 
                } else if (cur > next) {
                    ascending = false; 
                }
            }

            System.out.println(ascending ? "ascending" : descending ? "descending" : "mixed");
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
 		// 내 코드
//		
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//			String[] userInput = br.readLine().split(" ");
//
//			int[] intArry = new int[userInput.length];
//
//			boolean isAscending = true;
//			boolean isDescending = true;
//
//			for (int i = 0; i < intArry.length; i++) {
//				intArry[i] = Integer.parseInt(userInput[i]);
//			}
//
//			for (int i = 0; i < intArry.length - 1; i++) {
//				if (intArry[i] < intArry[i + 1]) {
//					isDescending = false; // 내림차순 아님
//				} else if (intArry[i] > intArry[i + 1]) {
//					isAscending = false; // 오름차순 아님
//				}
//			}
//
//			if (isAscending) {
//				System.out.println("ascending");
//			} else if (isDescending) {
//				System.out.println("descending");
//			} else {
//				System.out.println("mixed");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}

	}

}
