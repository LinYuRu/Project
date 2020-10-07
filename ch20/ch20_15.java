package ch20;

public class ch20_15 {
	public static String myTest() {
		try {
			return "明智科大";
		}
		finally {
			System.out.println("This is finally Block");
			System.out.println("即使try區塊有return敘述也會執行");
		}
	}

	public static void main(String[] args) {
		System.out.println(ch20_15.myTest());

	}

}
