package ch20_Exception;

public class ch20_18_ex {
	public static void ageCheck(int ageLine) throws Exception {
		if (ageLine >= 18) {
			System.out.println("歡迎投票 " + ageLine);
		}
		else {
			System.out.println("年齡不符" + ageLine);
			throw new ArrayIndexOutOfBoundsException("未成年");
		}
	}

	public static void main(String[] args) throws Exception {
		int[] age = {32, 17};
		for( int i = 0; i<=age.length ; i++) {
			try {
				ageCheck(age[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ERROR!!" + e);
				e.printStackTrace();
			}
		}

	}

}
