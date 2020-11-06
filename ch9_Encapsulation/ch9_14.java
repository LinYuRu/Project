package ch9_Encapsulation;
//class TaipeiBank{
//	private String name;
//	private int balance;
//	public TaipeiBank(String name) {
//		this.name = name;
//		this.balance = 0;
//	}
//	public void saveMoney(int money) {
//		this.balance +=money;
//	}
//	public void withdrawMoney(int money) {
//		this.balance -= money;
//	}
//	public void get_balance() {
//		System.out.println(name + "目前存款餘額" + balance);
//	}
//}
public class ch9_14 {

	public static void main(String[] args) {
		TaipeiBank user = new TaipeiBank("Alex");
		user.get_balance();
		user.saveMoney(1000);
		user.get_balance();
		user.withdrawMoney(500);
		user.get_balance();

	}

}
