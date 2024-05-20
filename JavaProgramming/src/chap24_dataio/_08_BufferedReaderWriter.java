package chap24_dataio;

import java.util.Scanner;

import chap24_dataio.phoneinfo.PhoneInfo;

public class _08_BufferedReaderWriter {

	public static void main(String[] args) {

		PhoneInfo phoneInfo = new PhoneInfo();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("--------연락처 메뉴--------");
			System.out.println("1. 정보 입력");
			System.out.println("2. 모든 정보 출력");
			System.out.println("3. 이름으로 정보 검색");
			System.out.println("4. 정보 파일로 저장");
			System.out.println("5. 종료");

			int menuSelect = sc.nextInt();
			sc.nextLine();

			if (menuSelect == 1) {
				System.out.println("이름을 입력하세요.");
				String name = sc.nextLine();

				System.out.println("전화번호를 입력하세요.");
				String phoneNum = sc.nextLine();

				phoneInfo.insertPhoneInfo(name, phoneNum); // 저장 메소드 호출
			} else if (menuSelect == 2) {
				phoneInfo.printAllPhoneInfo(); // 저장된 정보 모두 출력하는 메소드 호출

			} else if (menuSelect == 3) {
				System.out.println("검색할 사람의 이름을 입력하세요.");
				String searchName = sc.nextLine();

				phoneInfo.printPhoneInfo(searchName); // 특정 저장된 내용 출력하는 메소드 호출
			} else if (menuSelect == 4) {
				phoneInfo.saveData(); // 정보 파일로 저장하는 메소드 호출

			} else if (menuSelect == 5) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(0);

			}

		}

	}

}
