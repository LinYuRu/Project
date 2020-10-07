package ch9;
class NBAteam {
	public static int counter;
	public int id;
	public String name;
	static {
		counter = 0;
	}
	public NBAteam() {
		id = ++counter;
	}
	public NBAteam(String name) {
		this.name = name;
	}

	public void output() {
		System.out.println("id: " + id + "  Name: "+name);
		System.out.println("共有 " + counter + " 名成員");
	}
}
public class ch9_20 {
	public static void main(String[]args) {
		NBAteam t1 = new NBAteam();
		t1.name = "Durrant";
		t1.output();
		NBAteam t2 = new NBAteam();
		t2.name = "Curry";
		t2.output();
	}
}
