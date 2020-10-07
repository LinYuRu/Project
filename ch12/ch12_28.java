package ch12;

public class ch12_28 {

	public static void main(String[] args) {
		String s1 = "Java";
		char[] s2 = {'入', '門', '邁', '向', '王', '者', '之', '路'};
		char[] s3 = {'王', '者', '歸', '來'};
		StringBuffer s4 = new StringBuffer(s1);
		System.out.println("s4 : " + s4);
		s4.append('9');
		System.out.println(s4);
		s4.append(s3);
		System.out.println(s4);
		s4.insert(5, s2);
		System.out.println(s4);
		s4.deleteCharAt(14);
		System.out.println(s4);
		s4.delete(14, 16);
		System.out.println(s4);
		s4.append(s3, 1, 3);
		System.out.println(s4);

	}

}
