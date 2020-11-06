package ch15_Object;
class Myclass{}
public class ch15_8 {

	public static void main(String[] args) {
		char[] ch = {'明', '智', '科', '技', '大', '學'};
		String str = new String(ch);
		Myclass obj = new Myclass();
		System.out.println("ch類別 : " + str.getClass());
		System.out.println("obj類別:" + obj.getClass());

	}

}
