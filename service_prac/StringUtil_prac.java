package service_prac;

import org.apache.commons.lang3.StringUtils;
import service.util.StringUtil;

public class StringUtil_prac {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "Hello world";
//		System.out.println(StringUtil.getByteLenInUTF8(input));
//		System.out.println(StringUtil.getByteLenInBig5(input));
//		System.out.println(StringUtil.getCharLen(input));
//		String result = StringUtil.rightPadInUtf8Byte(input, 'c', 20);
//		System.out.println(result);
//		String filePath = "D:\\Download\\findCarMainDriverByPk.docx";
//		String path = StringUtil.getFileNameFromPath(filePath);
//		System.out.println(path);
		
//		String[] result = StringUtil.splitAllChars(input);
//		for(String s: result) {
//			System.out.println(s);
//		}

		//		String[] result = StringUtils.split(input);
//		for (String s : result) {
//			System.out.println(s);
//		}
//		String filePath = "D:\\Download\\findCarMainDriverByPk.doc";
//		String fileName = StringUtil.getFileNameFromRefPath(filePath, ".doc");
//		System.out.println(fileName);
//		String ex = StringUtil.getExtension(filePath);
//		System.out.println(ex);
		
//		String minuteStr = "50";
//		String hourStr = "50";
//		int minute = StringUtil.convertToMinute(minuteStr);
//		int hour = StringUtil.convertToHour(hourStr);
//		System.out.println(hour);

		String hms = "21:28:70";
		String hm = "21:88";
		Boolean s = StringUtil.is24HmsFormat(hms);
		Boolean sh = StringUtil.is24HmFormat(hm);
		String[] str = hm.split(":");
		for(String k : str) {
			System.out.println(k);
		}
		Boolean testResult = StringUtil.is24Hm(hm);
		System.out.println(testResult);
//		System.out.println(s);
//		System.out.println(sh);
//		String test = new String("分鐘必須>=0, <=59");
//		System.out.println(test);
		
	}

}
