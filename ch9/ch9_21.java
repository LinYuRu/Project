package ch9;
class PrintSample{
	public static void output() {
		System.out.println("測試static方法");
	}
}
public class ch9_21 {

	public static void main(String[] args) {
		PrintSample.output();
		PrintSample A = new PrintSample();
		A.output();

	}

}
