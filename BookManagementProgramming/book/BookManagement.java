package book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookManagement {

	static Scanner sc = new Scanner(System.in);

	boolean loanAvailability;
	static List<Book> bookList = new ArrayList<Book>();
	static Map<String, List<Book>> bookListMap = new HashMap<>();
	static Book book = new Book(null, null, null, null, null);

	public static void main(String[] args) {

		while (true) {

			System.out.println("============= 메뉴를 선택하세요. ============");
			System.out.println("[1] 책 정보 입력 ");
			System.out.println("[2] 모든 책 정보 검색 ");
			System.out.println("[3] 찾을 책 정보 검색 ");
			System.out.println("[4] 도서 대출 및 반납 ");
			System.out.println("[0] 프로그램 종료 ");
			String menuselect = sc.nextLine();

			switch (menuselect) {

			case "1":

				saveBookInfo();

				break;
			case "2":

//				allSavedBookInfo();
				BookConnectDB.printAllBookInfoFromDB(book);

				break;
			case "3":

				findBookInfo();

				break;
			case "4":

				loanBookAvailability();

				break;
			case "0":

				System.out.println("프로그램을 종료합니다.");
				System.exit(0);

			default:
				System.out.println("잘못 입력했습니다.");
				break;

			}
		}
	}

	public static void saveBookInfo() {

		// 도서 번호를 입력해서 해당하는 도서 정보를 입력하는 메소드

		while (true) {
			String userInputbNum; // 사용자가 입력한 도서 번호를 저장하는 변수
			String userConfirm; // 사용자가 입력한 내용을 컨펌하는 변수
			boolean userFoundBookNum = false;

			while (true) {

				System.out.println("도서 번호를 입력하세요.");
				userInputbNum = sc.nextLine();

				for (int i = 0; i < bookList.size(); i++) {
					if (bookList.get(i).getBookNum().equals(userInputbNum)) {
						System.out.println("도서 번호가 중복되었습니다, 다시 입력하세요.");
						userFoundBookNum = true;
						saveBookInfo(); // 재귀메소드로 중복값이 있을때 다시 for문을 돌림
						break; // for문 루프 탈출
					}
				}
				if (!userFoundBookNum) {
					book.setBookNum(userInputbNum);

				}
				break; // while 루프 탈출
			}

			try {
				System.out.println("도서 제목: ");
				book.setBookName(sc.nextLine());

				System.out.println("지은이: ");
				book.setAuthor(sc.nextLine());

				System.out.println("출판사: ");
				book.setPublisher(sc.nextLine());

				System.out.println("장르: ");
				book.setGenre(sc.nextLine());

				book.setLoanAvailability(true);
				Thread.sleep(1000);

				System.out.println("입력한 도서 번호: " + userInputbNum);
				System.out.println("입력한 도서 제목: " + book.getBookName());
				System.out.println("입력한 지은이: " + book.getAuthor());
				System.out.println("입력한 출판사: " + book.getPublisher());
				System.out.println("입력한 장르: " + book.getGenre());
				System.out.println("===================================");
				System.out.println("입력한 정보가 맞으면 Y, 다르면 N을 입력해주세요.");
				userConfirm = sc.nextLine();
				Thread.sleep(1000);

				if (userConfirm.equalsIgnoreCase("y")) {
					bookList.add(book);
					bookListMap.put(book.getBookNum(), bookList);
					System.out.println("도서정보 입력 완료");
					BookConnectDB.bookSaveIntoDB(book); // 수정된 부분: Book 객체를 전달
					Thread.sleep(1000);
					break;
				} else if (userConfirm.equalsIgnoreCase("n")) {
					System.out.println("입력한 도서 정보가 잘못 작성되었습니다, 다시 작성해주세요.");
					Thread.sleep(1000);
					break;
				} else {
					System.out.println("잘못 입력했습니다, 초기메뉴로 돌아갑니다.");
					Thread.sleep(1000);
					break;
				}
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}

		}
	}

	public static void allSavedBookInfo() {

		// 현재까지 저장된 도서 정보들을 모두 출력하는 메소드

		BookConnectDB.printAllBookInfoFromDB(book);

//		try {
//			for (int i = 0; i < bookList.size(); i++) {
//				System.out.println("=============================");
//				System.out.println("도서 번호: " + bookList.get(i).getBookNum());
//				System.out.println("도서 제목: " + bookList.get(i).getBookName());
//				System.out.println("지은이: " + bookList.get(i).getAuthor());
//				System.out.println("출판사: " + bookList.get(i).getPublisher());
//				System.out.println("장르: " + bookList.get(i).getGenre());
//				Thread.sleep(1000);
//			}
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}
	}

	public static void findBookInfo() {

		// 찾을 도서번호를 입력하면 List에서 도서번호에 맞는 도서정보를 출력해주는 메소드

		String findBookUserStr;

		System.out.println("찾을 도서의 번호를 입력해주세요.");
		findBookUserStr = sc.nextLine();
		BookConnectDB.printFindBookInfoFromDB(book, findBookUserStr);

//		boolean bookFound = false;
//
//		while (true) {
//			try {
//				for (int i = 0; i < bookList.size(); i++) {
//					if (bookList.get(i).getBookNum().equals(findBookUserStr)) {
//						System.out.println("=============================");
//						System.out.println("도서 번호: " + bookList.get(i).getBookNum());
//						System.out.println("도서 제목: " + bookList.get(i).getBookName());
//						System.out.println("지은이: " + bookList.get(i).getAuthor());
//						System.out.println("출판사: " + bookList.get(i).getPublisher());
//						System.out.println("장르: " + bookList.get(i).getGenre());
//						System.out.println("=============================");
//						Thread.sleep(1000);
//						findBookInfo();
//						bookFound = true; // 도서를 찾았음을 표시
//						break; // for 루프 탈출
//					}
//				}
//				if (!bookFound) {
//					System.out.println("도서 번호를 잘못 입력했습니다, 초기메뉴로 돌아갑니다.");
//					Thread.sleep(1000);
//				}
//				break; // while 루프 탈출
//			} catch (InterruptedException e) {
//				System.out.println(e.getMessage());
//			} catch (IndexOutOfBoundsException i) {
//				System.out.println(i.getMessage());
//			}
//		}
	}

	public static void loanBookAvailability() {

		// 맵으로 BookNum(key)이랑 bookList(value) 값을 받아서 저장
		// BookNum(key)이랑 비교해서 도서 대출 및 반납해주는 메소드

		String userLoanBookNum = null;
		String userReturnBookNum = null;
		boolean loanBookFound = false;
		boolean returnBookFound = false;

		System.out.println("도서를 대출 및 반납 중 선택해주세요, 도서 대출: y / 도서 반납: n");
		String userSelec = sc.nextLine();

		while (true) {
			try {
				if (userSelec.equalsIgnoreCase("y")) {
					System.out.println("도서대출 할 도서의 번호를 입력해주세요.");
					userLoanBookNum = sc.nextLine();
					BookConnectDB.loanBookAvailabilityFromDB(book, userLoanBookNum);
					Thread.sleep(1000);

//					for (int i = 0; i < bookListMap.size(); i++) {
//						if (bookListMap.containsKey(userLoanBookNum)) {
//							System.out.println("대출할 도서 번호: " + userLoanBookNum);
//							System.out.println("대출할 도서 제목: " + bookList.get(i).getBookName());
//							System.out.println("대출할 도서 지은이: " + bookList.get(i).getAuthor());
//							System.out.println("대출할 도서 출판사: " + bookList.get(i).getPublisher());
//							System.out.println("대출할 도서 장르: " + bookList.get(i).getGenre());
//							System.out.println("===================================");
//							Thread.sleep(1000);
//
//							System.out.println("도서 대출 완료");
//							loanBookFound = true; // 도서 대출할 책을 찾았음을 표시
//							Thread.sleep(1000);
//							break; // for 루프 탈출
//						}
//					}
//					if (!loanBookFound) {
//						System.out.println("찾으시는 책이 없어 도서대출이 불가능 합니다.");
//						Thread.sleep(1000);
//					}
				} else if (userSelec.equalsIgnoreCase("n")) {
					System.out.println("반납할 도서의 번호를 입력해주세요.");
					userReturnBookNum = sc.nextLine();
					BookConnectDB.returnBookFromDB(book, userReturnBookNum);
					Thread.sleep(1000);

//					for (int i = 0; i < bookListMap.size(); i++) {
//						if (bookListMap.containsKey(userReturnBookNum)) {
//							System.out.println("반납할 도서 번호: " + userReturnBookNum);
//							System.out.println("반납할 도서 제목: " + bookList.get(i).getBookName());
//							System.out.println("반납할 도서 지은이: " + bookList.get(i).getAuthor());
//							System.out.println("반납할 도서 출판사: " + bookList.get(i).getPublisher());
//							System.out.println("반납할 도서 장르: " + bookList.get(i).getGenre());
//							System.out.println("===================================");
//							Thread.sleep(1000);
//
//							System.out.println("도서 반납 완료");
//							returnBookFound = true; // 도서 반납할 책을 찾았음을 표시
//							Thread.sleep(1000);
//							break; // for 루프 탈출
//
//						}
//					}
//					if (!returnBookFound) {
//						System.out.println("해당 반납 도서는 저장된 도서 내용과 일치하지 않습니다.");
//						Thread.sleep(1000);
//					}
				} else {
					System.out.println("잘못 입력했습니다, 다시 입력해주세요.");
					return;
				}
				break; // while 루프 탈출
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			} catch (IndexOutOfBoundsException i) {
				System.out.println(i.getMessage());
			}
		}
	}
}
