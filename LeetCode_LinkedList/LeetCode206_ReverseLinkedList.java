package LeetCode_LinkedList;

public class LeetCode206_ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode other1 = new ListNode(1);
		ListNode other2 = new ListNode(2);
		ListNode other3 = new ListNode(4);
		other2.next = other3;
		other1.next = other2;
		

		ListNode some1 = new ListNode(1);
		ListNode some2 = new ListNode(3);
		ListNode some3 = new ListNode(4);
		some2.next = some3;
		some1.next = some2;

	}

	public static ListNode reverse_link(ListNode l1, ListNode l2) {

		var result = new ListNode(0);
		// 目前Node位置
		var c = result;

		while (l1 != null && l2 != null) {
			// l1,l2較小的數加入result
			if (l1.val > l2.val) {
				c.next = l2;
				l2 = l2.next;
			} else {
				c.next = l1;
				l1 = l1.next;
			}
			c = c.next;
		}

		// 將l1,l2剩下的Node加到result
		if (l1 != null) {
			c.next = l1;
		}

		if (l2 != null) {
			c.next = l2;
		}
		return result.next;

	}
}
