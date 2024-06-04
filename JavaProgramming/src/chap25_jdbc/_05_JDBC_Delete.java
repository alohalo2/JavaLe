package chap25_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class _05_JDBC_Delete {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement stmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("학번을 입력하세요.");
			String sno = sc.nextLine();
//			System.out.println("이름을 입력하세요.");
//			String sname = sc.nextLine();
//			System.out.println("성별을 입력하세요.");
//			String gender = sc.nextLine();
//			System.out.println("학년을 입력하세요.");
//			int syear = sc.nextInt();
//			sc.nextLine();
//			System.out.println("전공을 입력하세요.");
//			String major = sc.nextLine();
//			System.out.println("평균을 입력하세요.");
//			double avr = sc.nextDouble();
			
			conn = JDBCUtil.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "c##study", "!dkdlxl1234"
				);
			
			String deleteStudent = "DELETE FROM STUDENT"
					+ "						WHERE SNO = ?";
			
			stmt = conn.prepareStatement(deleteStudent);
			
		
			stmt.setString(1, sno);
			
			
			int result = stmt.executeUpdate();
			
			if(result != 0) {
				System.out.println("쿼리가 잘 동작했습니다.");
			} else {
				System.out.println("영향받은 행이 없습니다.");
			}
			
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(stmt, conn);
			sc.close();
		}
		
	}

}
