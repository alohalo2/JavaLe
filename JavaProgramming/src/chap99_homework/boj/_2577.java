package chap99_homework.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2577 {

	public static void main(String[] args) {

		 try {
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            
	            int A = Integer.parseInt(br.readLine());
	            int B = Integer.parseInt(br.readLine());
	            int C = Integer.parseInt(br.readLine());
	            
	            int divResult = A * B * C;
	            String strDivResult = String.valueOf(divResult);
	            
	            int[] countArray = new int[10]; // 0~9 숫자의 개수를 저장할 배열
	            
	            // 숫자 하나씩 분리 후 개수 카운트
	            for (char ch : strDivResult.toCharArray()) {
	                int num = ch - '0'; // char → int 변환, divResult의 값이 하나씩 인덱스로 변함
	                countArray[num]++;  // 해당 인덱스의 값이 증가
	            }
	            
	            // 결과 출력
	            for (int count : countArray) {
	                System.out.println(count);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	    }
		
	
	
	
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			
//			int A = Integer.parseInt(br.readLine());
//			int B = Integer.parseInt(br.readLine());
//			int C = Integer.parseInt(br.readLine());
//			
//			int divResult = div(A, B, C);
//			
//			String strDivresult = String.valueOf(divResult);
//			
//			String[] strArry = strDivresult.split("");
//			
//			int target = 0;
//			int count = 0;
//			
//			int [] countArry = new int[10];
//			
//			while(target < 10) {
//				for (String string : strArry) {
//					if(strArry.equals(String.valueOf(target))) {
//						count++;
//					}
//				}
//				
//				for(int i = 0; i < countArry.length; i++) {
//					countArry[i] = count;
//				}
//				
//				target++;
//			}
//			
//			
//			for (int result : countArry) {
//				System.out.println(result);
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
//	public static int div(int a, int b, int c) {
//		return a * b * c;
//	}

}
