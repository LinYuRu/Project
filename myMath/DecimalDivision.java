package myMath;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class DecimalDivision {
	
	// divisor:除數, dividend:被除數
	public static double calDivision(double divisor, double dividend) {
		BigDecimal over = new BigDecimal(divisor);
		BigDecimal under = new BigDecimal(dividend);
		BigDecimal result = new BigDecimal("0.0");
		result = over.divide(under, 2, RoundingMode.HALF_UP);
		
		return result.doubleValue();
	}
	
	
	public static double calMultiply(double multisor,double multited) {
		MathContext m = new MathContext(4); 
		BigDecimal b1 = new BigDecimal("5.99");
		BigDecimal b2 = new BigDecimal("4.6");

		// Multiply b1 with b2 using m
		BigDecimal b3 = b1.multiply(b2, m);
		System.out.println("Multiplication is " + b3);
		
		BigDecimal c1 = new BigDecimal(multisor);
		BigDecimal c2 = new BigDecimal(multited);
		BigDecimal c3 = c1.multiply(c2, m);
		// Print b3 value
		System.out.println("Multiplication is " + c3);
		return c3.doubleValue();
	}
	
	public static double calPlus(double x,double y) {
		BigDecimal b1 = new BigDecimal(x);
		BigDecimal b2 = new BigDecimal(y);		
		return b1.add(b2).doubleValue();
	}
	
	//沒有減法
	public static double calMinus(double x,double y) {
		BigDecimal b1 = new BigDecimal(x);
		BigDecimal b2 = new BigDecimal(-y);		
		return b1.add(b2).doubleValue();
	}

	public static void main(String[] args) {
		System.out.println(calMultiply(-2, 0.2));
		System.out.println(calDivision(-2, 0.2));
		System.out.println(calPlus(-2, 0.2));
		System.out.println(calMinus(-2, 0.2));
	}

//	ROUND_CEILING
//	如果 BigDecimal 是正的，則做 ROUND_UP 操作；如果為負，則做 ROUND_DOWN 操作。
//	ROUND_DOWN
//	從不在捨棄(即截斷)的小數之前增加數字。
//	ROUND_FLOOR
//	如果 BigDecimal 為正，則作 ROUND_UP ；如果為負，則作 ROUND_DOWN 。
//	ROUND_HALF_DOWN
//	若捨棄部分> .5，則作 ROUND_UP；否則，作 ROUND_DOWN 。
//	ROUND_HALF_EVEN
//	如果捨棄部分左邊的數字為奇數，則作 ROUND_HALF_UP ；如果它為偶數，則作 ROUND_HALF_DOWN 。
//	ROUND_HALF_UP
//	若捨棄部分>=.5，則作 ROUND_UP ；否則，作 ROUND_DOWN 。
//	ROUND_UNNECESSARY
//	該“偽舍入模式”實際是指明所要求的操作必須是精確的，，因此不需要舍入操作。
//	ROUND_UP
//	總是在非 0 捨棄小數(即截斷)之前增加數字。
}
