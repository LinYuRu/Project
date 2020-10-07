package ClassObjectField;

class product {
	private int level = 5;
	public int price = 3000;

	public void showdetail() {
		System.out.println("level =" + level);
		System.out.println("price =" + price);
	}

	public void action(){
		showdetail();
	}
}

public class CallTestEncapsualtionEx1 {

	public static void main(String[] args) {
		product pi = new product();
		pi.price=3000;
		pi.action();
		System.out.println("pi.action");

	}

}
