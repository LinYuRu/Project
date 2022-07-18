package myabstract;

abstract class Company {
	public abstract void calFuel();

	public abstract void calDistance();

	public static void processAction(Company corp) {
		corp.calFuel();
		corp.calDistance();
	}
}

class Truck extends Company {

	@Override
	public void calFuel() {
		System.out.println("Truck calculate Fuel.");

	}

	@Override
	public void calDistance() {
		System.out.println("Truck calculate Distance.");

	}
}
class Ship extends Company{

	@Override
	public void calFuel() {
		System.out.println("Ship calculate Fuel.");
		
	}

	@Override
	public void calDistance() {
		System.out.println("Ship calculate Distance.");
		
	}}

public class CallTestAbstractClassEx1 {

	public static void main(String[] args) {
//		Truck Toyota = new Truck();
//		Toyota.calFuel();
//		Toyota.calDistance();
//		
//		Ship Titanic = new Ship();
//		Titanic.calFuel();
//		Titanic.calDistance();
		
		Company.processAction(new Truck());
		Company.processAction(new Ship());

	}

}
