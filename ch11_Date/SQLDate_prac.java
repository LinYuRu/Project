package ch11_Date;

public class SQLDate_prac {

	public static void main(String[] args) {
		java.util.Date util = new java.util.Date();
		java.sql.Date sql = new java.sql.Date(util.getTime());
		System.out.println(util);
		System.out.println(sql);

	}

}
