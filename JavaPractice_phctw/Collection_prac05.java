package JavaPractice_phctw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection_prac05 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayString as = new ArrayString();
		String[] st = as.playLotto();
		for(int i=0;i<=st.length-1;i++) {
			list.add(st[i]);
		}
		System.out.println(list);

	}

	
}
