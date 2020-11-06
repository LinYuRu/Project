package ch25_Lambda;

import java.util.List;

public class ch25_14 {

	public static void main(String[] args) {
		List<String> list = List.of("USA", "Korea", "Taiwan");
		list.add("mill");
		list.forEach(System.out::println);
		//UnsupportedOperationException
		// 此exception發生在List 他的大小是固定時
		// 但user又想寫add,remove, 改變他的大小。
	}

}
