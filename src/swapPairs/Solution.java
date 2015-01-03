package swapPairs;

import util.ListNode;

public class Solution {
	public ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null)
			return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode d = dummy;
		ListNode p = head;
		ListNode q;
		while(p != null && p.next != null){
			q = p.next; 
			p.next = p.next.next;
			q.next = p;
			d.next = q;
			d = p;
			p = p.next;
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = d;
		System.out.println(test.swapPairs(a).toString());
	}

}
