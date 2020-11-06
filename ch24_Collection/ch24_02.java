package ch24_Collection;

public class ch24_02 {
	public static<E> void outputArray(E[] elements) {
		for (E element: elements)
			System.out.println(element);
	}

	public static void main(String[] args) {
		Integer[] intarray = {5, 10, 30, 50, 20};
		Character[] chararray = {'J', 'A', 'V', 'A'};
		
		System.out.println("Integer Array");
		outputArray(intarray);
		System.out.println("char Array");
		outputArray(chararray);
 
	}

}
