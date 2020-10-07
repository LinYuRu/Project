package ClassObjectField;

public class TestVarArgsEx1 {
	
	public void processAction(int... data) {
		
		int sum = 0;
		
		for (int i=0; i <data.length;i++) {
			sum = sum + data[i];
		}
		System.out.println("sum"+sum);
	}
	
	public static void main(String[] args) {
		TestVarArgsEx1 varArgs =new TestVarArgsEx1();
		varArgs.processAction();
		varArgs.processAction(1,2,3,4,5,6,7,8,9,10);
		
		int[] value = {1,2,3}; 
		varArgs.processAction(value);

	}

}
