package ch20;

public class ch20_10 {

	public static void main(String[] args) {
		try {
			String str = "Ming-Chi";
			char c = str.charAt(3);
			System.out.println("C字元是 : " + c);
			c = str.charAt(10);
			System.out.println("C字元是 : " + c);
			
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("索引值超出範圍" + e);
		}
		System.out.println("ch20_10.java程式結束");

	}

}
