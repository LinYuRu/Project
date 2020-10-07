package Collection;

public class CallTestEqualsEX2 {

	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println("(str1==str2) : "+(str1==str2));
		System.out.println("(str1==str2) : "+(str1.equals(str2)));
		
		String str3 = new String("hello");
		String str4 = "hello";
		
		System.out.println("(str3==str4) : "+(str3==str4));
		System.out.println("(str3==str4) : "+(str3.equals(str4)));
		
		String str5 = "hello";
		String str6 = "hello";
		
		System.out.println("(str5==str6) : "+(str5==str6));
		System.out.println("(str5==str6) : "+(str5.equals(str6)));
		

	}

}
