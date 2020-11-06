package ch25_Lambda;
@FunctionalInterface
interface Shapes{
	public void draw();
}
public class ch25_4 {

	public static void main(String[] args) {
		int r = 5;
		Shapes obj = ()->{
			System.out.println("半徑是" + r + "的圓");
		};
		obj.draw();
//		Shapes obj = ()->{
//			System.out.println("半徑是" + r + "的圓");
//		};
//		obj.draw();

	}

}
