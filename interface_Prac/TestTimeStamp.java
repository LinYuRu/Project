package interface_Prac;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TestTimeStamp {
	public static void main(String[]args) {
		
		//String ->Timestamp
		Timestamp ts= new Timestamp(System.currentTimeMillis());
		String str = "2020-04-09 12:49:45";
		ts = Timestamp.valueOf(str);
		System.out.println("String ->Timestamp: "+ts);
		
		//Timestamp ->String
		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String ds = sdf.format(ts);
		System.out.println("Timestamp ->String format: "+ds);
		System.out.println("Timestamp ->String toString: "+ts.toString());
		
		
	}
}
