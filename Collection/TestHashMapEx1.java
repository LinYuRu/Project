package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestHashMapEx1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	HashMap map1 =	new HashMap ();
	
	map1.put("1st","Sosa");
	map1.put("2nd","Manny");
	map1.put("3nd","Alex");
	map1.put("3nd","JV");
	
	Set key =map1.keySet();
	Collection value = map1.values();
	Set mapping = map1.entrySet();
	
	System.out.println("Key:"+key);
	System.out.println("Values:"+value);
	System.out.println("Mapping:"+mapping);
	
	String first = (String)map1.get("1st");
	System.out.println("first:"+map1.get("1st"));
	
	System.out.println("Second:"+map1.get("3nd"));

	}

}
