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
	
	private static Set<String> removeDuplicates = new HashSet<String>();

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

			String sqlBooks = "INSERT INTO BOOKS (BNO, BTITLE, AUTHOR, PUBLISHER, GENRE, IS_LOANED) VALUES (?, ?, ?, ?, ?, 1)";

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
			String findBookInfoFromDB = "SELECT *" 
					+ "						FROM BOOKS" 
					+ "						WHERE BNO = ?";

			pstmt = conn.prepareStatement(findBookInfoFromDB);

			pstmt.setString(1, findBookUserStr); // Statement에는 setString 메소드가 없음

			// 쿼리문 실행
			// 실행 결과를 ResultSet 객체로 받음
			rs = pstmt.executeQuery();

			if (!rs.next()) { //
				System.out.println("입력되지 않은 도서 번호입니다.");
			}

			// 쿼리 실행 결과 출력 (대소문자 구분없이 사용가능)
			do {
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
			} while (rs.next());

		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}

	}

	public static void loanBookAvailabilityFromDB(Book book, String userLoanBookNum) {

		// userLoanBookNum을 담는 set 객체를 메소드에 생성하면 
		// 메소드가 실행될 때마다 객체를 새로 생성하여 userLoanBookNum을
		// 새롭게 생성된 set 객체에 담기기 때문에 if문에서 중복된 userLoanBookNum을
		// 걸르지를 못한다.
		Connection conn = null; // DB와 연결
		PreparedStatement pstmt = null; // 실행문을 저장
		Statement stmt = null; // 실행문을 저장
		ResultSet rs1 = null; // 대출 가능 여부 확인 쿼리 결과값을 저장 
		ResultSet rs2 = null; // 도서 정보 조회 및 출력 쿼리 결과값을 저장
		ResultSet rs3 = null; // 대출 기한 설정 쿼리 결과값을 저장
		ResultSet rs4 = null; // 대출한 도서 데이터 변경 쿼리 결과값 저장
		
		try {
			
			conn = JDBCUtil.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##study", "!dkdlxl1234");
			
			// 대출 가능 여부 확인(rs1)
			String isLoanedBookSelectFromDB = "SELECT IS_LOANED" + 
					"					FROM BOOKS" + 
					"					WHERE BNO = ?";

			pstmt = conn.prepareStatement(isLoanedBookSelectFromDB);
			
			pstmt.setString(1, userLoanBookNum);

			rs1 = pstmt.executeQuery();
			
			if(rs1.next()) {
				if(rs1.getInt("is_Loaned") == 0) {
				System.out.println("이미 대출된 도서 번호입니다.");
				return;
				}
			} 
			
			// 대출 여부(중복)를 확인하는 코드
			// userLoanBookNum을 중복값이 없는 set 객체에 저장 후 확인 
			if(removeDuplicates.contains(userLoanBookNum)) {
				System.out.println("이미 대출된 도서 번호입니다.");
				return;
			}
			
			// 도서 정보 조회 및 출력(rs2)
			String loanBookFromDB = "SELECT *" + 
					"					FROM BOOKS" + 
					"					WHERE BNO = ?";

			pstmt = conn.prepareStatement(loanBookFromDB);
			
			pstmt.setString(1, userLoanBookNum);

			rs2 = pstmt.executeQuery();
			
			if (!rs2.next()) {
				System.out.println("입력되지 않은 도서 번호입니다.");
				return;
			}
			
			removeDuplicates.add(userLoanBookNum);
			
			// 첫 번째 결과를 처리하고, 다른 결과도 출력하기 위해 do-while 사용
			do {
				
				String bno = rs2.getString("bno");
				String btitle = rs2.getString("btitle");
				String author = rs2.getString("author");
				String publisher = rs2.getString("publisher");
				String genre = rs2.getString("genre");

				System.out.println("=================================");
				System.out.println("대출할 도서 번호: " + bno);
				System.out.println("대출할 도서 제목: " + btitle);
				System.out.println("대출할 도서 지은이: " + author);
				System.out.println("대출할 도서 출판사: " + publisher);
				System.out.println("대출할 도서 장르: " + genre);
				System.out.println("=================================");
				Thread.sleep(1000);
				} while (rs2.next());
			
			
			//대출 기한 설정(rs3)
			stmt = conn.createStatement();

			String loanPeriodFromDB = "SELECT SYSDATE AS today, SYSDATE + 7 AS loan_due_date FROM DUAL";

			rs3 = stmt.executeQuery(loanPeriodFromDB);

			if (rs3.next()) {
				Date today = rs3.getDate("today");
				Date loanDueDate = rs3.getDate("loan_due_date");

				System.out.println("대출 일자: " + today);
				System.out.println("대출 기한: " + loanDueDate);
				System.out.println("대출 기한을 넘어갈 경우에는 미납 요금이 있습니다.");
				System.out.println("7일 동안은 일당 1000원씩, 7일 이상부터는 7000원 + 일당 2000원씩 추가 요금이 붙습니다.");
				Thread.sleep(1000);
			}
			
			// 대출한 도서 데이터 변경(rs4)
			String loanAvailabilityFromDB = "UPDATE BOOKS"
					+ " 					SET "
					+ "						  IS_LOANED = 0, "
					+ "						  LOAN_DATE = SYSDATE"
					+ "						WHERE BNO = ?";

			pstmt = conn.prepareStatement(loanAvailabilityFromDB);
			
			pstmt.setString(1, userLoanBookNum);

			rs4 = pstmt.executeQuery();
			
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(conn, pstmt, stmt, rs1, rs2, rs3, rs4);
		}

	}
	
	public static void returnBookFromDB(Book book, String userReturnBookNum) {

		Connection conn = null; // DB와 연결
		PreparedStatement pstmt = null; // 실행문을 저장
		Statement stmt = null; // 실행문을 저장
		ResultSet rs1 = null; // 반납할 도서 번호에 해당하는 정보 출력 쿼리 결과값을 저장
		ResultSet rs2 = null; // 대출 기한 비교 쿼리 결과값을 저장
		ResultSet rs3 = null; // 반납할 도서의 대출 가능 여부 업데이트 쿼리 결과값을 저장

		try {
			// Connection 객체 얻기
			conn = JDBCUtil.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##study", "!dkdlxl1234");

			// 반납할 도서 번호에 해당하는 정보 출력(rs1)
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

			String loanPeriodFromDB = "SELECT SYSDATE AS today "
					+ "						, B.LOAN_DATE "
					+ "						, A.DIFF_DATE "
					+ "						FROM BOOKS B"
					+ "						JOIN ("
					+ "								SELECT LOAN_DATE"
					+ "									 , TRUNC(SYSDATE - TO_DATE(LOAN_DATE, 'YYY/MM/DD')) AS DIFF_DATE"
					+ "									FROM BOOKS"
					+ "							  ) A"
					+ "						  ON B.LOAN_DATE = A.LOAN_DATE";

			rs2 = stmt.executeQuery(loanPeriodFromDB);

			if (rs2.next()) {
				Date today = rs2.getDate("today");
				Date loanDate = rs2.getDate("loan_date");
				int diffDate = rs2.getInt("diff_date");

				System.out.println("대출한 날짜: " + loanDate);
				System.out.println("반납 날짜: " + today);
				System.out.println("반납 날짜와 대출 날짜 차이: " + diffDate);
				if(diffDate > 7) {
					if(diffDate > 14) {
						System.out.println("총 미납 요금: " + 7000 + (diffDate - 7)*2000 + " 원");
					} else {
						System.out.println("총 미납 요금: " + diffDate*1000 + " 원");
					}
				}
			}
			
			// 대출한 도서 데이터 변경(rs4)
			String returnBookContentUpdateFromDB = "UPDATE BOOKS"
					+ " 					SET "
					+ "						  IS_LOANED = 1, "
					+ "						  LOAN_DATE = SYSDATE"
					+ "						WHERE BNO = ?";

			pstmt = conn.prepareStatement(returnBookContentUpdateFromDB);
			
			pstmt.setString(1, userReturnBookNum);

			rs3 = pstmt.executeQuery();

		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(conn, stmt, pstmt, rs1, rs2, rs3);
		}

	}

}
