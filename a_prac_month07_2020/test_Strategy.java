package a_prac_month07_2020;

import java.util.HashMap;
import java.util.Map;

interface Strategy {

	void test_run();

}

class baseStrategy {
	String param = "";
	int num = 0;

	public baseStrategy() {
	}
}

class FastStrategy extends baseStrategy implements Strategy {

//	public FastStrategy(String param, int num) {
//		super(param, num);
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public void test_run() {
		System.out.println("fastStrategy");

	}

}

class NormalStrategy extends baseStrategy implements Strategy {

//	public NormalStrategy(String param, int num) {
//		super(param, num);
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public void test_run() {
		System.out.println("normalStrategy");

	}

}

class SlowStrategy extends baseStrategy implements Strategy {
//	public SlowStrategy(String param, int num) {
//		super(param, num);
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public void test_run() {
		System.out.println("slowStrategy");

	}

}

public class test_Strategy {
	public static void main(String args[]) {
//		SlowStrategy slowStrategy = new SlowStrategy();
//		NormalStrategy normalStrategy = new NormalStrategy();
//		FastStrategy fastStrategy = new FastStrategy();
		
//		System.out.println(fastStrategy.getClass());

		Map<Integer, Strategy> map = new HashMap<Integer, Strategy>();
		map.put(0, new SlowStrategy());
		map.put(1, new NormalStrategy());
		map.put(2, new FastStrategy());
		
		
		Strategy strategy = map.get(1);
		strategy.test_run();
		
		strategy = map.get(0);
		strategy.test_run();
		
		strategy = map.get(2);
		strategy.test_run();
		
		
//		Map map = new HashMap<Integer, a_prac_month07_2020.class>();
//		map.put(0, "FastStrategy");
//		map.put(1, "SlowStrategy");
//		map.put(2, "NormalStrategy");
		

	}

}
