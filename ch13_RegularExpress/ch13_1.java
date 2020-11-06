package ch13_RegularExpress;

public class ch13_1 {
	public static boolean taiwanPhone(String str) {
		if(str.length() != 12)
			return false;
		for( int i = 0; i <= 3; i++)
			if (Character.isDigit(str.charAt(i)) == false)
				return false;
		
		if(str.charAt(4) != '-')
			return false;
		for( int i = 5; i <= 7; i++)
			if (Character.isDigit(str.charAt(i)) == false)
				return false;
		
		if(str.charAt(8) != '-')
			return false;
		for( int i = 9; i <= 11; i++)
			if (Character.isDigit(str.charAt(i)) == false)
				return false;
		
		return true;
	}

	public static void main(String[] args) {
		System.out.println("I LOVE JAVA     :是台灣手機號碼" + taiwanPhone("I love Java"));
		System.out.println("0933-365-175:是台灣手機號碼" + taiwanPhone("0933-365-175"));
		System.out.println("1111-1111111:是台灣手機號碼" + taiwanPhone("1111-1111111"));

	}

}
