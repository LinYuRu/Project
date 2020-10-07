package project;

import java.sql.*;
import java.text.SimpleDateFormat;

// Insert one employee
public class InsertDemoTimeEx {
	public static void main(String[] args) {
		Connection conn = null;
		try {     
			String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=jdbc";
			conn = DriverManager.getConnection(connUrl, "sa", "passw0rd");
//			第一種時間寫法					
//			java.util.Date today = new java.util.Date();
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String insStmt = "INSERT INTO employee VALUES (?, ?, getdate(), ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(insStmt);
			pstmt.setInt(1, 1009);
			pstmt.setString(2, "Jean Tsao");
//			pstmt.setString(3, sdf.format(today));
			pstmt.setDouble(3, 55000);
			pstmt.setInt(4, 100);
			pstmt.setString(5, "senior engineer");
			//第二種時間寫法			
//			java.sql.Date today = new java.sql.Date(new java.util.Date().getTime());
//			java.sql.Date today = new java.sql.Date(System.currentTimeMillis());			
//			String insStmt = "INSERT INTO employee VALUES (?, ?, ?, ?, ?, ?)";
//			PreparedStatement pstmt = conn.prepareStatement(insStmt);
//			pstmt.setInt(1, 1009);
//			pstmt.setString(2, "Jean Tsao");
//			pstmt.setDate(3, today);
//			pstmt.setDouble(4, 55000);
//			pstmt.setInt(5, 100);
//			pstmt.setString(6, "senior engineer");
			//第三種時間寫法	
//			java.time.LocalDate today = new java.time.LocalDate.now();
//			String insStmt = "INSERT INTO employee VALUES (?, ?, ?, ?, ?, ?)";
//			PreparedStatement pstmt = conn.prepareStatement(insStmt);
//			pstmt.setInt(1, 1009);
//			pstmt.setString(2, "Jean Tsao");
//			pstmt.setString(3, today.toString());
//			pstmt.setDouble(4, 55000);
//			pstmt.setInt(5, 100);
//			pstmt.setString(6, "senior engineer");
			
			int num = pstmt.executeUpdate();
			System.out.println("insert count = " + num);
			
			pstmt = conn.prepareStatement("SELECT * FROM employee");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print("name = " + rs.getString("ename") + ", ");
				System.out.println("salary = " + rs.getDouble("salary"));
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch(SQLException e) { 
					e.printStackTrace();
				}
		}
	}// end of main()
}// end of class InsertDemo
