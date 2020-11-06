package ch13_RegularExpress;

public class ch13_18 {

	public static void main(String[] args) {
		String s1 = "cat";
		String s2 = "hat";
		String s3 = "flat";
		String s4 = "at";
		String s5 = " at";
		String pattern = ".at";
		System.out.println("cats     : " + s1.matches(pattern));
		System.out.println("hat      : " + s2.matches(pattern));
		System.out.println("flat      : " + s3.matches(pattern));
		System.out.println("at         : " + s4.matches(pattern));
		System.out.println(" at        : " + s5.matches(pattern));

	}

}
