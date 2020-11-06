package service_prac;

import java.util.Calendar;
import java.util.Date;

public class Period_prac {
	
	public static boolean checkNextMonth(Date examDate) {
		Calendar compare = Calendar.getInstance();
		compare.setTime(examDate);
		
		Calendar now = Calendar.getInstance();
		now.set(Calendar.AM_PM, 0);
		now.set(Calendar.HOUR, 0);
		now.set(Calendar.HOUR_OF_DAY, 0);
		now.set(Calendar.MINUTE, 0);
		now.set(Calendar.SECOND, 0);
		now.set(Calendar.MILLISECOND, 0);
		now.add(Calendar.MONTH, -1);
		return compare.before(now);
	}
	
	public static boolean check6Month(Date startDate, Date endDate) {
		Calendar now = Calendar.getInstance();
		now.setTime(new Date());
		now.set(Calendar.AM_PM, 0);
		now.set(Calendar.HOUR, 0);
		now.set(Calendar.HOUR_OF_DAY, 0);
		now.set(Calendar.MINUTE, 0);
		now.set(Calendar.SECOND, 0);
		now.set(Calendar.MILLISECOND, 0);
		
		Calendar start = Calendar.getInstance();
		start.setTime(startDate);
		start.set(Calendar.AM_PM, 0);
		start.set(Calendar.HOUR, 0);
		start.set(Calendar.HOUR_OF_DAY, 0);
		start.set(Calendar.MINUTE, 0);
		start.set(Calendar.SECOND, 0);
		start.set(Calendar.MILLISECOND, 0);
		if(now.before(start)) {
			System.out.println("起日小於今日");
		}
		
		Calendar end = Calendar.getInstance();
		end.setTime(endDate);
//		end.set(Calendar.AM_PM, 0);
//		end.set(Calendar.HOUR, 0);
//		end.set(Calendar.HOUR_OF_DAY, 0);
//		end.set(Calendar.MINUTE, 0);
//		end.set(Calendar.SECOND, 0);
//		end.set(Calendar.MILLISECOND, 0);

//		end.add(Calendar.MONTH, -6);
		if(start.before(end)) {
			System.out.println("通行其間不能大於六個月");
		}
		return start.before(end);
	}
	public static void main(String[] args) { 
		//example.3
		Date startDate = new Date(2020, 01, 20);
		Date endDate = new Date(2020, 11, 01);
		Boolean result = Period_prac.check6Month(startDate, endDate);
		if(result) {
			System.out.println("more than 6 month");
		} else {
			System.out.println("less than 6 month");
		}
		
		//example.2
//		Date today = new Date(2020,01,10);
//		Boolean check = Period_prac.checkNextMonth(today);
//		if(check) {
//			System.out.println("before");
//		} else {
//			System.out.println("after");
//		}
		
		// example.1
//		long startTime, endTime = 0;
//		int sum = 0;
//		startTime = System.currentTimeMillis();
//		for (int i = 0; i < 50000; i++) {
//			for (int j = 0; j < 50000; j++) {
//				sum = i * j;
//				if (sum > 2000000000) {
//					endTime = System.currentTimeMillis();
//					break;
//				}
//			}
//		}
//		System.out.println("startTime: " + startTime);
//		System.out.println("endTime: " + endTime);
//		System.out.printf("花了 %d 毫秒", (endTime - startTime));

//		double a = 1;
//		System.out.println(a);
	}
}
