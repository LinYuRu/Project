package ClassObjectField;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("a");
		arraylist.add("b");
		arraylist.add("c");
		arraylist.add("d");
		arraylist.add("e");

		System.out.println("String:" + arraylist);

		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i) + "1");
		}

	}

}
