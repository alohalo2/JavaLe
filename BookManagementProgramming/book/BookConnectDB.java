package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookConnectDB {
	
	public static void bookSaveIntoDB (Book book) { // 저장에 필요한 값들 파라미터로 받아야함

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

	        psmtBooks.setString(1, book.getBookNum());
	        psmtBooks.setString(2, book.getBookName());
	        psmtBooks.setString(3, book.getAuthor());
	        psmtBooks.setString(4, book.getPublisher());
	        psmtBooks.setString(5, book.getGenre());
	        
	        psmtBooks.executeUpdate();
			
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
			System.out.println("DB에 저장 완료");
		}else{
			System.out.println("DB에 저장 실패");
		}
	}
	
	public static void printAllBookInfoFromDB (Book book) {
		
		Connection conn = null; // DB와 연결
		Statement stmt = null; // 실행문을 저장
		ResultSet rs = null; // 결과값을 저장
		
		try {
			// Connection 객체 얻기
			conn = JDBCUtil.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","c##study", "!dkdlxl1234");
			
			// Statement 객체 얻기
			stmt = conn.createStatement();
			
			// 쿼리문 작성
			String selectAvgRes = "SELECT BNO"
					+ " 				, BTITLE"
					+ "					, AUTHOR"
					+ "					, PUBLISHER"
					+ "					, GENRE"
					+ "					FROM BOOKS"
					+ "					ORDER BY BNO";
			
			// 쿼리문 실행
			// 실행 결과를 ResultSet 객체로 받음
			rs = stmt.executeQuery(selectAvgRes);
			
			// 쿼리 실행 결과 출력 (대소문자 구분없이 사용가능)
			while(rs.next()) {
				String bno = rs.getString("bno");
				String btitle = rs.getString("btitle");
				String author = rs.getString("author");
				String publisher = rs.getString("publisher");
				String genre = rs.getString("genre");
				
				System.out.println("=================================");
				System.out.println("도서 번호: " + bno);
				System.out.println("도서 제목: " + btitle);
				System.out.println("지은이: " + author);
				System.out.println("출판사: " + publisher);
				System.out.println("장르: " + genre);
				Thread.sleep(1000);
			}
			
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(stmt, rs, conn);
		}
	
	}
	
	public static void printFindBookInfoFromDB(Book book, String findBookUserStr) {
		
		Connection conn = null; // DB와 연결
		Statement stmt = null; // 실행문을 저장
		ResultSet rs = null; // 결과값을 저장
		
		try {
			// Connection 객체 얻기
			conn = JDBCUtil.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","c##study", "!dkdlxl1234");
			
			// 쿼리문 작성
			String findBookInfoFromDB = "SELECT BNO"
					+ " 				, BTITLE"
					+ "					, AUTHOR"
					+ "					, PUBLISHER"
					+ "					, GENRE"
					+ "					FROM BOOKS"
					+ "					WHERE BNO = ?";
			
			stmt = conn.prepareStatement(findBookInfoFromDB);
			
			((PreparedStatement) stmt).setString(1, findBookUserStr);
			
			// 쿼리문 실행
			// 실행 결과를 ResultSet 객체로 받음
			rs = stmt.executeQuery(findBookInfoFromDB);
	
			// 쿼리 실행 결과 출력 (대소문자 구분없이 사용가능)
			while(rs.next()) {
				String bno = rs.getString("bno");
				String btitle = rs.getString("btitle");
				String author = rs.getString("author");
				String publisher = rs.getString("publisher");
				String genre = rs.getString("genre");
				
				System.out.println("=================================");
				System.out.println("도서 번호: " + bno);
				System.out.println("도서 제목: " + btitle);
				System.out.println("지은이: " + author);
				System.out.println("출판사: " + publisher);
				System.out.println("장르: " + genre);
				Thread.sleep(1000);
			}
			
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(stmt, rs, conn);
		}
	
		
	}
	
	
}
