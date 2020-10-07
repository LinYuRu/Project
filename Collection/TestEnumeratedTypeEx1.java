package Collection;
enum Poker{
	club,diamond, heart, spade
}
public class TestEnumeratedTypeEx1 {

	public static void main(String[] args) {
		Poker suit = Poker.spade;
		
		switch(suit) {
		case spade:
			System.out.println(Poker.spade);
			break;
		case heart:
			System.out.println(Poker.heart);
			break;
		case diamond:
			System.out.println(Poker.diamond);
			break;
		case club:
			System.out.println(Poker.club);
			break;
		default:
			assert false;
		
		}
		System.out.println("No Cash");

	}

}
