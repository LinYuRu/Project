package service_prac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import service.util.DateUtils;

public class Calander_test {
	public static void main(String[] args) {
//		 // create a calendar
//	      Calendar cal = Calendar.getInstance();
//
//	      // get the maximum value that year field can have
//	      int i = cal.getActualMaximum(Calendar.YEAR);
//	      System.out.println("Maximum year:" + i);
//		  
//	      // get the maximum value that month field can have
//	      int a = cal.getActualMaximum(Calendar.MONTH);
//	      System.out.println("Maximum month:" + a);
	      
//	Calendar birth = Calendar.getInstance();
//	birth.set(1996, Calendar.MAY, 26);
//	Calendar now = Calendar.getInstance();
//	System.out.printf("歲數: %d%n", yearsBetween(birth, now));
//	System.out.printf("天數: %d%n", daysBetween(birth, now));
//		System.out.println("今天是不是工作日: " + DateUtils.isBusinessDay());
//		System.out.println("今天是幾號: " + DateUtils.getToday());
		Date date = new Date();
		System.out.println(date);
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		ca.add(Calendar.MONTH, -1);
//		try {
//			System.out.println("Day check: " + check6MonthsInString("2020-05-17"));
//			Date end = new SimpleDateFormat("yy-MM-dd").parse("2020-04-17");
//		    System.out.println("check6Month: " + check6MonthsInDate(end));
//		    
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
	
	public static boolean dateToFormat(Date date) {
		String day = new SimpleDateFormat("yyyy-MM-dd").format(date);
		return true;
	}
	
	public static boolean check6MonthsInString(String date) throws ParseException {
		Calendar tdate = Calendar.getInstance();
		tdate.add(Calendar.MONTH, -6);
		Calendar dateCheck = Calendar.getInstance();
		Date check = new SimpleDateFormat("yy-MM-dd").parse(date);
		dateCheck.setTime(check);
		if(dateCheck.before(tdate)) {
			return false;
		}
		return true;
	}
	
	public static boolean check6MonthsInDate(Date date) {
		Calendar today = Calendar.getInstance();
		today.add(Calendar.MONTH, -6);
		Calendar ck = Calendar.getInstance();
		ck.setTime(date);
		if(ck.before(today)) {
			return false;
		}
		return true;
	}

	public static long yearsBetween(Calendar begindate, Calendar enddate) {
		Calendar calendar = (Calendar) begindate.clone();
		long years = 0;
		while (calendar.before(enddate)) {
			calendar.add(Calendar.YEAR, 1);
			years++;
		}
		return years - 1;
	}

	public static long daysBetween(Calendar begindate, Calendar enddate) {
		Calendar calendar = (Calendar) begindate.clone();
		long days = 0;
		while (calendar.before(enddate)) {
			calendar.add(Calendar.DATE, 1);
			days++;
		}
		return days - 1;
	}

}
