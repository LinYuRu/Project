package service.util;

import java.util.Calendar;

public class Calander_test {
	public static void main(String[] args) {
	Calendar birth = Calendar.getInstance();
	birth.set(1996, Calendar.MAY, 26);
	Calendar now = Calendar.getInstance();
	System.out.printf("歲數: %d%n", yearsBetween(birth, now));
//	System.out.printf("天數: %d%n", daysBetween(birth, now));
	}
	
	public static long yearsBetween(Calendar begindate, Calendar enddate) {
		Calendar calendar = (Calendar) begindate.clone();
		long years = 0;
		while (calendar.before(enddate)) {
			calendar.add(Calendar.YEAR, 1);
			years++;
		}
		return years -1;
	}
	
	public static long daysBetween(Calendar begindate, Calendar enddate) {
		Calendar calendar = (Calendar) begindate.clone();
		long days = 0;
		while (calendar.before(enddate)) {
			calendar.add(Calendar.DATE, 1);
			days++;
		}
		return days -1;
	}
	
}
