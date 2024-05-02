package chap99_homework.homework03;

import java.util.Scanner;

public class UseOfPhoneInfo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PhoneInfo_ phoneInfo = new PhoneInfo_();
		
		while(true) {
			System.out.println("---------연락처--------------");
			System.out.println("1. 연락처 입력");
			System.out.println("2. 모든 연락처 출력");
			System.out.println("3. 인덱스로 연락처 검색");
			System.out.println("4. 종료");
			
			int menuSelect = sc.nextInt();
			sc.nextLine(); // 엔터값을 빼주는 역할
			
			boolean isExit = false;
			
			switch(menuSelect) {
				case 1:
					System.out.println("이름을 입력하세요.");
					String name = sc.nextLine();
					System.out.println("번호를 입력하세요.");
					String phoneNum = sc.nextLine(); 
					
					phoneInfo.insertPhoneInfo(name, phoneNum);
					
					break;
				case 2:
					phoneInfo.printAllPhoneInfo();
					break;
				case 3:
					System.out.println("검색할 연락처의 인덱스를 입력하세요");
					int index = sc.nextInt();
					
					phoneInfo.printPhoneInfo(index);
					break;
				case 4:
					isExit = true;
					break;
					
			}
			
			if(isExit) {
				break;
			}
			
		}
		sc.close();
		

	}

}
