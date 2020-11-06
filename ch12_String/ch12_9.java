package ch12_String;

public class ch12_9 {

	public static void main(String[] args) {
		String str1 = "EEIT";
		String str2 = "EEIT";
		String str3 = new String("EEIT");
		System.out.println("str1 = "+str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str1 == str2 " + (str1 == str2));
		System.out.println("str1 == str3 " + (str1 == str3));
		System.out.println("str2 == str3 " + (str2 == str3));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.indexOf('I'));
		System.out.println(str1.indexOf('E', 0));
		char[] ch = str1.toCharArray();
		System.out.println(ch);
		System.out.println(ch[0]  );

	}

}
