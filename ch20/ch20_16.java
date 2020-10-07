package ch20;

public class ch20_16 {
	public static String myDiv(int x, int y) {
		try {
			return Integer.toString(x/y);
		}
		catch (ArithmeticException e) {
			System.out.println("除數為零的異常  : " + e);
			System.out.println("toString          : " + e.toString());
			System.out.println("getMessage   :" + e.getMessage());
			System.out.println("以下是e.printStackTrace內容");
			e.printStackTrace();
			System.out.println("======================");
			return "執行除法運算時須避開除數為零的";
		}
	}

	public static void main(String[] args) {
		System.out.println(myDiv(6, 2));
		System.out.println(myDiv(8, 0));
		System.out.println(myDiv(9, 4));

	}

}
