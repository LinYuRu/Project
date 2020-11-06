package ch9_Encapsulation;

public class ch9_18 {

	public static void main(String[] args) {
		Person.age = 20;
		Person p1 = new Person("Alex");
		
		Person p2 = new Person("Perce");
		p2.output();
		p1.output();
		System.out.println();
		
		Person.age = 30;
		
		p2.output();
		p1.output();

	}

}
