package ch24;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ch24_16 {

	public static void main(String[] args) {
		LinkedHashSet<String> set  = new LinkedHashSet<String>();
		set.add("Taipei");
		set.add("Tokyo");
		set.add("Boston");
		set.add("Taipei");
		set.add("Kaohsiung");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}

}
