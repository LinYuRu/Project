package ch20;

import java.io.IOException;

class MyThrows {
	void myMethod(int n ) throws IOException, ClassNotFoundException {
		if (n==1)
			throw new IOException("IOException發生了");
		else
			throw new ClassNotFoundException("ClassNotFoundException");
	}
}
public class ch20_21 {

	public static void main(String[] args) {
		for ( int i = 1; i <=2; i++) {
			try {
				MyThrows obj = new MyThrows();
				obj.myMethod(i);
			}
			catch(IOException e){
				System.out.println("IOException : " + e);
			}
			catch(ClassNotFoundException e) {
				System.out.println("ClassNotFoundtException : " + e);
			}
		}

	}

}
