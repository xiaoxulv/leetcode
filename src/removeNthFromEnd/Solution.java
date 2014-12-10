package removeNthFromEnd;

import util.ListNode;

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head.next == null)
			return null;
		ListNode h = head;
		ListNode p = head;
		ListNode q = p.next;
		n--;
		while(n > 0){//two pointers n-1 distance
			if(q.next == null)// if remove the first
				return h.next;
			q = q.next;
			n--;
		}
		while(q.next != null){
			p = p.next;
			q = q.next;
		}
		p.next = p.next.next;
		return h;
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
		System.out.println(test.removeNthFromEnd(a, 4).toString());
	}

}
