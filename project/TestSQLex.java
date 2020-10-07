package project;

public class TestSQLex {
	public static void main(String[] args) {

		String x = "  Select Ename, From employee  ";
		String data = x.trim();
		String data1 = data.toLowerCase();
		if (data1.startsWith("select") == true) {
			System.out.println("SQL search start:");

			System.out.println(data1.substring(data1.indexOf("select"), data1.indexOf("select") + 6));
			System.out.println(data1.substring(data1.indexOf("ename"), data1.indexOf("ename") + 5));
			System.out.println(data1.substring(data1.indexOf(","), data1.indexOf(",") + 1));
			System.out.println(data1.substring(data1.indexOf("from"), data1.indexOf("from") + 4));
			System.out.println(data1.substring(data1.indexOf("employee"), data1.indexOf("employee") + 8));
		} else {
			System.out.println("Please Correct index");
		}
	}
}
