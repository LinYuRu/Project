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
		System.out.println(Arrays.binarySearch(array, 9));
		
		System.out.println("test");

	}

	private static int binarySerchForSortedArray(int[] sortedArray, int  target, int start, int end) {
	    if (start < 0 || end >= sortedArray.length) {
	        return -1;
	    }
	    while (start <= end) {
	        int mid = (start + end) / 2;
	        if (sortedArray[mid] == target) {
	            return mid;
	        } else if (target > sortedArray[mid]) {
	            start = mid + 1;
	        } else if (target < sortedArray[mid]) {
	            end = mid - 1;
	        }
	    }
	    return -1;
	}
}
