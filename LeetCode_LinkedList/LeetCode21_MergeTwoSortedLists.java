package LeetCode_LinkedList;

import java.util.Objects;

class ListNode{
	Integer val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	
}
public class LeetCode21_MergeTwoSortedLists {
	

	//Merge two sorted linked lists and return it as a new list. 
	//The new list should be made by splicing together 
	//the nodes of the first two lists.
	//example: [1,2,2,3] + [1,3] = [1,1,2,2,3,3]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(2);
		ListNode ln4 = new ListNode(3);
		ListNode ln5 = new ListNode(1);
		ListNode ln6 = new ListNode(3);
		
		ln3.next = ln4;
		ln2.next = ln3;
		ln1.next = ln2;
		ln5.next = ln6;
		
		ListNode result = mergeTwoLists(ln1,ln5);
		
		System.out.println("Final");

	}
	
//	@SuppressWarnings("unused")a
	public static ListNode mergeTwoSortedList(ListNode l1,ListNode l2) {
		if(Objects.isNull(l1)) {
			return l2;
		}
		if(Objects.isNull(l2)) { return l1; }
		
		ListNode result = new ListNode();
		ListNode tmp1 = l1;
		ListNode tmp2 = l2;
		while(!Objects.isNull(tmp1.val) || !Objects.isNull(tmp2.val)) {
			ListNode tag1 = tmp1;
			ListNode tag2 = tmp2;
			ListNode tmp = null;
			if(tmp1.val>tmp2.val) {
				tmp = new ListNode(tmp2.val);
				tmp2 = tag2.next;
			} else {
				tmp =  new ListNode(tmp1.val);
				tmp1 = tag1.next;
			}	
			result.next = tmp;
			result = result.next;
		}
		return result.next;
	}
	
	// solution
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
 
}
