package ch20_Exception;

public class ch20_4 {
	public static int myDiv(int x, int y) {
		if ( y==0) {
			System.out.print("除數為零發生異常 : ");
			return 0;
		}
		else
			return x/y;
	}

	public static void main(String[] args) {

		System.out.println(myDiv(6, 2));
		System.out.println(myDiv(8, 0));
		System.out.println(myDiv(9, 4));
		

	}

}
