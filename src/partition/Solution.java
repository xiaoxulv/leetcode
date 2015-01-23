package partition;

import util.ListNode;

public class Solution {
	// need to preserve the original order of the list
	// TLE 竟然
/*	public ListNode partition(ListNode head, int x) {
		if(head == null) return null;
		ListNode preStart = null;
		ListNode preEnd = null;
		ListNode postStart = null;
		ListNode postEnd = null;
		
		while(head != null){
			ListNode next = head.next;
			if(head.val < x){
				if(preStart == null){
					preStart = head;
					preEnd = preStart;
				}else{
					preEnd.next = head;
					preEnd = head;
				}
			}
			else{//>=
				if(postStart == null){
					postStart = head;
					postEnd = postStart;
				}else{
					postEnd.next = head;
					postEnd = head;
				}
			}
			head = next;
		}
		
		if(preStart == null)
			return postStart;
		preEnd.next = postStart;
		return preStart;
	}
*/
	public ListNode partition(ListNode head, int x){
		if(head == null) return null;
		ListNode p = new ListNode(0);
		ListNode p1 = p;
		ListNode q = new ListNode(0);
		ListNode q1 = q;
		while (head != null){
			if(head.val < x){
				p.next = head;
				p = p.next;
			}else{
				q.next = head;
				q = q.next;
			}
			head = head.next;
		}
		q.next = null;
		p.next = q1.next;
		return p1.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		ListNode a = new ListNode(5);
		ListNode b = new ListNode(1);
		ListNode c = new ListNode(2);
		ListNode d = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = d;
		System.out.println(test.partition(a, 3));
	}

}
