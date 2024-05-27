package chap99_homework.book;

import java.util.Scanner;

public class BookManagement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Book book = new Book(null, null, null, null);
		
		while(true) {
			
			System.out.println("============= 메뉴를 선택하세요. ============");
			System.out.println("1. 책 정보 입력 ");
			System.out.println("2. 모든 책 정보 검색 ");
			System.out.println("3. 찾을 책 정보 검색 ");
			System.out.println("4. 도서 대출 가능 여부 ");
			System.out.println("0. 프로그램 종료 ");
			int menuselect = sc.nextInt();
			
			
			switch(menuselect){
			
				case 1:
					
					book.saveBookInfo();
					
					break;
				case 2:
					
					
					
					
					break;
				case 3:
					break;
				case 4:
					break;
					
				case 0:
					
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					
				default:
					System.out.println("잘못 입력했습니다.");
				    break;
			
			
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
