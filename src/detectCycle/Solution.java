package detectCycle;

import util.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null||head.next == null)
        	return null;
        ListNode p = head;
        ListNode q = head;
        while(q.next != null&&q.next.next != null){
        	p = p.next;
        	q = q.next.next;
        	if(p == q)
        		break;
        }
        if(q.next == null||q.next.next == null)
        	return null;
    	p = head;
    	while(p != q){
    		p = p.next;
    		q = q.next;
    	}
    	return p;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = c;
		Solution test = new Solution();
		System.out.println(test.detectCycle(a).val);
	}

}
