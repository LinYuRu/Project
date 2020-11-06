package ch20_Exception;

public class ch20_19 {
	public static void myMethod(int x1, int x2) throws ArithmeticException {
		System.out.println("數字除法結果是" + (x1 / x2));
	}

	public static void main(String[] args) {
		int[] [] x = {{10, 2}, {10, 0}, {10, 5}};
		for( int i = 0 ; i < x.length; i++) {
			try {
				myMethod(x[i][0], x[i][1]);
			}
			catch(ArithmeticException e) {
				System.out.println("除數為零的異常" + e);
			}
		}

	}

}
