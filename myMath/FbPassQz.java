package myMath;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FbPassQz {

	public static void main(String[] args) {
		int i_low = 3*3;
		int i_high = 7*7;
		BigDecimal divisor = new BigDecimal(11);
		for(int i =i_low;i <=i_high;i++){
			BigDecimal over = new BigDecimal(i);
			BigDecimal result = over.divide(divisor,2,RoundingMode.HALF_DOWN);
			if(new BigDecimal(result.intValue()).compareTo(result)==0) {
				System.out.println(over.intValue());
			}
		}

	}

}
