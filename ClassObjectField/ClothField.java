package ClassObjectField;
class clothes{
	String color;
	char size;
	}
public class ClothField {

	public static void main(String[] args) {
		clothes FM = new clothes();
		clothes JayJay = new clothes();
		
		FM.color = "red" ;
		FM.size = 'S';
		JayJay.color = "green";
		JayJay.size = 'M';
		
		System.out.printf("FM (%s, %c)%n", FM.color, FM.size);
System.out.printf("JayJay (%s, %c)%n", JayJay.color, JayJay.size);
	}

}
