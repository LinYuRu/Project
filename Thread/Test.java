package Thread;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello World");
		String tName = Thread.currentThread().getName();
		int count = Thread.activeCount();
		System.out.println("Thread Name: "+ tName);
		System.out.println("Thread number: "+count);

	}

}
