package JavaPractice_phctw;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Logic_prac05 {

	public static void main(String[] args) throws IOException {
		getBirthDay();
//		birthdayStr();
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		Date day = new Date();
//		System.out.println(dateFormat.format(day));
//		dateFormat.format(day);
//		Scanner sc = new Scanner(System.in); 
//        System.out.println("請輸入指定日期(格式20180117)："); 
//        String dates = sc.nextLine(); 
//        System.out.println("請輸入指定天數："); 
//        String day = sc.nextLine(); 
//        getDate(dates, day);
	}

	public static int getBirthDay() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		int age = 0;
		Integer birthday = null;
//		birthday = Integer.valueOf(birthdayStr());
		Date today = new Date();// 今天日期Date
		try {
			age = minusDate(today, birthdayStr());// 年齡 型態日期
//			age = dateFormat.format(date);
			System.out.println("年齡" + age);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return age;
	}

	public static Date birthdayStr() {
		Random r = new Random();
		String monthstr = null;
		String daystr = null;

		int months = (r.nextInt(12) + 1);
		if (months < 10) {
			monthstr = "0" + Integer.toString(r.nextInt(12) + 1);
		} else {
			monthstr = Integer.toString(r.nextInt(12) + 1);
		}
		int days = (r.nextInt(30) + 1);
		if (days < 10) {
			daystr = "0" + Integer.toString(days);
		} else {
			daystr = Integer.toString(days);
		}
		String yearstr = Integer.toString(r.nextInt(30) + 1980);
		String birthday = yearstr + monthstr + daystr;

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date date = null;
		try {
			date = dateFormat.parse(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("birthday: " + birthday);
		return date;
	}

	public static int minusDate(Date today, Date birthday) throws ParseException {
		Calendar cal = Calendar.getInstance();
		Calendar bir = Calendar.getInstance();
		bir.setTime(birthday);
		if (cal.before(birthday)) {
			throw new IllegalArgumentException("The birthday is before Now,It‘s unbelievable");
		}
		int yearNow = cal.get(Calendar.YEAR);
		int monthNow = cal.get(Calendar.MONTH);
		int dayNow = cal.get(Calendar.DAY_OF_MONTH);
		int yearBirth = bir.get(Calendar.YEAR);
		int monthBirth = bir.get(Calendar.MONTH);
		int dayBirth = bir.get(Calendar.DAY_OF_MONTH);
		int age = yearNow - yearBirth;
		if (monthNow < monthBirth || (monthNow == monthBirth && dayNow < dayBirth)) {
			age--;
		}
		return age;
	}

//	public static String getDate(String dates, String day) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
//
//		Date date = null;
//		Date newDate = null;
//
//		try {
//			date = dateFormat.parse(dates);
//			newDate = addDate(date, Integer.valueOf(day));
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		System.out.println(dateFormat.format(date));
//		System.out.println(dateFormat.format(newDate));
//		System.out.println(date.toString());
//		return dateFormat.format(newDate);
//	}
//
//	public static Date addDate(Date date, long day) throws ParseException {
//		long time = date.getTime();
//		day = day * 24 * 60 * 60 * 1000; 
//		time += day;
//		return new Date(time);
//	}

}
