package service.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class DateUtils {

	public static boolean isBusinessDay() {
		boolean isBusinessDay = true;
		int iToday = 0;
		Calendar calendar = Calendar.getInstance();
		iToday = calendar.get(7);
		if ((iToday == 1) || (iToday == 7)) {
			isBusinessDay = false;
		}
		return isBusinessDay;
	}

	public static String getToday() {
		Calendar calendar = Calendar.getInstance();
		int tYear = calendar.get(1);
		int tMonth = calendar.get(2) + 1;
		int tDate = calendar.get(5);
		return String.valueOf(tYear * 10000 + tMonth * 100 + tDate);
	}

	public static Integer getNow() {
		String format = new SimpleDateFormat("dd").format(new Date());
		Integer days = Integer.valueOf(format);
		return days;
	}

	/**
	 * 格式化西元/民國日期字串
	 * 
	 * @param date: 日期字串
	 * 
	 * @param separate: 分隔字元
	 * 
	 * @return 已格式化的日期字串 ex: formatDate("20130101","/") return "2013/01/01"
	 *         formatDate("1020101","/") return "102/01/01" 傳入空的分隔字元可用來移除已存在的任何分隔符號
	 *         "20130101" formatDate("102-01-01","") return "1020101"
	 * 
	 **/
	public static String formatDate(String date, String separate) {
		final int temp0 = 0;
		final int temp3 = 3;
		final int temp4 = 4;
		final int temp5 = 5;
		final int temp6 = 6;
		final int temp7 = 7;
		final int temp8 = 8;

		if (StringUtils.isBlank(date)) {
			return "";
		}
		String str = "";
		for (int i = 0; i < date.length(); i++) {
			if (Character.isDigit(date.charAt(i))) {
				str += date.charAt(i);
			}
		}

		if (str.length() < temp7) {
			str = insertStr(str, temp7, "0");
		}

		if (separate != null && !separate.equals("")) {
			if (str.length() == temp7) {
				str = str.substring(temp0, temp3) + separate + str.substring(temp3, temp5) + separate
						+ str.substring(temp5, temp7);
			}
			if (str.length() == temp8) {
				str = str.substring(temp0, temp4) + separate + str.substring(temp4, temp6) + separate
						+ str.substring(temp6, temp8);
			}
		}
		return str;
	}

	public static String insertStr(String str, int leng, String word) {
		StringBuffer sb = new StringBuffer(str);
		int realLeng = str.getBytes().length;
		for (int i = 0; i < (leng - realLeng); i++) {
			sb.insert(0, word);
		}
		return sb.toString();
	}
}
