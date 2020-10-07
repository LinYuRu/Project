package ch24;

import java.util.LinkedHashMap;
import java.util.Map;

public class ch24_20 {

	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("Taipei", "101");
		map.put("Japan", "Osaka");
		map.put("Australia", "Meilbourne");
		
		String str = "Taipei";
		System.out.println("Simple Search");
		System.out.println("Key = Taipei  : " + map.get(str));
		System.out.println("Print Map ");
		
		for (Map.Entry m:map.entrySet())
			System.out.printf("%12s : %s\n", m.getKey(), m.getValue());

	}

}
