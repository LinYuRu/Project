package ch24_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ch24_2 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList<String>();
		list1.add("Taipei");
		list1.add("Tainan");
		list1.add("Chiayi");
		ArrayList list2 = new ArrayList<String>();
		list2.add("Taipei");
		list2.add("Tainan");
		list2.add("KOA");
		list1.addAll(list2);
		System.out.println("List1 : "+list1);
		Iterator x = list1.iterator();
		
		while( x.hasNext()) {
			System.out.println("x: "+x.next());
			String ht = (String) x.next();
			System.out.println("ht: " + ht);
		}
		ArrayList list3 = new ArrayList<String>();
		list3.add("Taipei");
		list3.add("Bosen");
		list3.add("Dong");
		list1.addAll(list3);
		System.out.println(list1);

	}

}
