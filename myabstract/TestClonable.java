package myabstract;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.springframework.beans.BeanUtils;

class TestCopy implements Cloneable {
	private String name;
	private String id;
	private TestCopied test;
	
	public TestCopied getTest() {
		return test;
	}
	public void setTest(TestCopied test) {
		this.test = test;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

class TestCopied {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class TestClonable implements Cloneable {
	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		List<TestCopy> src = new ArrayList<TestCopy>();
		TestCopy one = new TestCopy();
		TestCopied test = new TestCopied();
		test.setName("Alex");
		one.setTest(test);
		one.setId("0");
		one.setName("One");
		src.add(one);
		TestCopy two = new TestCopy();
		TestCopied test2 = new TestCopied();
		test2.setName("Encapsulation");
//		test2.setName("Sosa");
		two.setTest(test2);
		two.setId("1");
		two.setName("Two");
		src.add(two);
		List<TestCopy> temp = new ArrayList<TestCopy>(src);
		List<TestCopy> temp2 = new ArrayList<TestCopy>(src);
		System.out.println("1: " + temp.get(0).getName());
		System.out.println("2: " + temp.get(1).getTest().getName());
		BeanUtils.copyProperties(src, temp2);
		System.out.println("getTest(): " + temp2.get(1).getTest().getName());
		System.out.println("1: " + temp2.get(0).getName());
		System.out.println("2: " + temp2.get(1).getTest().getName());
	}
}
