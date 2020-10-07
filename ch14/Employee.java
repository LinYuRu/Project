package ch14;

public class Employee {
	int id;
	int age;
	char gender;
	String name;
	Hometown hometown;
	Employee(int id, int age, char gender, String name, Hometown hometown){
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.name = name;
		this.hometown = hometown;
	}
	public void printInfo() {
		System.out.println("員工編號: "+ id + "\t" +
				"員工姓名: " + age + "\t" + "員工性別: " + gender + "\t" +
				"員工姓名: " + name
				);
		System.out.println("區: " + hometown.city + "\t" +
				"縣市: " + hometown.state +"\t" +
				"國別: " + hometown.country
				);
	}
}
