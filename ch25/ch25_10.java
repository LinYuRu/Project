package ch25;
@FunctionalInterface
interface Message {
	void msg();
}
class Test {
	public static void talking() {
		System.out.println("This is static method");
	}
}
public class ch25_10 {

	public static void main(String[] args) {
		Message obj = (Test::talking);
		obj.msg();

	}

}
