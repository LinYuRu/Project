package JavaFlowControl;

public class TestIfElseEx3 {

	public static void main(String[] args) {
		int Year = 2004;
		int month = 2;
		if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0 && Year % 3200 != 0)) {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)

			{
				System.out.println(month + "has 31 days.");

			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				System.out.println(month + "has 30 days.");
			} else if (month == 2) {
				System.out.println(month + "has 29 days.");
			} else
				System.out.println("invalid month");
			System.out.println("Leap Year");
		} else {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)

			{
				System.out.println(month + "has 31 days.");

			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				System.out.println(month + "has 30 days.");
			} else if (month == 2) {
				System.out.println(month + "has 28 days.");
			} else
				System.out.println("invalid month");

		}
		System.out.println(Year + "Year");
	}
}