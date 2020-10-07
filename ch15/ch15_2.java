package ch15;

public class ch15_2 {

	public static void main(String[] args) {
		String msg1 = "Rock Stone";
		int hd1 = msg1.hashCode();
		System.out.println("String類別Rock Stone的 HashCode: " + hd1);
		StringBuilder msg2 = new StringBuilder(msg1);
		int hd2 = msg2.hashCode();
		System.out.println("Object類別Rock Stone的 HashCode: " + hd2);
		String msg3 = "明智科大";
		int hd3 = msg3.hashCode();
		System.out.println("String類別明智科大的 HashCode: " + hd3);
		StringBuilder msg4 =  new StringBuilder(msg3);
		int hd4 = msg4.hashCode();
		System.out.println("Object類別明智科大的 HashCode:  " + hd4);

	}

}
