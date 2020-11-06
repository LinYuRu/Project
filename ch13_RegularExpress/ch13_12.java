package ch13_RegularExpress;

public class ch13_12 {

	public static void main(String[] args) {
		String s1 = "02-23339999";
		String s2 = "23339999";
		String s3 = "(111)-1111111";
		String pattern = "(\\d{2}-)?(\\d{8})";
		System.out.println("02-23339999是電話號碼" +s1.matches(pattern));
		System.out.println("23339999是電話號碼" +s2.matches(pattern));
		System.out.println("(111)-1111111是電話號碼" +s3.matches(pattern));

	}

}
