package ch15_Object;

class Foriegner {
	String name = "Tom";
	int age = 18;
	String hometown = "Melbourne";
	String country = "Australia";

	public String toString() {
		return this.name + " is " + age + " years old,  and he come from " + hometown + ", " + country + ".";
	}
}

public class prac_06 {

	public static void main(String[] args) {
		Foriegner fk = new Foriegner();
		System.out.println(fk);

	}

}
