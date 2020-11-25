package ch24_Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class checkRepeat {

	public static void main(String[] args) {
		// 1.contain
		String[] str = { "a", "b", "c", "d", "a", "b" };
		Arrays.sort(str);

		List<String> list = Arrays.asList(str);

//		if(list.contains("a")) {
//			System.out.println("contain a");
//		}

		for (int i = 0; i < list.size()-1; i++) {
			if (str[i].equals(str[i + 1])) {
				System.out.println(str[i]);
				continue;
			}
		}
		// 2.Set
//		HashSet<String> ste = new HashSet<String>(list);
//		if(list.size()!=ste.size()) {
//			System.out.println("repeat");
//		}

	}

}
