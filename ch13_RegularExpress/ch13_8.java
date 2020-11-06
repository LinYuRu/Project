package ch13_RegularExpress;

public class ch13_8 {

	public static void main(String[] args) {
		String s1 = "I Love Java";
		String s2 = "0952-909-789";
		String s3 = "(111)-1111111";
		String pattern = "\\d{4}(-\\d{3}){2}";
		System.out.println("I Love Java是手機號碼" +s1.matches(pattern));
		System.out.println("0952-909-789是手機號碼" +s2.matches(pattern));
		System.out.println("(111)-1111111是手機號碼" +s3.matches(pattern));

	}

}
