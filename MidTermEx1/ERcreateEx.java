package MidTermEx1;
import java.util.*;
import java.sql.SQLException;

public interface ERcreateEx {
	public void getConnection() throws SQLException;
	public int insert(Pojo ExchangeRate)throws SQLException;
	public int update(Pojo ExchangeRate)throws SQLException;
	public int delete(String buyin)throws SQLException;
	public Pojo findER(String ER)throws SQLException; 
	public List<Pojo> getAll() throws SQLException;
	public void closeConn() throws SQLException;


}