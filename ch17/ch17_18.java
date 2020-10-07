package ch17;

//interface Dog {
//	void who();
//	default void running() {
//		System.out.println("Dogs run");
//	}
//}

interface Cat {
	void who();
	default void running() {
		System.out.println("Cats run");
	}
}

class Horse {
	public void running() {
		System.out.println("Horses run");
	}
}

//class Pet extends Horse implements Cat, Dog {
//	public void who() {
//		System.out.println("I'm a pet.");
//		Cat.super.running();
//		Dog.super.running();
//	}
//}

public class ch17_18 {

	public static void main(String[] args) {
		Pet obj = new Pet();
		obj.running();
		obj.who();

	}

}
