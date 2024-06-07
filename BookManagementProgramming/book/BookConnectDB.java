package book;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class BookConnectDB {

	public static void bookSaveIntoDB(Book book) { // 저장에 필요한 값들 파라미터로 받아야함

		Connection conn = null;
		PreparedStatement psmtUsers = null;
		PreparedStatement psmtBooks = null;
		ResultSet rs = null;
		int cnt = 0;
		String id = "";
		String pw = "";
		String name = "";

		try {
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

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾을 수 없습니다: " + e.getMessage());
		} catch (SQLException se) {
			System.out.println("SQL 오류: " + se.getMessage());
		} finally {
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
		if (cnt > 0) {
			System.out.println("DB에 저장 완료");
		} else {
			System.out.println("DB에 저장 실패");
		}
	}

	public static void printAllBookInfoFromDB(Book book) {

		Connection conn = null; // DB와 연결
		Statement stmt = null; // 실행문을 저장
		ResultSet rs = null; // 결과값을 저장

		try {
			// Connection 객체 얻기
			conn = JDBCUtil.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##study", "!dkdlxl1234");

			// Statement 객체 얻기
			stmt = conn.createStatement();

			// 쿼리문 작성
			String selectAvgRes = "SELECT *" + "					FROM BOOKS" + "					ORDER BY BNO";

// 			Statement는 바인드 변수(?) X, PrepareStatement 바인드 변수(?) O
//			Statement의 executeQuery(String sql) 메서드는 쿼리 문자열을 매개변수로 받습니다.
//			PreparedStatement의 executeQuery() 메서드는 매개변수를 받지 않으며, 쿼리는 객체를 생성할 때 설정됩니다.

			// 쿼리문 실행
			// 실행 결과를 ResultSet 객체로 받음
			rs = stmt.executeQuery(selectAvgRes);

			// 쿼리 실행 결과 출력 (대소문자 구분없이 사용가능)
			while (rs.next()) {
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
			JDBCUtil.close(stmt, conn, rs);
		}

	}

	public static void printFindBookInfoFromDB(Book book, String findBookUserStr) {

		Connection conn = null; // DB와 연결
		PreparedStatement pstmt = null; // 실행문을 저장
		ResultSet rs = null; // 결과값을 저장

		try {
			// Connection 객체 얻기
			conn = JDBCUtil.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##study", "!dkdlxl1234");

			// 쿼리문 작성
			String findBookInfoFromDB = "SELECT *" + "					FROM BOOKS" + "					WHERE BNO = ?";

			pstmt = conn.prepareStatement(findBookInfoFromDB);

			pstmt.setString(1, findBookUserStr); // Statement에는 setString 메소드가 없음

			// 쿼리문 실행
			// 실행 결과를 ResultSet 객체로 받음
			rs = pstmt.executeQuery();

			if (!rs.next()) { //
				System.out.println("입력되지 않은 도서 번호입니다.");
			}

			// 쿼리 실행 결과 출력 (대소문자 구분없이 사용가능)
			while (rs.next()) {
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
			JDBCUtil.close(conn, pstmt, rs);
		}

	}

	public static void loanBookAvailabilityFromDB(Book book, String userLoanBookNum) {

		Connection conn = null; // DB와 연결
		PreparedStatement pstmt = null; // 실행문을 저장
		Statement stmt = null; // 실행문을 저장
		ResultSet rs1 = null; // 결과값을 저장
		ResultSet rs2 = null; // 결과값을 저장
		Set<String> removeDuplicates = new HashSet<String>();
		
		try {
			
			
			// Connection 객체 얻기
			conn = JDBCUtil.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##study", "!dkdlxl1234");

			String loanBookFromDB = "SELECT *" + 
					"					FROM BOOKS" + 
					"					WHERE BNO = ?";

			pstmt = conn.prepareStatement(loanBookFromDB);

			pstmt.setString(1, userLoanBookNum);

			rs1 = pstmt.executeQuery();
			
			if(removeDuplicates.contains(userLoanBookNum)) {
				System.out.println("이미 대출된 도서 번호입니다.");
				return;
			} else if (!rs1.next()) {
				System.out.println("입력되지 않은 도서 번호입니다.");
			} else {
				// 첫 번째 결과를 처리하고, 다른 결과도 출력하기 위해 do-while 사용
				do {
					String bno = rs1.getString("bno");
					String btitle = rs1.getString("btitle");
					String author = rs1.getString("author");
					String publisher = rs1.getString("publisher");
					String genre = rs1.getString("genre");

					System.out.println("=================================");
					System.out.println("대출할 도서 번호: " + bno);
					System.out.println("대출할 도서 제목: " + btitle);
					System.out.println("대출할 도서 지은이: " + author);
					System.out.println("대출할 도서 출판사: " + publisher);
					System.out.println("대출할 도서 장르: " + genre);
					System.out.println("=================================");
					removeDuplicates.add(userLoanBookNum);
					System.out.println(removeDuplicates);
					Thread.sleep(1000);
				} while (rs1.next());
			}

			stmt = conn.createStatement();

			String loanPeriodFromDB = "SELECT SYSDATE AS today, SYSDATE + 7 AS loan_due_date FROM DUAL";

			rs2 = stmt.executeQuery(loanPeriodFromDB);

			if (rs2.next()) {
				Date today = rs2.getDate("today");
				Date loanDueDate = rs2.getDate("loan_due_date");

				System.out.println("오늘 날짜: " + today);
				System.out.println("대출 기한: " + loanDueDate);
			}

		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(conn, pstmt, stmt, rs1, rs2);
		}

	}
	
	public static void returnBookFromDB(Book book, String userReturnBookNum) {

		Connection conn = null; // DB와 연결
		PreparedStatement pstmt = null; // 실행문을 저장
		Statement stmt = null; // 실행문을 저장
		ResultSet rs1 = null; // 결과값을 저장
		ResultSet rs2 = null; // 결과값을 저장

		try {
			// Connection 객체 얻기
			conn = JDBCUtil.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##study", "!dkdlxl1234");

			String returnBookFromDB = "SELECT *" + 
					   "				   FROM BOOKS" + 
					   "				   WHERE BNO = ?";

			pstmt = conn.prepareStatement(returnBookFromDB);

			pstmt.setString(1, userReturnBookNum);

			rs1 = pstmt.executeQuery();

			if (!rs1.next()) {
				System.out.println("입력되지 않은 도서 번호입니다.");
			} else {
				// 첫 번째 결과를 처리하고, 다른 결과도 출력하기 위해 do-while 사용
				do {
					String bno = rs1.getString("bno");
					String btitle = rs1.getString("btitle");
					String author = rs1.getString("author");
					String publisher = rs1.getString("publisher");
					String genre = rs1.getString("genre");

					System.out.println("=================================");
					System.out.println("반납할 도서 번호: " + bno);
					System.out.println("반납할 도서 제목: " + btitle);
					System.out.println("반납할 도서 지은이: " + author);
					System.out.println("반납할 도서 출판사: " + publisher);
					System.out.println("반납할 도서 장르: " + genre);
					System.out.println("=================================");
					Thread.sleep(1000);
				} while (rs1.next());
			}

			stmt = conn.createStatement();

			String loanPeriodFromDB = "SELECT SYSDATE AS today, SYSDATE + 7 AS loan_due_date FROM DUAL";

			rs2 = stmt.executeQuery(loanPeriodFromDB);

			if (rs2.next()) {
				Date today = rs2.getDate("today");
				Date loanDueDate = rs2.getDate("loan_due_date");

				System.out.println("오늘 날짜: " + today);
				System.out.println("대출 기한: " + loanDueDate);
			}

		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(conn, pstmt, stmt, rs1, rs2);
		}

	}

}
