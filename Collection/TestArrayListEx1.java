package Collection;

import java.util.ArrayList;

public class TestArrayListEx1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList list1 = new ArrayList();
		
		list1.add("Mary");
		list1.add("Man");
		list1.add("Man");
		list1.add(6);
		list1.add(3.14);
		list1.add(new Integer(7));
		
		System.out.println("List1: "+list1);
		
		int size = list1.size();
		System.out.println("Size: "+size);
		
		list1.add(2, "Larry");
		int size1 = list1.size();
		System.out.println("List1: "+list1);
		System.out.println("Size1: "+size1);
		
		

	}

}
