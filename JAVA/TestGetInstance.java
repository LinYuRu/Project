package JAVA;

import java.util.Calendar;
import java.util.Date;

public class TestGetInstance {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date date = new Date(10000000000L);
		c.setTime(date);
		System.out.println(date);
		
//		String[] months = { "一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月" };
//		Calendar c = Calendar.getInstance();
//		System.out.println(c.DATE);
////		c.set(Calendar.MONTH, 1);
//		System.out.println(c.get(c.YEAR));
//		System.out.println(months[c.get(c.MONTH)]);
//		String[] dayOfWeek = { "", "日", "一", "二", "三", "四", "五", "六" };
//		System.out.println(dayOfWeek[c.get(c.DAY_OF_WEEK)]);
		System.out.println("目前時間: " + c.get(c.YEAR) + (c.get(c.MONTH) + 1) + c.get(c.DATE));
//		// 還可以使用add()方法，來改變Calendar的時間，例如：
//		c.add(Calendar.MONTH, 1); // 目前時間加1個月
//		System.out.println("加1個月: " + c.get(c.YEAR) + (c.get(c.MONTH) + 1) + c.get(c.DATE));
////		c.add(Calendar.HOUR, 3); // 目前時間加3小時
////		System.out.println(c.get(c.YEAR) + c.get(c.MONTH) + c.get(c.DATE));
//		c.add(Calendar.YEAR, -2); // 目前時間減2年
//		System.out.println("減2年: " + c.get(c.YEAR) + (c.get(c.MONTH) + 1) + c.get(c.DATE));
//		c.add(Calendar.DAY_OF_WEEK, 3); // 目前的時間加3天
//		System.out.println("加3天: " + c.get(c.YEAR) + (c.get(c.MONTH) + 1) + c.get(c.DATE));
//
//		// 如果打算只針對日期中某個欄位加減，則可以使用roll()方法，例如：
//		c.roll(Calendar.MONTH, 10); // 只增加月的欄位值為10個月
//		System.out.println("只增加月的欄位值為10個月: " + c.get(c.YEAR) + (c.get(c.MONTH) + 1) + c.get(c.DATE));

		
		//		LocalDate lt = LocalDate.now();
//		System.out.println(lt);
//		Period period = Period.between(LocalDate.of(2020, 04, 29), LocalDate.of(1986, 8, 03));
//		System.out.println(period);

	}

}
