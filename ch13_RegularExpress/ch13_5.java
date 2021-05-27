package ch13_RegularExpress;

public class ch13_5 {

	public static void main(String[] args) {
		String s1 = "I Love Java";
		String s2 = "0952-909-789";
		String s3 = "1111-111111";
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		System.out.println("I Love Java是手機號碼" +s1.matches(pattern));
		System.out.println("0952-909-789是手機號碼" +s2.matches(pattern));
		System.out.println("1111-111111是手機號碼" +s3.matches(pattern));


		String pa = "\\d{4}(-\\d{3}){2}";
		String pa2 = "\\d{4}-\\d{6}";
		System.out.println("I Love Java是手機號碼" +s1.matches(pa));
		System.out.println("0952-909-789是手機號碼" +s2.matches(pa));
		System.out.println("1111-111111是手機號碼" +s3.matches(pa2));
	}

}
