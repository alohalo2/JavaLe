package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookConnectDB {

	public static void main(String[] args) {
		
		Book book = new Book();
		
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
			System.out.println("회원가입 성공");
		}else{
			System.out.println("회원가입 성공");
		}
	}
}
