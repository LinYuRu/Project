package ch19.ch19_17;

import java.util.Random;

public class IdCreater {
	private int id;
	private static int idInitial;
	static {
		Random ran = new Random();
		idInitial = ran.nextInt(10)*1000;
		
	}
	public IdCreater () {
		id =++ idInitial;
	}
	public int getId() {
		return id;
	}

}
