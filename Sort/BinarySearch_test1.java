package Sort;

import java.util.Arrays;

class Iterative {
	static public int Search(int[] array, int num) {
		int left = 0, right = array.length - 1;
		while (left <= right) {
			int middle = (right + left) / 2;

			if (array[middle] == num) {
				return middle;
			}

			if (array[middle] > num) {
				right = middle - 1;				
			}
			else {
				left = middle + 1;				
			}
		}
		return -1;
	}
}

class DivideAndConquer {
	static public int Search(int[] array, int num) {
		return Search(array, num, 0, array.length - 1);
	}

	static public int Search(int[] array, int num, int left, int right) {
		int count = 0;
		if (left > right) {
			return -1;
		}

		int middle = (right + left) / 2;

		if (array[middle] == num) {
			return middle;
		}
			

		if (array[middle] > num) {
			return Search(array, num, left, middle - 1);
		}			

		return Search(array, num, middle + 1, right);
	}
}

public class BinarySearch_test1 {

	public static void main(String[] args) {
		int[] array = new int[] {7,2,8,3,6,1,5,4,9};
		Arrays.sort(array);
		System.out.println("排序後");
		for(int num: array) {
			System.out.print(" " + num);
		}
		System.out.println();
		System.out.println("開始Binary search");
//		System.out.println(Arrays.binarySearch(array, 9));
		System.out.println("結果: "+binarySerchForSortedArray(array, 1,7,4));

	}

	private static int binarySerchForSortedArray(int[] a, int fromIndex, int toIndex,
            int key) {
		int count = 0;
		int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
        	count++;
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key) {
                high = mid - 1;
            	
            }
            else {
        	    System.out.println("排序次數: " + count);
                return mid; // key found            	
            }
        }

	    System.out.println("排序次數: " + count);
        return -(low + 1);  // key not found.
	}
}
