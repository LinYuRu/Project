package JAVA;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestEqual {
	String dateStr = "2010/05/04 12:34:23";
	Date date = new Date();
	// 注意format的格式要與日期String的格式相匹配
	DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	{
		try {
			date = sdf.parse(dateStr);
			System.out.println(date.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	public int getStudentSexNo() {
//		Random r = new Random();
//		int t = r.nextInt(2) + 1;
//		System.out.println("t: "+t);
////		String s = "";
////		s += Integer.toString(t);
//		return t;
//	}
//	
//	public String getStudentSex() {
//		String id="R219588636";
//		String sex = id.substring(1,2);
//		System.out.println(sex);
//		if(sex.matches("1")) {
//			return "男";
//		}else {
//		System.out.println("女");
//		return "女";
//	}
//		Integer s = 0;
//		s += getStudentSexNo(); 
//		System.out.println("s: "+s);
//		if(s.equals(1)) {
//			System.out.println("男");
//			return "男";
//		}else {
//			System.out.println("女");
//			return "女";
//		}

//	public String getStudentSex() {
//		Integer s = 0;
//		s += getStudentSexNo(); 
//		System.out.println("s:"+s);
//		if(s.equals(1)) {
//			System.out.println("男");
//			return "男";
//		}else {
//			System.out.println("女");
//			return "女";
//		}
//	}

	public static void main(String[] args) throws ParseException {
		 SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	        Date parsed = format.parse("20110210");
	        java.sql.Date sql = new java.sql.Date(parsed.getTime());
//		String dateStr = "2010/05/04";
//		
//		Date date = new Date();
//		// 注意format的格式要與日期String的格式相匹配
//		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//		{
//			try {
//				date = sdf.parse(dateStr);
//				System.out.println(date.toString());
//				System.out.println(sdf.format(date));
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		
		
//		TestEqual t = new TestEqual();
//		t.getStudentSex();
//		String s1 = "runooob";
//		String s2 = "runooob";
//		System.out.println(s1 == s2);

	
	}
}
