package Sort;

import java.util.Arrays;
import java.util.Collections;



public class ArraySort {

	public static void main(String[] args) {
		String[] test1012 = {"星期一", "放連假", "下午茶", "千層蛋糕"};  
		String[] cutLisa = {"王小明","陳小三","王小李"};
		int[] cutnumber = {5,1,9};
		String[] cutenglish = {"A","Z","E"};
		Integer [] test = {4,2,6,1,5,3};
		
		//ex. Integer.sort
		System.out.println("Interger排序前: " + Arrays.toString(test));
		Arrays.sort(test);
		System.out.println("排序後:" + Arrays.toString(test));
		
//		for(int num:test) {
//			System.out.println(num);
//		}
		
		//ex.1
//		System.out.println("原本陣列: " + test1012);
//		for(String s:test1012) {
//			System.out.println(s);
//		}
//		Arrays.sort(test1012);
//		System.out.println("排序後陣列: ");
//		for(String s:test1012) {
//			System.out.println(s);
//		}
		
		//ex.2
//		System.out.println("原本的陣列: " + Arrays.toString(test));
//		Arrays.sort(cutenglish);
//		System.out.println("Array排序: 小到大");
//		for(String num: cutenglish) {
//			System.out.println(num);
//		}
//		Arrays.sort(cutLisa);
//		for(String num: cutLisa) {
//			System.out.println(num);
//		}
//		Arrays.sort(test);
//		for(int num: test) {
//			System.out.println(num);
//		}
//		System.out.println("Array排序: 大到小");
//		Arrays.parallelSort(cutLisa, Collections.reverseOrder());
//		for(String s: cutLisa) {
//			System.out.print(s + " ");
//		}
//		
//		
//		System.out.println();
//		Arrays.sort(cutenglish, Collections.reverseOrder());
//		for(String s: cutenglish) {
//			System.out.print(s + " ");
//		}
//		System.out.println();
//		Arrays.sort(test, Collections.reverseOrder());
//		for(int num:test) {
//			System.out.print(num + " ");
//		}
//
	}

}
