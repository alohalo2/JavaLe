package chap99_homework.boj.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1259_팰린드롬수 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			while(true) {
				String userInput = br.readLine();
				
				if(userInput.equals("0")) break;
				
				System.out.println(check(userInput));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// gpt 코드
	
	public static String check(String userInput) {
	    int len = userInput.length();
	    
	    for (int i = 0; i < len / 2; i++) {
	        if (userInput.charAt(i) != userInput.charAt(len - 1 - i)) {
	            return "no";
	        }
	    }
	    return "yes";
	}
	
	// 내 코드(정답 x)
	
//	public static String check(String userInput) {
//		
//		String result = "";
//		
//		int[] intArry = new int[userInput.length()];
//
//		
//		for (int i = 0; i < userInput.length(); i++) {
//			intArry[i] = Character.getNumericValue(userInput.charAt(i));
//		}
//		
//		int centerIndex = intArry.length / 2;
//		
//		System.out.println("centerIndex: " + centerIndex);
//		
//		int [] frontIntArry = new int[intArry.length/2 + 1];
//		int [] backIntArry = new int[intArry.length/2 + 1];
//		
//		if(intArry.length % 2 == 0) {
//			for(int i = 0; i < frontIntArry.length; i++) {
//				if(i < centerIndex) {
//					frontIntArry[i] = intArry[i];
//				} else {
//					backIntArry[i] = intArry[i];
//				}
//			}
//		} else {
//			for(int i = 0; i < frontIntArry.length; i++) {
//				if(i < centerIndex) {
//					frontIntArry[i] = intArry[i];
//				} else if (i > centerIndex) {
//					backIntArry[i] = intArry[i];
//				}
//			}
//		}
//		
//		Arrays.sort(backIntArry);
//		
//		for (int i : frontIntArry) {
//			System.out.println("frotCharArry: " + i);
//		}
//		
//		for (int i : backIntArry) {
//			System.out.println("backIntArry: " + i);
//		}
//		
//		for(int i = 0; i < frontIntArry.length; i++) {
//			if(frontIntArry[i] == backIntArry[i]) {
//				result = "Yes";
//			} else {
//				result = "No";
//			}
//		}
//		
//		return result;
//	}
	
}
