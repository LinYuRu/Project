package ch24_Collection;

import java.util.LinkedList;

public class ch24_10 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for ( int i = 10; i <=50 ; i+=10)
			list.add(i);
		System.out.println("Before deleted : " + list);
		System.out.println("Deleted first : " +list.removeFirst());
		System.out.println("Deleted last : " + list.removeLast());
		System.out.println("After deleted List : " + list);

	}

}
