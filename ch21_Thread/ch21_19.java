package ch21_Thread;

class Bank {
	int balance = 10000;
	synchronized void withdraw(int amount) {
		System.out.println( "取款");
		while (balance < amount) {
			System.out.println("金額不足，無法取款，等待取款");
			try {
				wait();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		balance -= amount;
		System.out.println("取款完成");
	}
	synchronized void deposit(int amount) {
		System.out.println("存款");
		balance += amount;
		System.out.println("存款完成");
		notify();
	}
}

public class ch21_19 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Thread t1 = new Thread() {
			public void run() {
				bank.withdraw(15000);
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				bank.deposit(10000);
			}
		};
		t2.start();
		

	}

}
