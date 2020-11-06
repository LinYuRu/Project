package ch24_Collection;

import java.util.LinkedList;

public class ch24_08 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Taipei");
		list.add("Tainan");
		list.add("Daan");
		System.out.println("Original List : " + list);
		list.addFirst("NewYork");
		list.addLast("Osaka");
		System.out.println("New List : " + list);
		System.out.println("First Element : " + list.getFirst());
		System.out.println("Last Elements : " + list.getLast());
//		Original List : [Taipei, Tainan, Daan]
//		New List : [NewYork, Taipei, Tainan, Daan, Osaka]
//		First Element : NewYork
//		Last Elements : Osaka

	}

}
