package ClassObjectField;

class Vehicle{
	String brand = "iii";
	int price = 20000;
}

public class CallTestEqual {

	public static void main(String[] args) {
		Vehicle BMW = new Vehicle();
		Vehicle WV = new Vehicle();
		
		
		System.out.println("BMW==WV"+(BMW==WV));	
		System.out.println("BMW.equals(WV) : "+(BMW.equals(WV)));
		
		if( BMW.equals(WV)) {
			System.out.println("Cashman");
		}else {
			System.out.println("Hard Work");
		}
		
		BMW = WV;
		
			System.out.println("BMW==WV"+(BMW==WV));	
			System.out.println("BMW.equals(WV) : "+(BMW.equals(WV)));
		

	}

}
