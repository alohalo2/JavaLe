package chap99_homework.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2798_블랙잭 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			String[] userInput = br.readLine().split(" ");
			int N = Integer.parseInt(userInput[0]);
			int M = Integer.parseInt(userInput[1]);
			
			int[] cardArry = new int[N];
			String[] cards = br.readLine().split(" ");
			
			
			for(int i = 0; i < cardArry.length; i++) {
				cardArry[i] = Integer.parseInt(cards[i]);
				System.out.println(cardArry[i]);
			}
			
			int sum = 0;
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
