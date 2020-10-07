package ch17;

interface Bird {
	void birdFly();
}

interface Airplane {
	void airplaneFly();
}

interface Fly extends Bird, Airplane {
	void pediaFly();
}
class InfoFly implements Fly {

	@Override
	public void birdFly() {
		System.out.println("Birds Fly");
		
	}

	@Override
	public void airplaneFly() {
		System.out.println("Aircraft fly with engine");
		
	}

	@Override
	public void pediaFly() {
		System.out.println("manuBoook");
		
	}
	
}
public class ch17_11 {

	public static void main(String[] args) {
		InfoFly obj = new InfoFly();
		obj.birdFly();
		obj.airplaneFly();
		obj.pediaFly();

	}

}
