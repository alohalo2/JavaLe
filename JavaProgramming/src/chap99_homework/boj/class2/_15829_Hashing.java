package chap99_homework.boj.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _15829_Hashing {

	public static void main(String[] args) {

		// 완전성공(1 ≤ L ≤ 50)
		// powMod라는 거듭제곱근 모듈러 메소드를 만들어서 
		// 정확한 값을 도출하기 위해 % mod를 
		// 거듭제곱, 계수 곱셈, 누적합까지 총 3번 해줌
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int L = Integer.parseInt(br.readLine());

			String input = br.readLine();

			System.out.println(hashFunction(L, input));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static int hashFunction(int L, String input) {

		long sum = 0;
		int r = 31;
		int mod = 1234567891;

		for (int i = 0; i < L; i++) {
			int charValue = input.charAt(i) - 'a' + 1;
			long term = (charValue * powMod(r, i, mod)) % mod;
			sum = (sum + term) % mod;
		}

		return (int) sum;
	}
	
//	// gpt 코드
//	
//	public static int hashFunction(int L, String input) {
//
//		long sum = 0;
//		int r = 31;
//		int mod = 1234567891;
//		long power = 1;
//	
//		for (int i = 0; i < L; i++) {
//		    int charValue = input.charAt(i) - 'a' + 1;
//		    sum = (sum + (charValue * power) % mod) % mod;
//		    power = (power * r) % mod;
//		}
//
//		return (int) sum;
//	}

	public static long powMod(int r, int range, int mod) {
		long result = 1;

		for (int i = 0; i < range; i++) {
			result = (result * r) % mod;
		}

		return result;
	}

//		// 부분성공(1 ≤ L ≤ 5)
//		// Math.pow는 제곱근을 계산하주고 double 형태로 반환
//		// 하지만 숫자가 커지면 부정확하기 때문에 % mod를 한 번만 해준 셈이다.	
//		
//		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//
//			int L = Integer.parseInt(br.readLine());
//
//			String input = br.readLine();
//
//			System.out.println(hashFunction(L, input));
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	public static int hashFunction(int L, String input) {
//
//		long sum = 0;
//		int r = 31;
//		int mod = 1234567891;
//
//		for (int i = 0; i < L; i++) {
//			int charValue = input.charAt(i) - 'a' + 1;
//			sum += (charValue * Math.pow(r, i)) % mod;
//		}
//
//		return (int) sum;
//	}

//		// 내 코드(정답 X)
//		
//		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//
//			int L = Integer.parseInt(br.readLine());
//
//			String input = br.readLine();
//
//			System.out.println(hashFunction(L, input));
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	public static int hashFunction(int L, String input) {
//
//		long sum = 0;
//		int[] intAlphabet = new int[input.length() + 1];
//
//		for (Character ch : input.toCharArray()) {
//			int index = ch - 'a' + 1;
//			intAlphabet[index] = index;
//		}
//
//		for (int i = 0; i < L; i++) {
//			sum += intAlphabet[i + 1] * (int) Math.pow(31, i);
//		}
//
//		return (int) sum;
//	}

}
