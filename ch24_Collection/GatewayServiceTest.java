package ch24_Collection;

import java.util.ArrayList;

class School {
	int id;
	String teacher;

	public School(int id, String teacher) {
		this.id = id;
		this.teacher = teacher;
	}
}

public class GatewayServiceTest {
	public static void main(String[] args) {

		School s1 = new School(1, "Ted");
		School s2 = new School(2, "S");
		School s3 = new School(3, "Eclair");

		ArrayList<School> list = new ArrayList<School>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
	}

}
