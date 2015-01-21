package addTwoNumbers;

import util.ListNode;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		int sum = 0;
		while(l1 != null || l2 != null){
			if(l1 != null){
				sum += l1.val;
				l1 = l1.next;
			}
			if(l2 != null){
				sum += l2.val;
				l2 = l2.next;
			}
			cur.next = new ListNode(sum%10);
			cur = cur.next;
			sum /= 10; 
		}
		if(sum == 1)
			cur.next = new ListNode(sum);
		return dummy.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		ListNode a = new ListNode(7);
		ListNode b = new ListNode(0);
		ListNode c = new ListNode(2);
		a.next = b;
		b.next = c;
		ListNode d = new ListNode(8);
		ListNode e = new ListNode(9);
		d.next = e;
		System.out.println(test.addTwoNumbers(a, d).toString());
	}

}
