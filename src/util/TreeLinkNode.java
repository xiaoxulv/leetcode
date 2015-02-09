package util;

import java.util.LinkedList;
import java.util.Queue;

public class TreeLinkNode {
	int val;
	public TreeLinkNode left;
	public TreeLinkNode right;
	public TreeLinkNode next;

	public TreeLinkNode(int x) {
		val = x;
	}
	public String toString(){
		String s = "";
		Queue<TreeLinkNode> q = new LinkedList<TreeLinkNode>();
		TreeLinkNode root = this;
		q.add(root);
		while(!q.isEmpty()){
			TreeLinkNode t = q.poll();
			s += t.val + " ";
			if(t.left != null)
				q.add(t.left);
			while(t.next != null){
				t = t.next;
				s += t.val + " ";
			}
			s += "\n";
		}
		
		return s;
	}
}
