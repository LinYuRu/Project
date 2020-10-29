package service.util;

import java.io.UnsupportedEncodingException;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {
	private final static int Min_HOUR = 0;
	private final static int Max_HOUR = 23;
	private final static int Min_Minute = 0;
	private final static int Max_Minute = 59;
	
	public static boolean is24Hm(String hm) {
		if(StringUtils.isEmpty(hm)) {
			throw new RuntimeException("不能為空");
		}
		String[] copy = hm.split(":");
		convertToMinute(copy[1]);
		convertToHour(copy[0]);
		
		if(is24HmFormat(hm)) {
			return true;
		}
		return false;
	}
	
	public static boolean is24HmFormat(String hms) {
		if(StringUtils.isEmpty(hms)) {
			return false;
		}
		
		String pattern = "[0-9]{1,2}:[0-9]{1,2}";
		if(hms.matches(pattern)) {
			return true;
		}
		return false;
	}
	
	public static boolean is24HmsFormat(String hms) {
		if(StringUtils.isEmpty(hms)) {
			return false;
		}
		
		String pattern = "[0-9]{1,2}:[0-9]{1,2}:[0-9]{1,2}";
		if(hms.matches(pattern)) {
			return true;
		}
		return false;
	}
	
	public static int convertToHour(String HourStr) {
		if (StringUtils.isEmpty(HourStr)) {
			throw new RuntimeException("小時不能為空");
		}
		try {
			int hour = Integer.parseInt(HourStr);
			if (hour < Min_HOUR || hour > Max_HOUR) {
				throw new RuntimeException();
//					new StringBuffer("分鐘必須>=").append(Min_Minute).append(", <=").append(Max_Minute).toString());
			}
			return hour;
		} catch (Exception e) {
			throw new RuntimeException("小時必須為整數, 且 >=0, <=23.");
		} 
	}
	

	public static int convertToMinute(String minuteStr) {
		if (StringUtils.isEmpty(minuteStr)) {
			throw new RuntimeException("分鐘不能為空");
		}
		try {
			int minute = Integer.parseInt(minuteStr);
			if (minute < Min_Minute || minute > Max_Minute) {
//				throw new RuntimeException();
				throw new RuntimeException(new StringBuffer("分鐘必須>=").append(Min_Minute).append(", <=").append(Max_Minute).append(".").toString());
			}
			return minute;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		} 
	}

	public static String getFileNameFromRefPath(String refFilePath, String wantExt) {
		String fileName = getFileNameFromPath(refFilePath);
		if (StringUtils.isBlank(fileName)) {
			throw new RuntimeException("參考檔名/路徑為空");
		}

		String mainFileName = fileName;

		int dotPos = fileName.lastIndexOf(".");
		if (dotPos >= 0) {
			mainFileName = fileName.substring(0, dotPos);
		}

		String result = mainFileName;
		if (!StringUtils.isBlank(wantExt)) {
			if (wantExt.charAt(0) == '.') {
				result = mainFileName + wantExt;
			} else {
				result = mainFileName + "." + wantExt;
			}
		}
		return result;
	}

	public static String[] splitAllChars(String input) {
		if (StringUtils.isBlank(input)) {
			return new String[0];
		}

		String[] resultArray = new String[input.length()];
		for (int i = 0; i < input.length(); i++) {
			resultArray[i] = input.substring(i, i + 1);
		}
		return resultArray;
	}

	/**
	 * 從包含路徑的檔名中取出檔名
	 * 
	 * @param filePath: 包含路徑的檔名
	 * @return filePath若為空白、""、null, 傳回空字串("")
	 **/
	public static String getFileNameFromPath(String filePath) {
		filePath = StringUtils.trimToEmpty(filePath);
		if (StringUtils.isBlank(filePath)) {
			return "";
		}

		filePath = filePath.replace("\\", "/");
		String fileName = filePath.substring(filePath.lastIndexOf("/") + 1);
		return fileName;
	}

	/** 取得副檔名 **/
	public static String getExtension(String filePath) {
		filePath = StringUtils.trimToEmpty(filePath);
		if (StringUtils.isBlank(filePath)) {
			return "";
		}

		String extensioin = filePath.substring(filePath.lastIndexOf("."));
		return extensioin;
	}

	/**
	 * @author ust
	 * @param str 將表示HTML tag的 '<' , '>' 轉換成 "&lt", "&gt"
	 **/
	public static String transformHtmlTagToChars(String str) {
		if (StringUtils.isEmpty(str)) {
			System.out.println("empty HTML tags");
			return str;
		}

		String result = str.replace("<", "&lt").replace(">", "&gt");
		return result;
	}

	/**
	 * 在原字串右側加上指定字串，直到字串達到指定長度
	 * 
	 * @param input:舊字串
	 * @param c:要放在右側的字元
	 * @param byteLen:新字串長度(以byte計算)
	 * @return:新字串
	 **/
	public static String leftPadInUtf8Byte(String input, char c, int byteLen) {
		StringBuffer buf = new StringBuffer("");
		int LenUft8 = getByteLenInUTF8(input);

		int padbytes = byteLen - LenUft8;
		for (int i = 0; i < padbytes; i++) {
			buf.append(c);
		}
		buf.append(input);
		return buf.toString();
	}

	/**
	 * 在原字串右側加上指定字串，直到字串達到指定長度
	 * 
	 * @param input:舊字串
	 * @param c:要放在右側的字元
	 * @param byteLen:新字串長度(以byte計算)
	 * @return:新字串
	 **/
	public static String rightPadInUtf8Byte(String input, char c, int byteLen) {
		StringBuffer buf = new StringBuffer("");
		int LenUft8 = getByteLenInUTF8(input);

		buf.append(input);
		int padbytes = byteLen - LenUft8;
		for (int i = 0; i < padbytes; i++) {
			buf.append(c);
		}
		return buf.toString();
	}

	/**
	 * 求出字串字元數
	 * 
	 * @param input
	 * @return 若字串為null 傳回0
	 **/
	public static int getCharLen(String input) {
		int CharLen = 0;
		if (input != null) {
			CharLen = input.length();
		}
		return CharLen;
	}

	/**
	 * 求出字串的UTF8碼長度
	 * 
	 * @param input
	 * @return 若字串為null 傳回0
	 **/
	public static int getByteLenInUTF8(String input) {
		int lenUtf8 = 0;
		if (StringUtils.isNotBlank(input)) {
			try {
				byte[] byteUtf8 = input.getBytes("UTF-8");
				lenUtf8 = byteUtf8.length;
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		} else {
			lenUtf8 = 0;
		}
		return lenUtf8;
	}

	/**
	 * 求出字串的Big5碼長度
	 * 
	 * @param input
	 * @return 若字串為null 傳回0
	 **/
	public static int getByteLenInBig5(String input) {
		int lenBig5 = 0;
		if (StringUtils.isNotBlank(input)) {
			try {
				byte[] byteUtf8 = input.getBytes("Big5");
				lenBig5 = byteUtf8.length;
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		} else {
			lenBig5 = 0;
		}
		return lenBig5;
	}
}
