package ch24_Collection;

import java.util.ArrayList;

public class ch24_03 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Japan");
		list.add("Taipei");
		list.add("Tainan");
		System.out.println("List Element num : " + list.size());
		System.out.println("List Element : " + list);
		list.add(3, "LA");
		System.out.println("List key(1) : " + list.get(1));
		System.out.println("One More list");
		System.out.println("List Element num : " + list.size());
		System.out.println("List Element : " + list);

	}

}
