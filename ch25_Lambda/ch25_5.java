package ch25_Lambda;
//@FunctionalInterface
//interface Hi {
//	public String talking(String name);
//}
interface Hi{
	public String talking(String name);
}
public class ch25_5 {

	public static void main(String[] args) {
		Hi obj = (name)->{
			return "Hi! " +name;
		};
		System.out.println(obj.talking("Alex"));
//		Hi obj = (name)->{
//			return "Hi! " + name;
//		};
//		System.out.println(obj.talking("Peter"));

	}

}
