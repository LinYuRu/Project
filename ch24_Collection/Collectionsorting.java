package ch24_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collectionsorting {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("8");
		list.add("3");
		list.add("6");
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

	}

}
