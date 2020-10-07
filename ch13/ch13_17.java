package ch13;

public class ch13_17 {

	public static void main(String[] args) {
		String s1 = "1 cats";
		String s2 = "32 dogs";
		String s3 = "a pigs";
		String pattern = "\\d+\\s+\\w+";
		System.out.println("1 cats     : " + s1.matches(pattern));
		System.out.println("32 dogs : " + s2.matches(pattern));
		System.out.println("a pigs     : " + s3.matches(pattern));

	}

}
