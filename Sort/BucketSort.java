package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class BucketSort {

	

	public static void bucketSort(int[] arr) {
	    int min = arr[0];
	    int max = arr[0];
	    // 獲取資料範圍
	    for (int i = 1; i < arr.length; i++) {
	      if (arr[i] > max) {
	        max = arr[i];
	      }
	      if (arr[i] < min) {
	        min = arr[i];
	      }
	    }
	    // 確定桶數
	    int count = (min + max) / arr.length + 1;
	    ArrayList<ArrayList<Integer>> bucket = new ArrayList<>(count);
	    for (int i = 0; i < count; i++) {
	      bucket.add(new ArrayList<>());
	    }
	    // 將元素放入桶
	    for (int i = 0; i < arr.length; i++) {
	      int num = (arr[i] - min) / arr.length;
	      bucket.get(num).add(arr[i]);
	    }
	    // 將桶中資料進行排序(排序已經完成)
	    for (ArrayList<Integer> arrayList : bucket) {
	      Collections.sort(arrayList);
	    }
	    // 將桶中資料匯入待排序的陣列中（只是為了顯示方便）
	    int k = 0;
	    for (int i = 0; i < bucket.size(); i++) {
	      for (int j = 0; j < bucket.get(i).size(); j++) {
	        arr[k++] = bucket.get(i).get(j);
	      }
	    }
	  }
	/**
	   * 計數排序
	   *
	   * @param arr 待排陣列
	   */
	  public static void countingSort(int[] arr) {
	    int min = arr[0];
	    int max = arr[0];
	    // 獲取資料範圍
	    for (int i = 1; i < arr.length; i++) {
	      if (arr[i] > max) {
	        max = arr[i];
	      }
	      if (arr[i] < min) {
	        min = arr[i];
	      }
	    }
	    // 建立計數陣列count，用來記錄資料出現的次數
	    int[] count = new int[max - min + 1];
	    for (int i = 0; i < arr.length; i++) {
	      count[arr[i] - min]++;
	    }
	    // 將計數陣列中的資料灌入待排序陣列
	    int k = 0;
	    for (int i = 0; i < count.length; i++) {
	      if (count[i] != 0) {
	        for (int j = 0; j < count[i]; j++) {
	          arr[k++] = i + min;
	        }
	      }
	    }
	  }
	  /**
	   * 基數排序
	   *
	   * @param arr 待排陣列
	   * @param len 待排位數
	   */
	  public static void radixSort(int[] arr, int len) {
	    // 除數，從8位0開始，先比較高位
	    int divisor = (int) Math.pow(10, len);
	    // 確定桶數，桶的數量可設為10，因為位數的取值為0-9,並初始化桶
	    ArrayList<ArrayList<Integer>> bucket = new ArrayList<>(10);
	    for (int i = 0; i < 10; i++) {
	      bucket.add(new ArrayList<>());
	    }
	    for (int i = 0; i < arr.length; i++) {
	      // 只取個位
	      int c = (arr[i] / divisor) % 10;
	      bucket.get(c).add(arr[i]);
	    }
	    // 將桶中資料進行排序(排序已經完成)
	    for (ArrayList<Integer> arrayList : bucket) {
	      Collections.sort(arrayList);
	    }
	    // 將桶中資料匯入待排序的陣列中
	    int k = 0;
	    for (int i = 0; i < bucket.size(); i++) {
	      for (int j = 0; j < bucket.get(i).size(); j++) {
	        arr[k++] = bucket.get(i).get(j);
	      }
	    }
	  }
	  /**
	   * 生成一個長度5-10的隨機陣列
	   *
	   * @return 隨機陣列
	   */
	  private static int[] initArray() {
	    int len = 5 + new Random().nextInt(6);
	    int[] arr = new int[len];
	    for (int i = 0; i < arr.length; i++) {
	      arr[i] = new Random().nextInt(100);
	    }
	    return arr;
	  }

	  /**
	   * 為基數排序法準備的8位隨機訂單，50組資料
	   *
	   * @return 隨機訂單陣列
	   */
	  private static int[] initArrayForRadixSort() {
	    String str = "";
	    int[] arr = new int[10];
	    Random random = new Random();
	    for (int i = 0; i < arr.length; i++) {
	      // 保證訂單首位數不為0，所以隨機0-9生成後7位，隨機1-9生成第一位
	      for (int j = 0; j < 7; j++) {
	        str += random.nextInt(10);
	      }
	      str = 1 + random.nextInt(9) + str;
	      arr[i] = Integer.valueOf(str);
	      str = "";
	    }
	    return arr;
	  }
	  
	  public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			 // 基數排序
		    int[] arr = initArrayForRadixSort();
		    System.out.println("排序之前的陣列是：" + Arrays.toString(arr));
		    int count = (arr[0] + "").length() - 1;
		    for (int i = count; i < arr.length; i++) {
		    	countingSort(arr);
		    }
		    System.out.println("排序之後的陣列是：");
		    for(int num: arr) {
		    	System.out.println(num);
		    }
		    System.out.println();

		    // 非基數排序
		    int[] arr2 = initArray();
		    System.out.println("排序之前的陣列是：" + Arrays.toString(arr2));
		    bucketSort(arr2);
		    System.out.println("排序之後的陣列是：" + Arrays.toString(arr2));
		  

		}
}
