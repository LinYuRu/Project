package LeetCode_LinkedList;

public class Merge_2_Sorted_List {
	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode(int x) { val = x; } }
	 */

	// Linked-List
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode c = result;

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

		if (l1 != null) {
			c.next = l1;
		}

		if (l2 != null) {
			c.next = l2;
		}
		return result.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode other1 = new ListNode(1);
		ListNode other2 = new ListNode(2);
		ListNode other3 = new ListNode(4);

//		Merge_2_Sorted_List.ListNode other3 = some.new ListNode(20);
		ListNode l3 = mergeTwoLists(other1, other2);
		ListNode l4 = mergeTwoLists(l3, other3);
//		System.out.println("value: " + l4.val);
		
		ListNode some1 = new ListNode(1);
		ListNode some2 = new ListNode(3);
		ListNode some3 = new ListNode(4);
		ListNode s3 = mergeTwoLists(some1, some2);
		ListNode s4 = mergeTwoLists(s3, some3);
//		System.out.println("value: " + s4.val);
		ListNode m = mergeTwoLists(s4, l4);
		System.out.println("finish");
	}

}
