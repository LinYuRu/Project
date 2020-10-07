package interface_Prac;

public class TestSwitchEx {

	public static void main(String[] args) {
		long n = 0, x = 0, y = 1;
		while (n <= 45) {
			x = x + y;
			System.out.println(x);

			long Fib = x;
			x = y;
			y = Fib;
			n++;
		}
	}

}
