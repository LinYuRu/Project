package SE9_ch13;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date date1 = new Date(System.currentTimeMillis());
		Date date2 = new Date();
		System.out.println(date1.getTime());
		System.out.println(date2.getTime());
		System.out.println(date2.toString());
		System.out.println(date2.toGMTString());
		System.out.println(date2.toLocaleString());
		System.out.println(date2.toInstant());

	}

}
