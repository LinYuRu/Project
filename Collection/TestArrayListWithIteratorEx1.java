package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestArrayListWithIteratorEx1 {

	public static void main(String[] args) {
		 ArrayList<String> fruit = 	new ArrayList<String>();
		 
		 fruit.add("Apple");
		 fruit.add("Banana");
		 fruit.add("Pineapple");
		 fruit.add("Kiwi");
		 fruit.add("Watermelen");
		 fruit.add("cherry");
		 
		 System.out.println("Fruit:"+fruit);
		 
		 for (int i = 0; i<6;i++) {
			 System.out.println(fruit.get(i));
		 }
		 
		 ListIterator<String> i1 = fruit.listIterator(2);
		 while(i1.hasPrevious()) {
			 System.out.println("Fruit:"+i1.previous());
		 }

	}

}
