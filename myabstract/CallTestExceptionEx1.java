package myabstract;

public class CallTestExceptionEx1 {
	private int[] data = { 1, 2, 3, 4, 5, 6 };

	public void showResults() {
		try {
			for (int i = 0; i < data.length; i++) {
				System.out.printf("data[%d]=%d\n", i, data[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Finished");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Hello");
		}
	}

	public static void main(String[] args) {
		CallTestExceptionEx1 except1 = new CallTestExceptionEx1();
		except1.showResults();

	}

}
