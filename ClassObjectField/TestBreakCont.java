package ClassObjectField;

public class TestBreakCont {

	public static void main(String[] args) {
		int a = 1, b = -2, c = 1;
		double q;

		System.out.println("aX^2 + bX + c = 0");

		q = b * b - 4 * a * c;

		if (q > 0) {
			double s1 = Math.sqrt(q);
			System.out.println(" X = " + (-b + s1) / (2 * a) + "或" + (-b - s1) / (2 * a));

		} else if (q == 0) {
			double q2 = -b / (2 * a);
			System.out.println("x = " + q2);
		} else {
			System.out.println("x無實數解");
		}

	}
}
