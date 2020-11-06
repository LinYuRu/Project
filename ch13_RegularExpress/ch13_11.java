package ch13_RegularExpress;

public class ch13_11 {

	public static void main(String[] args) {
		String s1 = "Johnson";
		String s2 = "Johnnason";
		String s3 = "John";
		String pattern = "John((na)?son)";
		System.out.println("Johnson      : " +s1.matches(pattern));
		System.out.println("Johnnason  : " +s2.matches(pattern));
		System.out.println("John             : " +s3.matches(pattern));

	}

}
