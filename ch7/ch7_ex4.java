package ch7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ch7_ex4 {

	public static void main(String[] args) {
		String[] str = {"蘇有朋: ", "吳奇龍: ", "陳志朋: ","劉德華: ","張學友: "};
		double[][] degree = {
				{84, 92.5, 76.5},
				{82.5, 83, 80},
				{85, 81, 66},
				{74.5, 86, 67},
				{79, 84.5, 72}
		};
		double  avg, sum;
		ArrayList<Double> list = new ArrayList<Double>();
		ArrayList<Double> listSum = new ArrayList<Double>();
//		System.out.println("degree.length: " + degree.length);
		for(int i = 0; i<degree.length;i++) {
			sum = 0;
			for(double sc:degree[i]) {
				sum +=sc;
			}
			avg = sum/degree.length;
			listSum.add(sum);
//			System.out.printf("%s 總分: %5.2f, 平均: %5.2f.", str[i],sum, avg);
//			System.out.println();
			
			
			
			for(double sc:degree[i]) {
				list.add(sc);
			}
			list.add(sum);
			
			list.add(avg);
			System.out.println(list);

		}
		
		Collections.sort(listSum);
		
//		System.out.println(listSum);


	}

}
