package ch20;
class NotMinusException extends Exception {
	private int minusDeposit;
	public NotMinusException (int minusDeposit) {
		this.minusDeposit = minusDeposit;
	}
	public double getminusDeposit() {
		return minusDeposit;
	}
}
class NotEnoughException extends Exception {
	private int shortAmount;
	public NotEnoughException (int shortAmount) {
		this.shortAmount = shortAmount;
	}
	public double getShortAmount() {
		return shortAmount;
	}
}
class MyBank {
	private int balance;
	public void deposit(int cashin) throws NotMinusException {
		if (cashin >=0) {
			balance += cashin;
		}
		else {
			int minusBalance = -cashin;
			throw new NotMinusException(minusBalance);
		}
		
	}
	public void withdraw(int cashout) throws NotEnoughException {
		if(cashout <=balance) {
			balance -= cashout;
		}
		else {
			int shortA = cashout - balance;
			throw new NotEnoughException(shortA);
		}
	}
	public double getBalance() {
		return balance;
	}
}
public class ch20_24 {

	public static void main(String[] args) {
		MyBank obj = new MyBank();
		
		try {
			System.out.println(" deposit $1,000 ...");
			obj.deposit(-1000);
			System.out.println("Cash Out $500");
			obj.withdraw(500);
			System.out.println("Cash Out $600");
			obj.withdraw(600);
		}
		catch (NotMinusException e) {
			System.out.println("CashIn is minus : " + e.getminusDeposit());
			e.printStackTrace();
		}
		catch (NotEnoughException e) {
			System.out.println("NotEnough Deposit : " + e.getShortAmount());
			e.printStackTrace();
		}

	}

}
