package ch7_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add("test");
		
		String s[]=new String[2];
		 List list3 = Arrays.asList(s);
		 List list4 = new ArrayList<>(list3);
		 list4.add("test");
		 s[0] = "test2";
		 System.out.println(list3.get(0));//test2
		 System.out.println(list3.get(1));//null
		 System.out.println(list3.size());//2
		 System.out.println(list4.size());//3
		 //list3.add(“test”);//丟擲異常
		 list4.add("test");//沒有丟擲異常
		 System.out.println(list4.get(2));//test
		 System.out.println(list4.get(3));//test
		 System.out.println(list4.get(0));//null
		 System.out.println(list4.get(1));//null
		 
		 List list5 = new ArrayList<>(list3);
		 System.out.println(list5.size());//2
		 System.out.println(list5.get(0));//test2
		 System.out.println(list5.get(1));//null
		
//		String[] array = new String[2];
//		List list2 = Arrays.asList(array);
//		
//		List list3 = new ArrayList(list2);
//		list3.add("test");
//		
//		array[0] = "test2";
//		System.out.println(list2.get(0));
//		list2.add("test");
	}

}
