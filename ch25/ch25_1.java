package ch25;

abstract class StringAdd<T> {
	abstract T display(T x, T y);
}
//abstract class StringAdd<T> {
//	abstract T display(T x, T y);
//}

public class ch25_1 {

	public static void main(String[] args) {
		StringAdd<String> obj = new StringAdd<String>() {
			String display(String x,String y) {
				return x+y;
			}
		};
		System.out.println(obj.display("Java", "王者歸來"));
//		StringAdd<String> obj = new StringAdd<String>() {
//
//			String display(String x, String y) {
//				return x + y;
//			}
//
//		};
//		System.out.println(obj.display("Java", "王者歸來"));

	}

}
