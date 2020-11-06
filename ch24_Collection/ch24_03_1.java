package ch24_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ch24_03_1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(1, 2);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(2));
		list.set(1, 10);
		System.out.println(list);
		list.add(1, 2);
		System.out.println(list);
		System.out.println(list.indexOf(2));
		for(int lists:list)
			System.out.println(lists);
//		Iterator<Integer> it = list.iterator();
//		while (it.hasNext())
//			System.out.println(it.next());

	}

}
