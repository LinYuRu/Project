package MidTermEx1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ERDAO implements ERcreateEx {

	private static final String INSERT_STMT = "INSERT INTO ExchangeRate VALUES (?, ?, ?, ?)";
	private static final String UPDATE_STMT = "UPDATE ExchangeRate SET dollars=?, buyin=?, sellout=? WHERE Date=?";
	private static final String DELETE_STMT = "DELETE FROM ExchangeRate WHERE Date=?";
	private static final String GET_ONE_STMT = "SELECT * FROM ExchangeRate WHERE Date=?";
	private static final String GET_ALL_STMT = "SELECT * FROM ExchangeRate ORDER BY Date";

	Connection conn = null;

	public void getConnection() throws SQLException {
		String connUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		conn = DriverManager.getConnection(connUrl, "sa", "sa123");
//		String connUrl = "jdbc:sqlserver://localhost:1433;databaseName = sample11";
//		conn = DriverManager.getConnection(connUrl, "sa", "passw0rd");
	}

	public int insert(Pojo ExchangeRate) throws SQLException {
		int updateCount = 0;
		PreparedStatement pstmt = conn.prepareStatement(INSERT_STMT);
		pstmt.setString(1, ExchangeRate.getDate());
		pstmt.setString(2, ExchangeRate.getDollars());
		pstmt.setString(3, ExchangeRate.getBuyin());
		pstmt.setString(4, ExchangeRate.getSellout());
		updateCount = pstmt.executeUpdate();
		return updateCount;
	}

	public int update(Pojo ExchangeRate) throws SQLException {
		int updateCount = 0;
		PreparedStatement pstmt = conn.prepareStatement(UPDATE_STMT);
		pstmt.setString(1, ExchangeRate.getDate());
		pstmt.setString(2, ExchangeRate.getDollars());
		pstmt.setString(3, ExchangeRate.getBuyin());
		pstmt.setString(4, ExchangeRate.getSellout());
		updateCount = pstmt.executeUpdate();
		return updateCount;
	}

	public int delete(String Date) throws SQLException {
		int updateCount = 0;
		PreparedStatement pstmt = conn.prepareStatement(DELETE_STMT);
		pstmt.setString(1, Date);
		updateCount = pstmt.executeUpdate();
		return updateCount;
	}

	public Pojo findER(String Date) throws SQLException {
		Pojo ExchangeRate = null;
		PreparedStatement pstmt = conn.prepareStatement(GET_ONE_STMT);
		pstmt.setString(1, Date);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			ExchangeRate = new Pojo();
			ExchangeRate.setDate(rs.getString("20190530"));
			ExchangeRate.setDollars(rs.getString("USA"));
			ExchangeRate.setBuyin(rs.getString("31.18"));
			ExchangeRate.setSellout(rs.getString("31.87"));

		}
		return ExchangeRate;
	}

	public List<Pojo> getAll() throws SQLException {
		Pojo ExchangeRate = null;
		List<Pojo> ER = new ArrayList<Pojo>();
		PreparedStatement pstmt = conn.prepareStatement(GET_ALL_STMT);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			ExchangeRate = new Pojo();
			ExchangeRate.setDate(rs.getString("20190530"));
			ExchangeRate.setDollars(rs.getString("USA"));
			ExchangeRate.setBuyin(rs.getString("31.18"));
			ExchangeRate.setSellout(rs.getString("31.87"));
			ER.add(ExchangeRate);
		}
		return ER;
	}

	public void closeConn() throws SQLException {
		if (conn != null)
			conn.close();
	}

}