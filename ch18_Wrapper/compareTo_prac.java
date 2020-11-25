package ch18_Wrapper;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class User implements Comparable<User>{
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return String.format("User(%s, %d)", name, age);
	}
	@Override
	public int compareTo(User other) {
		// TODO Auto-generated method stub
		return this.age - other.age;
	}
}
public class compareTo_prac {

	public static void main(String[] args) {
		List list = Arrays.asList(
		new User("Autine", 30),
		new User("Austine", 40),
		new User("Jack", 20)
		);
		Collections.sort(list);
//		list.sort(list);
		System.out.println(list);
		

	}

}
