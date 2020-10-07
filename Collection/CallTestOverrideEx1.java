package Collection;

class Fish{
	public void swim() {
		System.out.println("fish can swim.");
	}
	
	public void eat() {
		System.out.println("fish can eat food.");
	}
}

class Shark extends Fish{
	
	@Override
	public void swim() {
		System.out.println("Shark can swim faster.");
	}

	@Override
    public void eat() {
		System.out.println("Shark eats meat.");
	}
}


public class CallTestOverrideEx1 {

	public static void main(String[] args) {
		Shark makoShark = new Shark();
		Fish fish = new Fish();
		fish.swim();
		fish.eat();
		makoShark.swim();
		makoShark.eat();
	}

}
