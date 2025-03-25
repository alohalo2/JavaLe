package chap99_homework.boj.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10250 {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int testCount = Integer.parseInt(br.readLine());
			
			while (testCount-- > 0) {
				String[] userInput = br.readLine().split(" ");
				int numberOfFloor = Integer.parseInt(userInput[0]);
				int roomQuantity = Integer.parseInt(userInput[1]); // 사용 안 하지만 남겨둠
				int numberOfCustomer = Integer.parseInt(userInput[2]);
				
				System.out.println(calcRoomNumber(numberOfFloor, numberOfCustomer));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
    }

    public static int calcRoomNumber(int numberOfFloor, int numberOfCustomer) {
        int customerFloor = (numberOfCustomer - 1) % numberOfFloor + 1;
        int customerRoomNumber = (numberOfCustomer - 1) / numberOfFloor + 1;

        return customerFloor * 100 + customerRoomNumber; // YYXX 형태로 출력
    }
}
		

		
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			
//			int testCount = Integer.parseInt(br.readLine());
//			
//			while(true) {
//				if(testCount == 0) break;
//
//				String[] userInput = br.readLine().split(" ");
//				int numberOfFloor = Integer.parseInt(userInput[0]);
//				int roomQuantity = Integer.parseInt(userInput[1]);
//				int numberOfCustomer = Integer.parseInt(userInput[2]);
//				
//				System.out.println(calcRoomNumber(numberOfFloor, roomQuantity, numberOfCustomer));
//				
//				testCount--;
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
//	public static int calcRoomNumber(int numberOfFloor, int roomQuantity, int numberOfCustomer) {
//		
//		
//		int customerFloor; 
//		int customerRoomNumber = (numberOfCustomer - 1) / numberOfFloor + 1;
//				
//		// 아래 if 절은 필요없는 코드임
//		if(numberOfCustomer % numberOfFloor == 0) {
//			customerFloor = numberOfFloor;
//		} else {
//			customerFloor = numberOfCustomer % numberOfFloor;
//		}
//		
//		int result;
//		
//		if (customerRoomNumber < 10) {
//			result = Integer.parseInt(customerFloor + "0" + customerRoomNumber);
//		} else {
//			result = Integer.parseInt(customerFloor + "" + customerRoomNumber);
//		}
//		
//		return result;
//	}
//
//}
