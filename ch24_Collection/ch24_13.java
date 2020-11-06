package ch24_Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ch24_13 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Tainan");
		list.add("Daan");
		list.add("Kaew");
		
		ListIterator<String> lit = list.listIterator();
		System.out.println("Go Forward");
		while(lit.hasNext())
			System.out.println(lit.next());
		System.out.println("Go Backword");
		while(lit.hasPrevious())
			System.out.println(lit.previous());
	}

}
