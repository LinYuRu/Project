package ClassObjectField;

public class Test2DimsArrayEx1 {

	public static void main(String[] args) {
		int[][] data = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 } };

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.printf("data[%d][%d]=%d\n", i, j, data[i][j]);
			}
		}
		
		for(int[] nums:data) {
		// 2.2���ק��@����
			for(int index: nums) {
		// 3. 1���ק��2����
				System.out.println("index:" + index);
			}
		}
		
		//1. �����}�C�Avalue����Ʀr�����C�L
		int[] numbers = {1,2,3,4,5,6,7,8};
		
		for(int value: numbers) {
			System.out.println("value:" + value);
		}
	}

}
