package MidTermEx1;
import java.sql.*;

//Insert one employee
public class InsertValue {
	public static void main(String[] args) {
		Connection conn = null;
		try {     
			String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=jdbc";
			conn = DriverManager.getConnection(connUrl, "sa", "passw0rd");
			
			String insStmt = "INSERT INTO ExchangeRate VALUES (?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(insStmt);
			pstmt.setString(1, "20190523");
			pstmt.setString(2, "Dollars");
			pstmt.setString(3, "BuyIn");
			pstmt.setString(4, "SellOut");
			
			
			int num = pstmt.executeUpdate();
			System.out.println("insert count = " + num);
			
			pstmt = conn.prepareStatement("SELECT * FROM ExchangeRate");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print("Dollars = " + rs.getString("BuyIn")+ rs.getDouble("SellOut"));
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
	}
}
