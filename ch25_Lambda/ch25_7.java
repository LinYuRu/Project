package ch25_Lambda;
//@FunctionalInterface
//interface myMath{
//	int add(int x, int y);
//}

interface myMath{
	int add(int x, int y);
}
public class ch25_7 {

	public static void main(String[] args) {
		myMath obj = (x, y)->(x+y);
		System.out.println(obj.add(10, 20));
//		myMath obj = (x, y)->(x+y);
//		System.out.println(obj.add(10, 20));

	}

}
