package ch13;

public class ch13_2 {
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

	public static void parseString(String str) {
		boolean notFoundSignal = true;
		for(int i = 0; i < (str.length()-11); i++) {
			String msg = new String();
			msg = str.substring(i, i+12);
			if(taiwanPhone(msg)) {
				System.out.println("電話號碼是: " + msg);
				notFoundSignal = false;
			}
		}
		if( notFoundSignal )
			System.out.println(str + "字串不含電話號碼");

	}
	public static void main(String[] args) {
		String msg1 ="Plz call me by 0911-111-111 or 0922-222-222";
		String msg2 ="請明天跟我一起參加明智科大教師節晚餐";
		String msg3 ="請明天跟我一起參加明智科大教師節晚餐，可用0999-999-999聯絡我";
		parseString(msg1);
		parseString(msg2);
		parseString(msg3);
	}

}
