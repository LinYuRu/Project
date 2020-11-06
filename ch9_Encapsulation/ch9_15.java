package ch9_Encapsulation;

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
public class ch9_15 {
	public static void main(String[] args) {
		System.out.println("公告牌價: 一美元兌換$30台幣");
		System.out.println();
		System.out.println("目前存款金額大於10000, 換匯手續費1%");
		TaipeiBank user = new TaipeiBank("Alex");
		int usadallor = 50;
		user.saveMoney(5000);
		System.out.println("當前外幣存款$5000, $50美金可以兌換" + user.use_to_taiwan(usadallor) + "台幣");
		System.out.println();
		System.out.println("目前存款金額大於10000, 換匯手續費0.8%");
		user.saveMoney(15000);
		System.out.println("當前外幣存款$20000, $50美金可以兌換" + user.use_to_taiwan(usadallor) + "台幣");
	}
}
