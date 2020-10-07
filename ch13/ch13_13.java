package ch13;

public class ch13_13 {

	public static void main(String[] args) {
		String s1 = "Johnson";
		String s2 = "Johnnason";
		String s3 = "Johnnanananason";
		String pattern = "John((na)*son)";
		System.out.println("Johnson                   : " +s1.matches(pattern));
		System.out.println("Johnnason               : " +s2.matches(pattern));
		System.out.println("Johnnanananason : " +s3.matches(pattern));

	}

}
