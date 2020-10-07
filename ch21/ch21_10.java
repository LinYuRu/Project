package ch21;
class XPriority extends Thread {						// 繼承Thread類別
	XPriority (String name){
		super(name);
	}
	public void run() {
		for(int i = 0 ; i<=5;i++) {
			System.out.println(getName() + " is running : " + i);
		}
	}
}
public class ch21_10 {

	public static void main(String args[]){
		XPriority horse = new XPriority("horse");
		XPriority turtle = new XPriority("turtle");
		XPriority rabbit = new XPriority("rabbit");
		System.out.println(horse.getName() + "優先順序值 : " + horse.getPriority());
		System.out.println(turtle.getName() + "優先順序值 : " +turtle.getPriority());
		System.out.println( rabbit.getName()+ "優先順序值 : " + rabbit.getPriority());
		horse.setPriority(Thread.MAX_PRIORITY);
		turtle.setPriority(Thread.MIN_PRIORITY);
		rabbit.setPriority(Thread.NORM_PRIORITY);
		System.out.println(horse.getName() + "優先順序值 : " + horse.getPriority());
		System.out.println(turtle.getName() + "優先順序值 : " +turtle.getPriority());
		System.out.println( rabbit.getName()+ "優先順序值 : " + rabbit.getPriority());
		horse.start();
		turtle.start();
		rabbit.start();
	}

}
