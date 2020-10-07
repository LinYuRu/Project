package ch24;

import java.util.ArrayList;
import java.util.Collections;

public class ch24_22 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1 ; i <= 10 ; i++)
			list.add(i);
		System.out.println("List Elements Before shuffled : " + list);
		for ( int i=1; i<=5 ; i++) {
			Collections.shuffle(list);
			System.out.println("List Elements After shuffle : " + list);
		}
		
		
	}

}
