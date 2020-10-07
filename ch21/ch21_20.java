package ch21;

import java.util.Random;

class Factory {
	private int product;
	private boolean empty;
	Factory(){
		this.empty = true;
		}
	public synchronized void produce(int newProduct) {
		while (!this.empty) {
			try {
				wait();
			}catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		product = newProduct;
		System.out.println("生產 : " + newProduct);
		empty = false;
		notify();
		try {
			Thread.sleep(500);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public synchronized void consume() {
		while(empty) {
			try {
				wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty = true;
		System.out.println("消費 : " + product);
		notify();
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

class Consumer extends Thread {
	private Factory factory;
	public Consumer(Factory factory) {
		this.factory = factory;
	}
	public void run() {
		int data;
		while(true) {
			factory.consume();
		}
	}
}
class Producer extends Thread{
	private Factory factory;
	public Producer(Factory factory) {
		this.factory = factory;
	}
	public void run() {
		Random rand = new Random();
		while(true) {
			int n = rand.nextInt(1000);
			factory.produce(n);
		}
	}
}
public class ch21_20 {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Producer p = new Producer(factory);
		Consumer c = new Consumer(factory);
		System.out.println("同時按Ctrl+C可中斷程式");
		p.start();
		c.start();

	}

}
