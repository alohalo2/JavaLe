package chap99_homework.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {

	Scanner sc = new Scanner(System.in);
	
	// 책 제목, 지은이, 출판사, 해당 책 권수, 도서 반납/대출 가능 여부
	private String bookName;
	private String author;
	private String publisher;
	private int bookQnt;
	private String genre;
	private boolean loanAvailability;
	List<Book> bookList = new ArrayList<Book>();
	
	
	public Book() {
	}

	
	public Book(String bookName, String author, String publisher, String genre) {
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.genre = genre;
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

	public int getBookQnt() {
		return bookQnt;
	}
	
	
	public boolean isLoanAvailability() {
		return loanAvailability;
	}


	public void saveBookInfo(String bookName, String author, String publisher, String genre) {
	
		while(true) {
			Book book = new Book();
			
			while(true) {
				int bookCnt = 0;
				System.out.println("도서 번호를 입력하세요.");
				int bookNum = sc.nextInt();
				
//				for(int i = 0; )
				
				
				}
			
			
			System.out.println("책 제목: ");
			book.setBookName(sc.nextLine);
			
			System.out.println("지은이: ");
			book.setAuthor(author);
			
			System.out.println("출판사: ");
			book.setPublisher(sc.nextLine());
			
			System.out.println("장르: ");
			book.setGenre(sc.nextLine());
	
		}
	}
	
	
}
