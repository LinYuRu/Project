package Collection;

import java.util.HashMap;
import java.util.LinkedList;

public class CallTestTrackRecordEx1 {
	private LinkedList<HashMap<String, Double>> line = new LinkedList<HashMap<String, Double>>();

	public void recordTrack(){
		for(int i=0;i<3;i++) {
	double x =Math.random()*256;
	double y = Math.random()*128;
	
	HashMap<String, Double> p= new HashMap<String, Double>();
	p.put("x",x);
	p.put("y",y);
	
	line.add(p);
		}
	}

	public void printResult() {
		System.out.println("line:" + line);
	}

	public static void main(String[] args) {
		CallTestTrackRecordEx1 record = new CallTestTrackRecordEx1();
		record.recordTrack();
		record.printResult();

	}

}
