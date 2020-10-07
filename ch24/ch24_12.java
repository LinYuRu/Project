package ch24;

import java.util.LinkedList;

public class ch24_12 {

	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for (int i = 10; i <=50; i+=10) {
			queue.addLast(i);
			System.out.println("queue : " + queue);
		}
		int loop = queue.size();
		for ( int i = 1 ; i <=loop ; i++) {
			System.out.printf("dequeue 第%d筆元素%d : \n", i, queue.removeFirst());
			System.out.println("queue : " + queue);
		}

	}

}
