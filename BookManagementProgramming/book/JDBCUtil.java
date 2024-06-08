package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {

	public static Connection getConnection(String url, String username, String password) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			return DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	// ResultSet이 없는 close 메소드(insert, delete, update)
	public static void close(Statement stmt, Connection conn) {
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		
	}
	public static void close(Connection conn, Statement stmt, PreparedStatement pstmt, ResultSet rs1, ResultSet rs2, ResultSet rs3) {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(rs1 != null) {
			try {
				rs1.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(rs2 != null) {
			try {
				rs2.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(rs3 != null) {
			try {
				rs3.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		
	}
	
	public static void close(Statement stmt, Connection conn, ResultSet rs) {
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		
	}
	
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs1, ResultSet rs2) {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(rs1 != null) {
			try {
				rs1.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(rs2 != null) {
			try {
				rs2.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		
	}
	

	// ResultSet이 있는 close 메소드(select)
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
	}
	// ResultSet이 있는 close 메소드(select)
	public static void close(Connection conn, PreparedStatement pstmt, 
			Statement stmt, ResultSet rs1, ResultSet rs2, ResultSet rs3,
			ResultSet rs4) {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(rs1 != null) {
			try {
				rs1.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(rs2 != null) {
			try {
				rs2.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(rs3 != null) {
			try {
				rs3.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		if(rs4 != null) {
			try {
				rs4.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		
	}
	
}
