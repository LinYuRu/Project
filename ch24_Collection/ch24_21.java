package ch24_Collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ch24_21 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1001, "Taipei");
		map.put(1002, "Tokyo");
		map.put(1003, "Chicago");
		map.put(1004,  "Singapor");
		map.put(1004,  "Singapor");
		map.put(1003, "Chicago");
		
		System.out.println("First key : " + map.firstKey());
		System.out.println("First Entity : " + map.firstEntry());
		System.out.println("Last value : " + map.lastKey());
		System.out.println("Last value : " + map.lastEntry());
//		System.out.println("Last pollLastEntry : " + map.pollLastEntry());
		System.out.println("Last Entity : " + map.lastEntry());
		System.out.println("搜尋字典");
		for (Map.Entry m:map.entrySet())
			System.out.printf("%12s : %s\n", m.getKey(), m.getValue());
		System.out.println("取得子TreeMap");
		System.out.println("KeyValue between 1003-1006 : " + map.subMap(1001, 1004));
		System.out.println("取得子TreeMap");
		System.out.println("Value > 1003 : " + map.tailMap(1002));

	}

}
