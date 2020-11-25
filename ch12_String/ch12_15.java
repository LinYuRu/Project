package ch12_String;

import java.util.ArrayList;

public class ch12_15 {

	public static void main(String[] args) {
		
		
//		String str = "ZXCVasdfghjk";
//		System.out.println(str.charAt(2));
//		System.out.println(str.substring(2,4));
//		char[] array = null;
//		array = str.toCharArray();
//		System.out.println(array);
//		int len = array.length;
//		System.out.println(len);
//		String lowercase = str.toLowerCase();
//		System.out.println(lowercase);
		
		ArrayList<String> st = new ArrayList<String>();
		st.add("a");
		st.add("b");
		st.set(0, "c");
		for(String temp:st)
		System.out.println(temp);

	}

}
