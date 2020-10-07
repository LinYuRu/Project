package ch17;

interface A {
	default void running() {
		System.out.println("I'm A.");
	}
}
interface B {
	default void running() {
		System.out.println("I'm B.");
	}
}
interface C extends A{
	default void running() {
		System.out.println("I'm C.");
	}
}
class D implements B, C{

	public void running() {
		System.out.println("I'm D.");
	}
	public void who() {
		B.super.running();
		C.super.running();
	}
	
}
public class ch17_20 {

	public static void main(String[] args) {
		D obj = new D();
		obj.running();
		obj.who();

	}

}
