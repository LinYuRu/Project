package week0427;

class TaipeiBank {
	private String name;
	private int balance;
	private int rate = 30;
	private double service_charge = 0.01;

	public TaipeiBank(String name) {
		this.name = name;
		this.balance = 0;
	}

	public void saveMoney(int money) {
		balance += money;
	}

	public void withdrawMoney(int money) {
		balance -= money;
	}

	public double use_to_taiwan(int usaD) {
		if (this.balance >= 10000) {
			this.service_charge = 0.008;
		}
		return cal_rate(usaD);
	}

	private double cal_rate(int usaD) {
		double result;
		result = usaD * rate * (1 - service_charge);
		return result;
	}

	public void get_balance() {
		System.out.println(name + "目前存款餘額 " + balance);
	}
}

public class Encapsulation_prac02 {

	public static void main(String[] args) {
		TaipeiBank user = new TaipeiBank("Alex");
		int usadallor = 50;
		user.saveMoney(5000);
		System.out.println(usadallor + "美金可以兌換" + user.use_to_taiwan(usadallor) + "台幣");
		
		user.saveMoney(15000);
		System.out.println(usadallor + "美金可以兌換" + user.use_to_taiwan(usadallor) + "台幣");
	}

}
