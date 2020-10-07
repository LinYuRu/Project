package interface_Prac;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate2Timestamp {
	public static void main(String[] args) {

		// Timestamp ->Date (ps. Timestamp extends java.util.Date)
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		Date date = new Date();
		date = ts;
		System.out.println("Timestamp ->Date: " + date);

		// Date ->Timestamp  (ps. Timestamp extends java.util.Date)
		Timestamp tp = new Timestamp(new java.util.Date().getTime());
		System.out.println("Date ->:Timestamp " + tp);

		// Timestamp ->String
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		String tstr = df.format(ts);
		System.out.println("Timestamp ->String DateFormat: " + tstr);
		System.out.println("Timestamp ->String toString: " + ts.toString());

		// String ->Timestamp  (ps. 字串一定要寫到時分秒)
		String st = "2011-05-09 11:49:45";
		Timestamp pt = Timestamp.valueOf(st);
		System.out.println("String ->Timestamp valueOf: "+pt);

	}
}
