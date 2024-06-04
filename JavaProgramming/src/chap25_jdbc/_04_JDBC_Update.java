package chap25_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class _04_JDBC_Update {

	public static void main(String[] args) {

		// 사용자가 입력한 sno에 해당하는 학생의 정보를 
		// 사용자가 입력한 내용으로 JDBC를 이용해서 수정
		
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
			System.out.println("평균을 입력하세요.");
			double avr = sc.nextDouble();
			
			conn = JDBCUtil.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "c##study", "!dkdlxl1234"
				);
			
			String insertStudent = "UPDATE STUDENT"
					+ " 					SET "
					+ "						  AVR = ?"
					+ "						WHERE SNO = ?";
			
					
			stmt = conn.prepareStatement(insertStudent);
			
			stmt.setDouble(1, avr); // 물음표에 들어갈 값들
			stmt.setString(2, sno);
			
			
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
