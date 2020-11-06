package ch25_Lambda;

import java.util.ArrayList;

public class ch25_9 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Tainan");
		list.add("Daan");
		list.add("Taipei");
		list.forEach(a->System.out.println(a));
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("Taipei");
//		list.add("Tainan");
//		list.add("Daan");
//		list.forEach(a->System.out.println(a));
//		list.forEach(info->System.out.println(info));

	}

}
