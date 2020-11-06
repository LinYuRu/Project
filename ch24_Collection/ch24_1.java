package ch24_Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ch24_1 {
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		s.add("大安");
		s.add("中山");
		String n;
		ArrayList<String> r = new ArrayList<String>();//s放進r
		Iterator x = s.iterator();
		String f;
		HashMap j = new HashMap();
//		for (String z : s) {
		while (x.hasNext()) {
			f = (String)x.next();
//			System.out.println(z);
			r.add(f);
			j.put(Math.random(),f);
		}
		System.out.println(j);
		Iterator g = r.iterator();
		while(g.hasNext())
			System.out.println(g.next());
//		for(String y: s )
//			System.out.println(y);

//			String r = (String) it.next();
//			System.out.println(r);
//			System.out.println(it);

//			System.out.println(it.hasNext());

//		ArrayList<String> list = new ArrayList<String>();
//		list.add("Taipei");
//		list.add("Tainan");
//		list.add("Chiayi");
//		for(String obj : list) {
//			System.out.println(obj);
//		}
//		Iterator<String> itr = list.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
	}
}
