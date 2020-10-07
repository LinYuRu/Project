package ch21;
//class Demo {
//	public synchronized void printDemo(int n) {
//		for(int i = 1; i<= 5 ; i++) {
//			System.out.println("輸出 : " + (i * n) );
//			try {
//				Thread.sleep(500);
//			}catch(Exception e){
//				System.out.println(e);
//			}
//		}
//	}
//}
public class ch21_15 {

	public static void main(String[] args) {
		Demo obj = new Demo();
		Thread t1 = new Thread() {
			public void run() {
				obj.printDemo(10);
				}
		};
		Thread t2 = new Thread() {
		public void run() {
			obj.printDemo(100);
		}
	};

	t1.start();
	t2.start();
}
}