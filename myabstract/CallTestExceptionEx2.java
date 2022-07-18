package myabstract;

public class CallTestExceptionEx2 {
	public void divide(int a, int b) 
			throws ArithmeticException, Exception
	{
		System.out.println("a/b = "+(a/b));
	}

	public static void main(String[] args) {
		CallTestExceptionEx2 except2 = new CallTestExceptionEx2();
		try {
		except2.divide(6,0);}
		catch(ArithmeticException e){
		System.out.println("Step1");
		}catch(Exception e){
			System.out.println("Step2");
		}
	}

}
