package JavaPractice_phctw;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Security_prac01 {

	public static String string2MD5(String inStr) {
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			e.printStackTrace();
		}
		char[] charArray = inStr.toCharArray();
		byte[] byteArray = new byte[charArray.length];

		for (int i = 0; i < charArray.length; i++)
			byteArray[i] = (byte) charArray[i];
		byte[] md5Bytes = md5.digest(byteArray);
		StringBuffer hexValue = new StringBuffer();
		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16)
				hexValue.append("0");
			hexValue.append(Integer.toHexString(val));
		}
		return hexValue.toString();

	}

	/**
	 * 加密解密演算法 執行一次加密,兩次解密
	 */
	public static String convertMD5(String inStr) {

		char[] a = inStr.toCharArray();
		for (int i = 0; i < a.length; i++) {
			a[i] = (char) (a[i] ^ 't');
		}
		String s = new String(a);
		return s;

	}

	public static String md5(String s) {
		try {
			// Create MD5 Hash
			MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
			digest.update(s.getBytes());
			byte messageDigest[] = digest.digest();

			// Create Hex String
			StringBuffer hexString = new StringBuffer();
			for (int i = 0; i < messageDigest.length; i++) {
				hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
			}
			return hexString.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "";
	}

	public static void main(String[] args) {
		//MD5加密
//		String code=Code.generateUniqueCode();
		String s = new String("123456");
		String s1 = new String("wong2wai3dah123");
//		System.out.println("原始:" + s);
//		System.out.println("MD5後:" + string2MD5(s));
//		System.out.println("MD5後:" + string2MD5(s1));
//		System.out.println("md5(s): " + md5(s));
//		System.out.println("md5(s1): " + md5(s1));
//		System.out.println("加密的:" + convertMD5(s));
//		System.out.println("原始:" + s);
//		System.out.println("MD5後:" + string2MD5(s));
//		System.out.println("MD5後:" + string2MD5(s1));
//		 System.out.println("加密的:" + convertMD5(s));
		System.out.println("MD5後:" + convertMD5(s));
		System.out.println("解密的:" + convertMD5(convertMD5(s)));
		System.out.println("解密的:" + convertMD5(string2MD5(s)));

	}

}
