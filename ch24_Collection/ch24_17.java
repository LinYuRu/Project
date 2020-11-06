package ch24_Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class ch24_17 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(8);
		set.add(4);
		set.add(9);
		set.add(0);
		set.add(7);
		set.add(0);
		set.add(1);
		System.out.println(set);
		System.out.println("First : " + set.first());
		System.out.println("Last : " + set.last());
		System.out.println(set);
	
		
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext())
			System.out.println("TreeSet個別列印 : " + itr.next());

	}

}
