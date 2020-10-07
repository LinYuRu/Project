package Collection;

import java.util.LinkedList;

public class TestLinkedListEx1 {
	@SuppressWarnings("rawtypes")
	private LinkedList queue;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void processStoreQueue() {
		queue = new LinkedList();
	queue.offer("Signal");
	queue.offer("Sign");
	}
	
	public void processRetrieveQueue(){
		while(queue.peek()!=null) {
			String msg = (String)queue.poll();
			System.out.println("msg:"+msg);
		}
	}

	public static void main(String[] args) {
		TestLinkedListEx1 test1 = new TestLinkedListEx1();
		test1.processStoreQueue();
		test1.processRetrieveQueue();
		}

	}


