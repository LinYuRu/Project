package Collection;

import java.util.HashSet;

public class TestHashSetEx1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet s1 = new HashSet();
		
		s1.add("Alex");
		s1.add("Joe");
		s1.add("Jeter");
		s1.add("Joe");
		s1.add(6);
		s1.add(new Integer(6));
		s1.add(2.5);
		
		System.out.println("set1:"+s1);
		

	}

}
