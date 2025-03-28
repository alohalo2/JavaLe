package chap99_homework.boj.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2609_최대공약수와최소공배수 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			String userInput = br.readLine();

			System.out.println(gcdAndLcmCalc(userInput));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String gcdAndLcmCalc(String userInput) {
		String[] stringArry = userInput.split(" ");
		int[] intArry = new int[stringArry.length];

		for (int i = 0; i < stringArry.length; i++) {
			intArry[i] = Integer.parseInt(stringArry[i]);
		}
		
		int a = intArry[0];
		int b = intArry[1];
		
		int gcd = getGCD(a, b);
		int lcm = (a * b) / gcd;

		// StringBuilder로 줄바꿈 포함 리턴 만들기
		StringBuilder sb = new StringBuilder();
		sb.append(gcd).append("\n").append(lcm);

		return sb.toString();

	}
	
	public static int getGCD(int a, int b) {
		// 유클리드 호제법
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
