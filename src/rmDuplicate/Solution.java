package rmDuplicate;

import intersection.Solution.ListNode;

public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null)
            return head;
		ListNode p = head;
		ListNode q = p.next;
		while(q != null){
			while(p.val == q.val && q.next != null ){
				q = q.next;
				p.next = q;
			}
			if(p.val == q.val && q.next == null ){
				p.next = null;
			}
			p = p.next;
			q = q.next;		
		}

//		Quicker use one pointer 
//        while( p!= null && p.next != null){
//            if(p.val == p.next.val){
//                p.next = p.next.next;
//            }else{
//                p = p.next; 
//            }
//        }
 
		return head;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		ListNode a = test.new ListNode(1);
		ListNode b = test.new ListNode(1);
		ListNode c = test.new ListNode(1);
		ListNode d = test.new ListNode(1);
		ListNode e = test.new ListNode(1);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		System.out.println(test.deleteDuplicates(a).toString());
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
		public String toString (){
			ListNode n = this;
			String s = "";
			while(n != null){
				s += n.val + " ";
				n = n.next;
			}
			return s;
		}
	}

}
