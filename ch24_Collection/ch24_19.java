package ch24_Collection;

import java.util.HashMap;
import java.util.Map;

public class ch24_19 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Taiwan", "Taipei");
		map.put("Japan", "Osaka");
		map.put("Korea", "Soel");
		
		String str = "Taiwan";
		System.out.println("Key = Taiwan : " + map.get(str));
		for(Map.Entry m:map.entrySet())
			System.out.printf("%12s : %s\n", m.getKey(), m.getValue());

	}

}
