package mergeTwoLists;

import util.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode dummy = new ListNode(-10000);
    	ListNode temp = dummy;
    	while(l1 != null && l2 != null){
    		if(l1.val <= l2.val){
    			temp.next = l1;
    			l1 = l1.next;
    		}
    		else{
    			temp.next = l2;
    			l2 = l2.next;
    		}
    		temp = temp.next;
    	}
    	if(l1 == null)
    		temp.next = l2;
    	if(l2 == null)
    		temp.next = l1;
    	return dummy.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();

		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(4);
		a.next = c;

		b.next = d;
		d.next = e;
		
		System.out.println(test.mergeTwoLists(a, b).toString());
	}

}
