package ch12;

public class ch12_12 {

	public static void main(String[] args) {
		String s1 = "Ming-Chi Institute of Technology";
		String s3 = new String();
		s3 = "Ming-Chi University of Technology";
		String s2 = "Ming-Chi University of Technology";
		StringBuffer s4 = new StringBuffer(s1);
		s4.append('9');
		System.out.println(s4);
		System.out.println("s1轉換小寫前 : " + s1);
		System.out.println("s1轉換小寫後 : " + s1.toLowerCase());
		System.out.println("s2轉換大寫前 : " + s2);
		System.out.println("s2轉換大寫後 : " + s2.toUpperCase());
		System.out.println("s3轉換小寫前 : " + s3);
		System.out.println("s3轉換小寫後 : " + s3.toLowerCase());

	}

}
