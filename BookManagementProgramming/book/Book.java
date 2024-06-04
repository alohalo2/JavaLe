package book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Book {

	// 책 제목, 지은이, 출판사, 해당 책 권수, 도서 반납/대출 가능 여부
	
	private String bookNum;
	private String bookName;
	private String author;
	private String publisher;
	private static int bookCnt;
	private String genre;
	

	// 기본생성자
	public Book() {
	}

	// 매개변수를 받는 생성자
	public Book(String bookNum, String bookName, String author, String publisher, String genre) {
		this.bookNum = bookNum;
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

	public void setLoanAvailability(boolean b) {
	}

//	public boolean isLoanAvailability() {
//		return loanAvailability;
//	}
//


}
