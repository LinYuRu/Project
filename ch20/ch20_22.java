package ch20;
//class MyException extends Exception {
//	
//}
public class ch20_22 {

	public static void main(String[] args) {
		try {
			System.out.println("try區塊");
			throw new MyException();
		}
		catch (MyException e) {
			System.out.println("catch區塊");
			System.out.println("我的異常類別MyException : " + e);
			e.printStackTrace();
		}

	}

}
