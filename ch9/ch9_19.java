package ch9;

//class NBAteam {
//	public static String team;
//	public String name;
//	static {
//		team = "Warrior";
//	}
//
//	public NBAteam(String name) {
//		this.name = name;
//	}
//
//	public void output() {
//		System.out.println("Team: " + team);
//		System.out.println("Name: " + name);
//	}
//}

public class ch9_19 {
	public static void main(String[] args) {
		NBAteam t1 = new NBAteam("Curry");
		NBAteam t2 = new NBAteam("Durant");
		t1.output();
		t2.output();
		System.out.println();
//		NBAteam.team = "Golden State";
		t1.output();
		t2.output();
	}
}
