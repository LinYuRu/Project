package ch13_RegularExpress;

public class ch13_15 {

	public static void main(String[] args) {
		String s1 = "son";
		String s2 = "sonson";
		String s3 = "sonsonson";
		String s4 = "sonsonsonson";
		String s5 = "sonsonsonsonson";
		String pattern = "(son){3,5}";
		System.out.println("son                              : " +s1.matches(pattern));
		System.out.println("sonson                        : " +s2.matches(pattern));
		System.out.println("sonsonson                 : " +s3.matches(pattern));
		System.out.println("sonsonsonson           : " +s4.matches(pattern));
		System.out.println("sonsonsonsonson     : " +s5.matches(pattern));

	}

}
