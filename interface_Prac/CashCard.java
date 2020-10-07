package interface_Prac;

public class CashCard {

	String number;
	int balance;
	int bonus;

	CashCard(String number, int balance, int bonus) {
		this.number = number;
		this.balance = balance;
		this.bonus = bonus;
	}

	@SuppressWarnings("null")
	public static void main(String[] args) {
		CashCard[] cards = null;
				new CashCard("A001", 500,0);
				new CashCard("A002", 300,0);
				new CashCard("A003", 1000,1);
				new CashCard("A004", 2000,2);
				new CashCard("A005", 5000,3);
		
		
		for(CashCard card:cards) {
			System.out.printf("(%s, %d, %d)%n", card.number, card.balance, card.bonus);
		}
		}
}
