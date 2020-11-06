package ch24_Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ch24_18 {

	public static void main(String[] args) {
		HashMap<Integer, String> hp = new HashMap<Integer, String>();
		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		hp.put(1001, "Daan");
		hp.put(1002, "Dongmen");
		hp.put(1003, "Station");
//		mp = (HashMap)hp.clone();
		mp.putAll(hp);
		System.out.println("mp: "+mp);
		System.out.println("Key1001's value: " + mp.get(1001));
		System.out.println("Key1002's value: " + mp.get(1002));
		
		Set st = mp.keySet();
		System.out.println("st: "+st);
		Iterator it = st.iterator();
		while(it.hasNext())
			System.out.println("ketSet: "+it.next());
		
		Set kt = hp.entrySet();
		System.out.println("kt: "+kt);
		Iterator ht = kt.iterator();
		while(ht.hasNext())
			System.out.println("ht: "+ht.next());
//		System.out.println("HashMap內容: " + hp);
//		System.out.println("HashMap元素個數: " + hp.size());
//		System.out.println("HashMap是否為空: " + hp.isEmpty());
//		System.out.println("HashMap內容包含Key1001: " + hp.containsKey(1001));
//		System.out.println("HashMap內容包含valueDaan: " + hp.containsValue("Daan"));
//		System.out.println("HashMap內容刪除Key1003: " + hp.remove(1003));
//		hp.remove(1003);
//		System.out.println("HashMap內容: " + hp);
//		System.out.println("HashMap內容包含Key1003: " + hp.containsKey(1003));
//		mp = (HashMap<Integer, String>) hp.clone();
//		mp.putAll(hp);
//		System.out.println(mp);
//		System.out.println(hp);
//		Set<Integer> ht = new HashSet<Integer>();
//		ht =  mp.keySet();
//		Iterator<Integer> itr = ht.iterator();
//		while(itr.hasNext())
//			System.out.println("Ht內容: " + itr.next());
//		
//		Set st = mp.entrySet();
//		Iterator it = st.iterator();
//		while(it.hasNext())
//			System.out.println("it: " + it.next());
//		hp.clear();
//		System.out.println("刪除所有元素");
//		System.out.println("HashMap為空: " + hp.isEmpty());
//		System.out.println("HashMap內容: " + hp);

	}

}
