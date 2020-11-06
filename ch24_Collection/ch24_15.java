package ch24_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class ch24_15 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Taipei");
		set.add("Tokyo");
		set.add("Boston");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
