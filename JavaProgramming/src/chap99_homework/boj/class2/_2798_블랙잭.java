package chap99_homework.boj.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2798_블랙잭 {

	static int max = 0;

	public static void main(String[] args) {

		// gpt 코드
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			String[] userInput = br.readLine().split(" ");
			int N = Integer.parseInt(userInput[0]);
			int M = Integer.parseInt(userInput[1]);

			int[] cards = new int[N];
			String[] inputs = br.readLine().split(" ");

			for (int i = 0; i < N; i++) {
				cards[i] = Integer.parseInt(inputs[i]);
			}

			combine(cards, 0, 0, 0, M);
			System.out.println(max);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// selectedCount: 지금까지 고른 카드 수
	// sum: 현재까지 합
	public static void combine(int[] cards, int start, int selectedCount, int sum, int M) {
		if (selectedCount == 3) {
			if (sum <= M) {
				max = Math.max(max, sum);
			}
			return;
		}

		for (int i = start; i < cards.length; i++) {
			combine(cards, i + 1, selectedCount + 1, sum + cards[i], M);
		}
	}

//		// 내 코드
//		
//		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//
//			String[] userInput = br.readLine().split(" ");
//			int N = Integer.parseInt(userInput[0]);
//			int M = Integer.parseInt(userInput[1]);
//
//			int[] cardArry = new int[N];
//			String[] cards = br.readLine().split(" ");
//
//			for (int i = 0; i < cardArry.length; i++) {
//				cardArry[i] = Integer.parseInt(cards[i]);
//			}
//
//			combine(cardArry, new int[3], 0, 0, M);
//			System.out.println(max);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//	
//	public static void combine(int[] cardArry, int[] selected, int start, int depth, int M) {
//		
//		if(depth == 3) {
//			int result = selected[0] + selected[1] + selected[2];
//			if (result <= M && result > max) {
//				max = result;
//			}
//			return;
//		}
//		
//		for(int i = start; i < cardArry.length;	i++) {
//			selected[depth] = cardArry[i];
//			combine(cardArry, selected, i + 1, depth + 1, M);
//		}
//	}

}
