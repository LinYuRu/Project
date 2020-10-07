package ClassObjectField;

class animal{
	private String name="Qoo";
	private int age=5;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
}

public class CallTestEncapsulationEx2 {
	public static void main(String[] args) {
		animal a1= new animal();
		a1.setName("Angel");
		String name=a1.getName();
		System.out.println("name:"+name);
		

	}

}
