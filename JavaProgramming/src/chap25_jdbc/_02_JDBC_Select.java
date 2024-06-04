package chap25_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _02_JDBC_Select {

	public static void main(String[] args) {

		// JDBC를 이용해서 과목별 기말고사 평균 성적 조회
		// (과목번호, 과목이름, 교수번호, 기말고사 성적의 평균점수)
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
			String selectAvgRes = "SELECT A.CNO"
					+ " 				, A.CNAME"
					+ "					, P.PNO"
					+ "					, A.AVG_RES"
					+ "					FROM ("
					+ "						SELECT C.CNO"
					+ "							 , C.CNAME"
					+ "							 , C.PNO"
					+ "							 , ROUND(AVG(SC.RESULT), 2) AS AVG_RES"
					+ "							FROM COURSE C"
					+ "							JOIN SCORE SC"
					+ "							  ON C.CNO = SC.CNO"
					+ "							GROUP BY C.CNO, C.CNAME, C.PNO"
					+ "							ORDER BY C.CNO, C.CNAME"
					+ "						  ) A"
					+ "					JOIN PROFESSOR P"
					+ "					  ON P.PNO = A.PNO";
			
			// 쿼리문 실행
			// 실행 결과를 ResultSet 객체로 받음
			rs = stmt.executeQuery(selectAvgRes);
			
			// 쿼리 실행 결과 출력 (대소문자 구분없이 사용가능)
			while(rs.next()) {
				String cno = rs.getString("cno");
				String cname = rs.getString("cname");
				String pno = rs.getString("pno");
				double avgRes = rs.getDouble("avg_res");
				
				System.out.println("과목번호: " + cno + ", 과목이름: " + cname
									+", 교수번호: " + pno + ", 기말고사 평균점수: " + avgRes);
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
