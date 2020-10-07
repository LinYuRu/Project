package MidTermEx1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

// Insert one employee
public class JDBC_InsertValue {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Connection conn = null;
		try {
			String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=sample11";
			conn = DriverManager.getConnection(connUrl, "sa", "passw0rd");

			BufferedReader br = new BufferedReader(
					new FileReader("C:\\Users\\User\\Desktop\\MidTerm\\ExchangeRate\\ER1.txt"));
			String strLine = null;

			while ((strLine = br.readLine()) != null) {
				String[] array = strLine.split(",");
				for (int i = 0; i < array.length; i++) {
					System.out.println(array[i]);
				}
				String insStmt = "INSERT INTO ExchangeRate VALUES ( ?, ?, ?, ?)";
				PreparedStatement pstmt = conn.prepareStatement(insStmt);
				pstmt.setString(1, array[0]);
				pstmt.setString(2, array[1]);
				pstmt.setString(3, array[2]);
				pstmt.setString(4, array[3]);
				pstmt.execute();

				
				pstmt.close();

			};
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}