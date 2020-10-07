package ClassObjectField;
class Car{
	String setBrand = "BMW", "Porsch";
}
public class TestEqualsEx3 {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setBrand("BMW");
		myCar.setPrice(1500000);
		myCar.showInfo();
		
		System.out.println("------------------------------------");
		
		Car yourCar = new Car();
		yourCar.setBrand("Porsch");
		yourCar.setPrice(1600000);
		yourCar.showInfo();
		
		System.out.println("------------------------------------");
		
		
		System.out.println("(myCar==yourCar)_1"+(myCar==yourCar));
		System.out.println("(myCarequalsyourCar)_1"+(myCar.equals(yourCar)));
		
	}

}
