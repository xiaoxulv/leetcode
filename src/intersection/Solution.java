package intersection;

import util.ListNode;

public class Solution {

	//O(m+n) time; O(1) space
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		// empty case
		if (headA == null || headB == null)
			return null;
		
		ListNode ha = headA;
		ListNode hb = headB;
		//length 
		int lenA = 0, lenB = 0;
		while(ha != null){
			lenA++;
			ha = ha.next;
		}
		while(hb != null){
			lenB++;
			hb = hb.next;
		}
		//longer iteration to position where has same length as shorter
		int delta = Math.abs(lenA - lenB);
		int count = 0;
		if(lenA > lenB){
			while(count < delta){
				headA = headA.next;
				count++;
			}
		}
		else{
			while(count < delta){
				headB = headB.next;
				count++;
			}
		}
		//now have same length
		while(headA != null && headB != null){
			if(headA.val == headB.val)
				return headA;//find common
			else{
				headA = headA.next;
				headB = headB.next;
			}		
		}
		
		return null;
	}
	// Definition for singly-linked list.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(9);
		ListNode d = new ListNode(8);
		
		a.next = b;
		b.next = c;
		c.next = d;
		
		System.out.println(test.getIntersectionNode(a, c).val);
		

	}


}
