package ClassObjectField;

class vehicle{
	String brand="iii";
	int price=2000;
}
public class CallTestEqualsEx1 {

	public static void main(String[] args) {
		vehicle v1= new vehicle();
		vehicle v2= new vehicle();
		
		System.out.println("v1==v2"+(v1==v2));
		System.out.println("v1.equals(v2)"+(v1.equals(v2)));
		
		v1=v2;
		System.out.println("v1==v2"+(v1==v2));
		System.out.println("v1.equals(v2)"+(v1.equals(v2)));
	}

}
