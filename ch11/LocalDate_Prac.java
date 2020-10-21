package ch11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Date;

public class LocalDate_Prac {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
//		System.out.println("原本模式: "+today);
//		System.out.println("getYear(): " + today.getYear());
//		System.out.println("getMonth(): "+ today.getMonth());
//		System.out.println("getDayOfMonth(): "+ today.getDayOfMonth());
//		System.out.println("getDayOfYear(): "+ today.getDayOfYear());
//		System.out.println("getDayOfWeek(): "+ today.getDayOfWeek());
//		System.out.println("getDayOfMonth(): "+ today.getLong(ChronoField.DAY_OF_MONTH));
		LocalTime at = LocalTime.of(10, 20);
		System.out.println("新時間: " + at);
		at = LocalTime.of(11, 40, 30);
		System.out.println("new time1: " + at);
		at = LocalTime.of(23, 21, 23, 300000000);
		System.out.println("new time2: " + at);
		LocalDateTime now = LocalDateTime.now();
		System.out.println("現在日期時間: " + now);

	}

}
