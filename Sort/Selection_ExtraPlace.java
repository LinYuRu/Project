package Sort;

import java.util.ArrayList;
import java.util.List;

public class Selection_ExtraPlace {
	public static void main(String[] args) {
		int[] num = new int[] { 7, 2, 5, 1, 6, 4, 3 };
		Sort(num);
		for (int nu : num) {
			System.out.print(nu + " ");
		}
	}

	// 物件導向寫法(額外空間版本)
	public static void Sort(int[] array) {
		List<Integer> sorted = new ArrayList<Integer>(array.length);
		List<Integer> unsorted = new ArrayList<Integer>(array.length);
		for (int n : array) {
			unsorted.add(n);
		}
		while (unsorted.size() > 0) {
			Integer n = ExtractMin(unsorted);
			sorted.add(n);
		}
		for (int i = 0; i < array.length; ++i) {
			array[i] = sorted.get(i);
		}
	}

	private static Integer ExtractMin(List<Integer> unsorted) {
		int index = 0, min = unsorted.get(0);
		for (int i = 0; i < unsorted.size(); ++i) {
			if (unsorted.get(i) < min) {
				index = i;
				min = unsorted.get(i);
			}
		}
		unsorted.remove(index);
		return min;
	}

}
