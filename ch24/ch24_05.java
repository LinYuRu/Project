package ch24;

import java.util.ArrayList;

public class ch24_05 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Taipei");
		list1.add("Daan");
		list1.add("101");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("101");
		list2.add("Daan");
		list2.add("Taichung");
		list1.retainAll(list2);
		System.out.println("List1 : " + list1);

	}

}
