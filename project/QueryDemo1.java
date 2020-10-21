package project;
import java.sql.*;

public class QueryDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		String connUrl = "jdbc:sqlserver://localhost:60001;databaseName=xe";
//		String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=jdbc";
		try { Connection conn = DriverManager.getConnection(connUrl, "sa", "passw0rd");		
			
			String qryStmt = "SELECT ename, salary FROM employee";
			PreparedStatement pstmt = conn.prepareStatement(qryStmt);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int t_row = rs.getInt(2);
				int t_col = rs.getInt(3);
				int row =1, col =1;
				String seatNum;
				int rs2;
				while ( row  <= t_row ){
			        while ( col  <= t_col ){
			           qryStmt = " insert into seats values ( '2016-12-25 10:00', 1, ?, '0', NULL)";
			            seatNum = Integer.toString(row) + "-" +Integer.toString(col);
			            pstmt = conn.prepareStatement(qryStmt);
			            pstmt.setString(1, seatNum);
			            rs2 = pstmt.executeUpdate();
			            col = col+1;
			        }
			        col=1;
			        row = row + 1;
				}}
				
			rs.close();
			pstmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// end of main()
}// end of class QueryDemo1