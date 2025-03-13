package chap99_homework.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _31403 {

	public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 개별 입력 받기
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        System.out.println(calcNumber(a, b, c));
        System.out.println(calcString(a, b, c));
    }

    public static int calcNumber(int a, int b, int c) {
        return a + b - c;
    }

    public static int calcString(int a, int b, int c) {
        return Integer.parseInt(a + "" + b) - c;
    }

//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			
//			int [] userInput = new int[3];
//			
//			for(int i = 0; i < userInput.length; i++) {
//				userInput[i] = Integer.parseInt(br.readLine());
//			}
//			
//			System.out.println(calcNumber(userInput[0], userInput[1], userInput[2]));
//			System.out.println(calcString(userInput[0], userInput[1], userInput[2]));
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
//	public static int calcNumber(int a, int b, int c) {
//		return a + b - c;
//	}
//	
//	public static int calcString(int a, int b, int c) {
//		
//		String sumAB = String.valueOf(a) + String.valueOf(b);
//		
//		int result = Integer.parseInt(sumAB) - c;
//		
//		return result;
//		
//	}

}
