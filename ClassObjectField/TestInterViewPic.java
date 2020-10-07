package ClassObjectField;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestInterViewPic {
	public static void main(String[] args) {
		List<Integer> names = new ArrayList<Integer>();
		collectNameto(names);
		System.out.println("Visitor list:");
		printUpperCase(names);
}
	static void collectNameto(List names) {
		Scanner console = new Scanner(System.in);
		while(true) {
			System.out.println("Visitor list:");
			String name = console.nextLine();
			if(name.contentEquals("quit")) {
				break;
			}
			names.add(name);
		}
	}
	static void printUpperCase(List names) {
		for(int i = 0 ; i < names.size() ; i++) {
			String name = (String) names.get(i);
			System.out.println(name.toUpperCase());
		}
	}
	}

