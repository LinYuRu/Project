package ch9_Encapsulation;
class DemoConstructor{
	int age;
	String name;
	DemoConstructor(){}
	DemoConstructor(int age, String name){
		this.age = age;
		this.name = name;
	}
}
public class ex9_6 {

	public static void main(String[] args) {
		DemoConstructor dm = new DemoConstructor(20, "John");
		System.out.println(dm.name + " " + dm.age);
		DemoConstructor dn = new DemoConstructor();
		dn.name = "Peter";
		dn.age = 22;
		System.out.println(dn.name + " " + dn.age);
	}

}
