package ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	int no;
	String name;
	String address;

	public Student(int no, String name, String address) {
		this.no = no;
		this.name = name;
		this.address = address;
	}

	public String toString() {
		return this.no + " " + this.name + " " + this.address;
	}
}
class Sortbyroll implements Comparator<StudentScore>{
	public int compare(StudentScore a, StudentScore b) {
		return a.no - b.no;
	}


}
	 class Students {

		public static void main(String[] args) {
			ArrayList<StudentScore> ar = new ArrayList<StudentScore>();
			ar.add(new StudentScore(121, "bbb", "London"));
			ar.add(new StudentScore(143, "fff", "NY"));
			ar.add(new StudentScore(111, "eee", "WS"));
			System.out.println("Unsorted");
			
			for(int i = 0; i < ar.size(); i++)
				System.out.println(ar.get(i));
			
			Collections.sort(ar, new Sortbyroll());
			System.out.println("\nSorted by no");
			
			for(int i = 0; i < ar.size(); i++)
				System.out.println(ar.get(i));

		}
	}

