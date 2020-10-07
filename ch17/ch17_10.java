package ch17;

//interface Bird {
//	void birdFly();
//}
//
//interface Airplane {
//	void airplaneFly();
//}
//class Fly implements Bird, Airplane{
//	public void birdFly() {
//		System.out.println("Bird Fly");
//	}
//
//	@Override
//	public void airplaneFly() {
//		System.out.println("aircraft fly with engine");
//		
//	}
//}

public class ch17_10 {

	public static void main(String[] args) {
		Fly obj = new Fly();
		obj.birdFly();
		obj.airplaneFly();
	}

}
