package ch20;

public class ch20_4_1 {
	public static int myDiv(int x, int y) throws ArrayIndexOutOfBoundsException {
		if ( y==0) {
			System.out.print("除數為零發生異常 : ");
			return 0;
		}
		else
			return x/y;
	}

	public static void main(String[] args) {
		try {
		System.out.println(myDiv(6, 2));
		System.out.println(myDiv(8, 0));
		System.out.println(myDiv(9, 4));
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("ArrayIndexOutOfBoundsException發生了");
		}

	}


}
