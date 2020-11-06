package ch25_Lambda;

public class ch25_6 {

	public static void main(String[] args) {
		Hi obj = name->{
			return "Hi! " + name;
		};
		System.out.println(obj.talking("Peter"));


	}

}
