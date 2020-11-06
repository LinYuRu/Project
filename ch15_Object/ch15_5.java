package ch15_Object;

public class ch15_5 {

	public static void main(String[] args) {
		String str1 = "明智科大";
		StringBuilder sb1 = new StringBuilder(str1);
		String str2 = new String("明智科大");
		StringBuilder sb2 = new StringBuilder(str2); 
		
		System.out.println("使用String類別的equals: " + str1.equals(str2));
		System.out.println("使用Object類別的equals: " + sb1.equals(sb2));

	}

}
