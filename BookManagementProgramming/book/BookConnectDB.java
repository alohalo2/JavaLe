package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookConnectDB {

//	public static void main(String[] args) {
		
	public static void bookConnectDB () { // 저장에 필요한 값들 파라미터로 받아야함
		
		Book book = new Book();
		
//		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement psmtUsers = null;
		PreparedStatement psmtBooks = null;
		ResultSet rs = null;
		int cnt = 0;
		String id = "";
		String pw = "";
		String name = "";
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "C##STUDY";
			String db_pw = "!dkdlxl1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
	
			String sqlUsers = "INSERT INTO USERS (ID, PW, USERNAME)VALUES(?, ?, ?)";
			psmtUsers = conn.prepareStatement(sqlUsers);
			psmtUsers.setString(1, id);
			psmtUsers.setString(2, pw);
			psmtUsers.setString(3, name);
			cnt = psmtUsers.executeUpdate();
	
			String sqlBooks = "INSERT INTO BOOKS (BNO, BTITLE, AUTHOR, PUBLISHER, GENRE) VALUES (?, ?, ?, ?, ?)";
	
	        psmtBooks = conn.prepareStatement(sqlBooks);
	        
//	        System.out.println("도서 번호를 입력하세요.");
//	        book.setBookNum(sc.nextLine());
	        psmtBooks.setString(1, book.getBookNum());
	        
//	        System.out.println("도서 제목: ");
//	        book.setBookName(sc.nextLine());
	        psmtBooks.setString(2, book.getBookName());
	        
//	        System.out.println("지은이: ");
//	        book.setAuthor(sc.nextLine());
	        psmtBooks.setString(3, book.getAuthor());
	        
//	        System.out.println("출판사: ");
//	        book.setPublisher(sc.nextLine());
	        psmtBooks.setString(4, book.getPublisher());
	        
//	        System.out.println("장르: ");
//	        book.setGenre(sc.nextLine());
	        psmtBooks.setString(5, book.getGenre());
	        
	        psmtBooks.executeUpdate();
	        
//	        String select = "";
	        
//	        rs = psmtBooks.executeQuery(select);
	        
//	        while(rs.next()) {
//	        	List<Book> bookList = new ArrayList<>();
// 	        }
			
		}catch(ClassNotFoundException e){
			System.out.println("JDBC 드라이버를 찾을 수 없습니다: " + e.getMessage());
		}catch(SQLException se){
			System.out.println("SQL 오류: " + se.getMessage());
		}finally{
			try {
				if (rs != null) {
					rs.close();
				}
				if (psmtUsers != null) {
					psmtUsers.close();
				}
				if (psmtBooks != null) {
					psmtBooks.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		if(cnt>0){
			System.out.println("연결 성공");
		}else{
			System.out.println("연결 실패");
		}
	}
}
