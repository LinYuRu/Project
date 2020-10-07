package ClassObjectField;

public class TestStringEx1 {

	public static void main(String[] args) {
		String data= "abcdefg";
		System.out.println("Length"+data.length());
		System.out.println("data.charAt(3)"+data.charAt(3));
		System.out.println("data.substring(3,5)"+data.substring(3,5));
		System.out.println("data.toUppercase:"+data.toUpperCase());
		System.out.println("data.indexOf('def'):"+data.indexOf("def"));
		System.out.println("data.starswith('abc')"+data.startsWith("abc"));

	}

}
