package project;

import java.sql.*;

// Query selected employees
public class IOExchangeRateEx {
	public static void main(String[] args) {
		Connection conn = null;
		try {     
			String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=jdbc";
			conn = DriverManager.getConnection(connUrl, "sa", "passw0rd");			
				

		 	String qryStmt = "SELECT * FROM ExchangeRate WHERE dollars=?";
			PreparedStatement stmt = conn.prepareStatement(qryStmt);
			stmt.setString(1, "USA");
			ResultSet rs = stmt.executeQuery();
		
			while(rs.next()) {
				System.out.println("Dollars = " + rs.getString("BuyIn")+ rs.getDouble("SellOut"));
			}
			rs.close();
			stmt.close();
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
}// end of class QueryDemo5