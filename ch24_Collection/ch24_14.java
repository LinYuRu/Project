package ch24_Collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class ch24_14 {

	public static void main(String[] args) {
//		HashSet<String> set = new HashSet<String>();
//		set.add("Taipei");
//		set.add("Japan");
//		set.add("Korea");
//		set.add("HongKong");
//		System.out.println("HashSet內容 : " + set);
//		System.out.println("HashSet元素個數 : " + set.size());
//		System.out.println("HashSet是空的 : "+ set.isEmpty());
//		System.out.println("HashSet包含香港 : " + set.contains("Taipei"));
//		set.remove("HongKong");
//		System.out.println("刪除香港後");
//		System.out.println("HashSet包含香港 : " + set.contains("HongKong"));
//		System.out.println("HashSet內容 : " + set);
//		set.clear();
//		System.out.println("刪除所有元素後");
//		System.out.println("HashSet是空的 : " + set.isEmpty());
//		System.out.println("HashSet內容 : " + set);


		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(4);
		set.add(4);
		set.add(1);
		set.add(3);
		System.out.println(set);
		
//		int[] num = {1, 4, 1, 3, 4, 1};
//		Arrays.sort(num);
//		for (int i = 0; i < num.length ; i++)
//			System.out.println(num[i]);
	}

}
