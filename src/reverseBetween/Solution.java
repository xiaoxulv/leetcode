package reverseBetween;

import util.ListNode;

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null||head.next ==null)
        	return head;
    	ListNode dummy  = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
    	int i = 0;
        while(i < m-1){
        	i++;
        	cur = cur.next;
        }
        //reverse from cur.next
        ListNode pre = cur;
        cur = cur.next;
        i++;
        while(i < n && cur.next != null){
        	ListNode temp = cur.next;
        	cur.next = temp.next;
        	temp.next = pre.next;
        	pre.next = temp;
        	i++;
        }
        return dummy.next;

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
		System.out.println(test.reverseBetween(a, 1, 4).toString());
	}

}
