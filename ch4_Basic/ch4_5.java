package ch4_Basic;

public class ch4_5 {
	public static void main(String[] args) {
		int students = 50;
		int grapes = 90;
		int count = grapes / students;
		int left = grapes % students;
		System.out.println("每人分幾顆葡萄 = " + count);
		System.out.println("剩下幾顆葡萄 = " + left);
	}
}
