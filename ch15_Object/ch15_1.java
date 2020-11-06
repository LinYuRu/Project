package ch15_Object;

public class ch15_1 {

	public static void main(String[] args) {
		String msg1 = "Rock Stone";
		int hd1 = msg1.hashCode();
		System.out.println("hd1's HashCode: " + hd1);
		String msg2 = msg1;
		int hd2 = msg2.hashCode();
		System.out.println("hd2's HashCode: " + hd2);
		String msg3 = "明智科大";
		int hd3 = msg3.hashCode();
		System.out.println("hd3's HashCode: " + hd3);
		String msg4 = new String("明智科大");
		int hd4 = msg4.hashCode();
		System.out.println("hd4's HashCode: " + hd4);

	}

}
