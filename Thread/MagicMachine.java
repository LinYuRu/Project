package Thread;

class withDraw implements Runnable {
	private Account account;
	private double withdrawMoney;

	public withDraw(Account account, double withdrawMoney) {
		this.account = account;
		this.withdrawMoney = withdrawMoney;
	}

	public void run() {
		synchronized (account) {
		account.withDraw(account, withdrawMoney);
	}}
}

class Account {
	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	public void withDraw(Account account, double withdrawMoney) {
		String tName = Thread.currentThread().getName();
		System.out.println(tName + " 開始提款 ... ");		
		
			double tmpBalance = balance;
			
			for(double delay=0;delay<9999;delay++);
			
			tmpBalance = tmpBalance - withdrawMoney;
			if(tmpBalance<0) {
				System.out.println(".........................................");
				System.out.println("    帳戶餘額不足 	");
				System.out.println(".........................................");
			}else {
				balance = tmpBalance;
			}
			
			System.out.println("列印交易單 : \n欲提款金額 : "+withdrawMoney+" 元, "+"帳戶餘額"+account.checkAccount());
			System.out.println(tName +" 完成提款... ");
			System.out.println("----------------------------------------------------");
	}
	public double checkAccount(){
		return balance;
	}
}

public class MagicMachine {

	public static void main(String[] args) {
		Account ac = new Account(10000);
		System.out.println("帳戶原始金額 : "+ ac.checkAccount()+"元");
		withDraw s1 = new withDraw (ac, 5000);
		withDraw s2 = new withDraw(ac, 2000);
		withDraw s3 = new withDraw(ac, 4000);
		Thread t1 = new Thread(s1, "T1");
		Thread t2 = new Thread(s2, "T2");
		Thread t3 = new Thread(s3, "T3");
		t1.start();
		t2.start();
		t3.start();
	}

}
