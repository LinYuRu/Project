package ClassObjectField;

import java.math.BigDecimal;

public class TestAddEx1 {

	public static void main(String[] args) {
		BigDecimal x = new BigDecimal("0.01");
		BigDecimal y = new BigDecimal("0.11");
		BigDecimal z = new BigDecimal("0.12");
		
		BigDecimal sol = x.add(y);
//		sol = x.add(y);
		if(x.add(y).equals(sol)) {
		System.out.println("Results = "+sol);
		}else {
			System.out.println("ReCaculate");
		}
}}
