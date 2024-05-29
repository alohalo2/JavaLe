package chap99_homework.book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Book {

	// 책 제목, 지은이, 출판사, 해당 책 권수, 도서 반납/대출 가능 여부
	private static Scanner sc; // 스캐너 객체 사용 위하여 멤버변수로 선언
								// (모든 메소드에 사용하기 위함)
	private String bookNum;
	private String bookName;
	private String author;
	private String publisher;
	private static int bookCnt;
	private String genre;
	private boolean loanAvailability;
	private static List<Book> bookList = new ArrayList<Book>();
	private static Map<String, List<Book>> bookListMap = new HashMap<>();

	// 기본생성자
	public Book() {
		sc = new Scanner(System.in); // 멤버변수로 선언한 스캐너 객체를 기본 생성자 안에서 선언
										// (모든 메소드에 사용하기 위함)
	}

	// 매개변수를 받는 생성자
	public Book(String bookName, String author, String publisher, String genre) {
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.genre = genre;
	}

	// 멤버변수들의 getter/setter
	public String getBookNum() {
		return bookNum;
	}

	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getBookCnt() {
		return bookCnt;
	}

	public boolean isLoanAvailability() {
		return loanAvailability;
	}

	public void setLoanAvailability(boolean loanAvailability) {
		this.loanAvailability = loanAvailability;
	}

	// 도서 정보 저장 메소드
	public static void saveBookInfo() {

		while (true) {
			Book book = new Book();
			String userInputbNum; // 사용자가 입력한 도서 번호를 저장하는 변수
			String userConfirm; // 사용자가 입력한 내용을 컨펌하는 변수

			while (true) {

				System.out.println("도서 번호를 입력하세요.");
				userInputbNum = sc.nextLine();

				for (int i = 0; i < bookList.size(); i++) {
					if (userInputbNum.equals(bookList.get(i).getBookNum())) {
						bookCnt++;
						System.out.println("도서 번호가 중복되었습니다, 다시 입력하세요.");
						break;
					}
				}
				if (bookCnt == 0) {
					book.setBookNum(userInputbNum);
					bookListMap.put(userInputbNum, bookList);
					break;
				}

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

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("입력한 도서 번호: " + userInputbNum);
			System.out.println("입력한 도서 제목: " + book.getBookName());
			System.out.println("입력한 지은이: " + book.getAuthor());
			System.out.println("입력한 출판사: " + book.getPublisher());
			System.out.println("입력한 장르: " + book.getGenre());
			System.out.println("===================================");
			System.out.println("입력한 정보가 맞으면 Y, 다르면 N을 입력해주세요.");
			userConfirm = sc.nextLine();

			if (userConfirm.equalsIgnoreCase("y")) {
				bookList.add(book);
				System.out.println("도서정보 입력 완료");
				break;
			} else if (userConfirm.equalsIgnoreCase("n")) {
				System.out.println("입력한 도서 정보가 잘못 작성되었습니다, 다시 작성해주세요.");
				break;
			} else {
				System.out.println("잘못 입력했습니다, 초기메뉴로 돌아갑니다.");
				break;
			}

		}
	}

	public static void allSavedBookInfo() {

		try {
			for (int i = 0; i < bookList.size(); i++) {
				System.out.println("=============================");
				System.out.println("도서 번호: " + bookList.get(i).getBookNum());
				System.out.println("도서 제목: " + bookList.get(i).getBookName());
				System.out.println("지은이: " + bookList.get(i).getAuthor());
				System.out.println("출판사: " + bookList.get(i).getPublisher());
				System.out.println("장르: " + bookList.get(i).getGenre());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void findBookInfo() {

		String findBookUserStr;

		System.out.println("찾을 도서의 번호를 입력해주세요.");
		findBookUserStr = sc.nextLine();
		boolean bookFound = false;

		while (true) {
		    try {
		        for (int i = 0; i < bookList.size(); i++) {
		            if (bookList.get(i).getBookNum().equals(findBookUserStr)) {
		                System.out.println("=============================");
		                System.out.println("도서 번호: " + bookList.get(i).getBookNum());
		                System.out.println("도서 제목: " + bookList.get(i).getBookName());
		                System.out.println("지은이: " + bookList.get(i).getAuthor());
		                System.out.println("출판사: " + bookList.get(i).getPublisher());
		                System.out.println("장르: " + bookList.get(i).getGenre());
		                System.out.println("=============================");
		                Thread.sleep(1000);
		                findBookInfo();
		                bookFound = true;  // 도서를 찾았음을 표시
		                break;  // for 루프 탈출
		            }
		        }
		        if (!bookFound) {
		            System.out.println("도서 번호를 잘못 입력했습니다, 초기메뉴로 돌아갑니다.");
		        }
		        break;  // while 루프 탈출
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    } catch (IndexOutOfBoundsException i) {
		        System.out.println(i.getMessage());
		    }
		}
	}
	public static void loanBookAvailability() {

		Iterator<String> keys = bookListMap.keySet().iterator();

		while (keys.hasNext()) {
			String key = keys.next();
		}

		Book book = new Book();

		System.out.println("도서를 대출 및 반납 중 선택해주세요, 도서 대출: y / 도서 반납: n");
		String userSelec = sc.nextLine();
		String userLoanBookNum = null;

		if (userSelec.equalsIgnoreCase("y")) {
			System.out.println("도서대출 할 도서의 번호를 입력해주세요.");
			userLoanBookNum = sc.nextLine();

			for (int i = 0; i < bookList.size(); i++) {
				if (bookListMap.get(i).equals(userLoanBookNum)) {
					System.out.println("도서 대출 완료");
					bookCnt--;
				} else {
					System.out.println("찾으시는 책의 보유 수량이 없어 도서대출이 불가능 합니다.");
				}
			}

		} else {
			System.out.println("반납할 도서의 번호를 입력해주세요.");
			for (int i = 0; i < bookList.size(); i++) {
				if (bookListMap.get(i).equals(userLoanBookNum)) {

				}
			}
		}
	}

}
