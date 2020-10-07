package ch13;

public class ch13_16 {

	public static void main(String[] args) {
		String s1 = "98_ad";
		String s2 = "@!ad9";
		String pattern = "\\w+";
		System.out.println("98_ad  : " + s1.matches(pattern));
		System.out.println("@!ad9 : " + s2.matches(pattern));

	}

}
