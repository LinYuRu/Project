package Sort;

import java.util.Scanner;

public class TestInputLength {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("請輸入陣列大小");
	        int length = sc.nextInt();
	        int[] arr = new int[length];    //動態配置長度
	        for(int i =0; i<arr.length;i++) {
	        	int num = (int) (Math.random()*10+1);
	        	arr[i] = num;
	        }
	        
	        System.out.println("Array長度為"+ arr.length);
	        System.out.println("內容為");
	        for (int i : arr){
	            System.out.println(i);
	        }
	    }
}
