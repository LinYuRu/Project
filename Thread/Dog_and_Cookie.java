package Thread;

class Cookies {
	private int cookiesNo;
	private boolean empty = true;

	public synchronized void put(int cNo) {
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}}

			System.out.println("主人放了第" + cNo + "塊餅乾");
			cookiesNo = cNo;
			empty = false;
			notify();
		}
	

	public synchronized void eat(int cNo) {
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("小白狗吃了第" + cNo + "塊餅乾");
		empty=true;
		notify();
	}
}

class Eat implements Runnable {
	Cookies cookies;

	Eat(Cookies cookies) {
		this.cookies = cookies;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			cookies.eat(i);
		}
	}
}

class Put implements Runnable {
	Cookies cookies;

	Put(Cookies cookies) {
		this.cookies = cookies;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			cookies.put(i);
		}
	}
}

public class Dog_and_Cookie {

	public static void main(String[] args) {
		Cookies cookies = new Cookies();
		Put put = new Put(cookies);
		Eat eat = new Eat(cookies);
		Thread dog = new Thread(eat);
		Thread master = new Thread(put);
		dog.start();
		master.start();
	}

}