package ch20_Exception;

public class ch20_5 {
	public static String myDiv(int x, int y) {
		try {
			return Integer.toString(x/y);
		}
		catch(ArithmeticException e) {
//			catch(NullPointerException e) {
			System.out.println("除數為零的異常" + e);
			return "執行除法運算時須避開除數為零的";
		}
	}

	public static void main(String[] args) {
		System.out.println(myDiv(6, 2));
		System.out.println(myDiv(8, 0));
		System.out.println(myDiv(9, 4));

	}

}
