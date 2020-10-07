package project;

public class TestStringEx1 {

	public static void main(String[] args) {
		String data = "select ename, from employee";
		
		
//		System.out.println("toString:" + data.toString("ename"));
		System.out.println("Length:" + data.length());
		System.out.println("data.charAt(3):" + data.charAt(3));
		System.out.println("data.substring(7):" + data.substring(7));
		System.out.println("data.substring(3,5):" + data.substring(3,5));
		System.out.println("data.toUpperCase():" + data.toUpperCase());
		System.out.println("data.indexOf('ename'):" + data.indexOf("ename"));
		System.out.println("data.startsWith('ename'):" + data.startsWith("ename"));
		System.out.println("data.lastIndexOf('ename'):" + data.lastIndexOf("ename"));
		
		String str1 = "12345";   //"HelloKitty"
		System.out.println(str1 + "+1=" + (str1+1));
		//希望寫出12346，但字串寫法會加在後面		

		int num1 = Integer.parseInt(str1);
		System.out.println("num1+1:" + (num1+1));

	}

}
