package JavaFlowControl;

public class TestSplit {

	public static void main(String[] args) {
		String line = "select  dAta    ,  salary from    emPlOyEE";
		String[] split_line = line.split(" ");
		String str = " ";
		
		for (String s :split_line) {
			if(str.equals(s)||str.equalsIgnoreCase(s)) {
				continue;
			}
		System.out.println(s);
		}

	}

}
