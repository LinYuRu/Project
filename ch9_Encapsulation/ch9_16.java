package ch9_Encapsulation;
//class Person {
//	public int age;
//	public String name;
//	public void output() {
//		System.out.println("Name: " + name);
//		System.out.println("Age: " + age);
//	}
//}
public class ch9_16 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Peter";
		p1.age = 20;
		
		Person p2 = new Person();
		p2.name = "Feng";
		p2.age = 40;
		p2.output();
		p1.output();
	}

}
