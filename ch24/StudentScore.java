package ch24;

import java.util.ArrayList;
import java.util.Collections;

class Test{
	String student;
	double math;
	double social;
	
	public Test(String student, double math, double social) {
		this.student= student;
		this.math = math;
		this.social = social;
	}
}

public class StudentScore {

	public static void main(String[] args) {
		ArrayList<Test> list = new ArrayList<Test>();
		Test t1 = new Test("Obama", 59.9, 20.1);
		Test t2 = new Test("Trump", 60.1, 73.2);
		list.add(t1);
		list.add(t2);
	
		
		System.out.println(list.get(1));
		for(Test obj: list)
			System.out.println(obj.student + " " + obj.math + " " + obj.social);
	}

}
