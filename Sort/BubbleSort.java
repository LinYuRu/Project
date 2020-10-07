package Sort;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {
	public static void main(String[] args) {		
		int[] test = new int[]{2, 1, 3, 2, 5, 4};
		
		int[] a= sort(test);
		for(int t:a){
			System.out.print(t);
		}
	}

	public static int[] testSort(int[] input) {
		int length = input.length;
		int temp;
		
		for(int i=0;i<length;i++) {
			for(int j=0;j<length-1;j++) {
				
				if(input[j]>input[j+1]) {
					temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
		return input;
	}

    static int[] sort(int[] input){
		
		int length = input.length;//要排列的數字長度
	    int temp;//前面數字>後面數字時兩個會互換位置,此時需要此變數
	    
        //每個數字都要比對
	    for(int i=0;i<length;i++){
	    	
	    	for(int j=0;j<length-1;j++){
	    	   
	    	   //比大小,if 前>後 換位
	    	   if(input[j]>input[j+1]){
	    		   
	    		  temp = input[j];//前面數字先存到變數
	    		  input[j] = input[j+1];//後面數字取代前面數字
	    		  input[j+1] = temp; //將變數(前面數字)存到後面變數
	    		
	    	   }

	    	}
	    	
	    }
		return input;
     }

}
