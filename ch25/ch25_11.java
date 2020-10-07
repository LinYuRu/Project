package ch25;

import java.util.ArrayList;

public class ch25_11 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Daan");
		list.add("Donmeng");
		list.add("Ximen");
		System.out.println(list);
		list.forEach(System.out::println);
		list.forEach(info->System.out.println(info));
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("Taipei");
//		list.add("Tainan");
//		list.add("Daan");
//		list.forEach(System.out::println);
//		list.forEach(info->System.out.println(info));

	}

}
