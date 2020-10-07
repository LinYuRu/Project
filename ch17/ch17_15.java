package ch17;
//interface Dog {
//int age = 5;
//default void running() {
//	System.out.println("Dog runs");
//};
//}
//interface Cat {
//int age = 6;
//default void running() {
//	System.out.println("Cat jumps");
//};
//}
//class Pet implements Dog, Cat {
//	public void running() {
//		System.out.println("Animal runs");
//		Dog.super.running();
//		Cat.super.running();
//	}
//}
public class ch17_15 {

	public static void main(String[] args) {
		Pet obj = new Pet();
		obj.running();

	}

}
