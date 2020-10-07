package JavaFlowControl;

public class TestIfElseEx1 {

	public static void main(String[] args) {
		int DiceNumber = (int) (Math.random() * 6 + 1);
		int YourLuckyNumber = 3;
		System.out.println(("DiceNumber = ") + DiceNumber);
		if (YourLuckyNumber == DiceNumber) {
			System.out.println("You Win!!");
		} else {
			System.out.println("Please Try again!!");
		}
	}
}
