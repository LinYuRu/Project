package testString;

import java.util.Arrays;

public class TestContain {

	public static void main(String[] args) {
		String[] str = {"111", "112", "11A"};
		String a = "111";
		System.out.println(Arrays.asList(str).contains(a));

	}

}
