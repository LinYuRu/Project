package ch17_Interface;

interface Animal {
	void who();
	default void running() {
		System.out.println("Animal run");
	}
}
interface Dog extends Animal {
	default void running() {
		System.out.println("Dog run");
	}
}

class Pet implements Dog {

	@Override
	public void who() {
		System.out.println("I'm Animal.");
		
	}
	
}
public class ch17_19 {

	public static void main(String[] args) {
		Pet obj = new Pet();
		obj.running();
		obj.who();

	}

}
