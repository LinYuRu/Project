package ch14_Inheritance;
//class Hometown{
//	protected String city, state, country;
//	Hometown (String city, String state, String country){
//		this.city = city;
//		this.state = state;
//		this.country = country;
//	}
//}
//class Employee{
//	int id;
//	int age;
//	char gender;
//	String name;
//	Hometown hometown;
//	Employee(int id, int age, char gender, String name, Hometown hometown){
//		this.id = id;
//		this.age = age;
//		this.gender = gender;
//		this.name = name;
//		this.hometown = hometown;
//	}
//	public void printInfo() {
//		System.out.println("員工編號: "+ id + "\t" +
//				"員工姓名: " + age + "\t" + "員工性別: " + gender + "\t" +
//				"員工姓名: " + name
//				);
//		System.out.println("城市: " + hometown.city + "\t" +
//				"省份: " + hometown.state +"\t" +
//				"國別: " + hometown.country
//				);
//	}
//}
public class ch14_17 {
	public static void main(String[] args) {
		Hometown ht = new Hometown("大安","台北","台灣");
		Employee em = new Employee(10, 29, 'F', "子瑜", ht);
		em.printInfo();
	}
}
