package hasCycle;

import util.ListNode;

public class Solution {
	public boolean hasCycle(ListNode head) {
		if(head == null || head.next == null)
			return false;
		
		ListNode p = head;
		ListNode q = p;

		while(q.next != null && q.next.next != null){
			p = p.next;
			q = q.next.next;
			if(q == p)
				return true;
		}
		return false;
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
		c.next = b;
		System.out.println(test.hasCycle(a));
	}

}
