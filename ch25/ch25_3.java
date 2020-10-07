package ch25;
//interface Shapes{
//	public void draw();
//}
public class ch25_3 {

	public static void main(String[] args) {
		int r= 5;
		Shapes obj = new Shapes() {
			public void draw() {
				System.out.println("半徑是" + r + "的圓");
			}
		};
		obj.draw();
//		int r = 5;
//		Shapes obj = new Shapes() {
//			public void draw() {
//				System.out.println("半徑是" + r + "的圓");
//			}
//		};
//		obj.draw();

	}

}
