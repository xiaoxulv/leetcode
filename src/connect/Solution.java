package connect;

import java.util.LinkedList;
import java.util.Queue;

import util.TreeLinkNode;

public class Solution {
	// assume it is a perfect binary tree
	public void connect(TreeLinkNode root) {
		if (root == null)
			return;
		if (root.left != null)
			root.left.next = root.right;
		if (root.right != null && root.next != null)
			root.right.next = root.next.left;
		connect(root.left);
		connect(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		TreeLinkNode a = new TreeLinkNode(1);
		TreeLinkNode b = new TreeLinkNode(2);
		TreeLinkNode c = new TreeLinkNode(3);
		TreeLinkNode d = new TreeLinkNode(4);
		TreeLinkNode e = new TreeLinkNode(5);
		TreeLinkNode f = new TreeLinkNode(6);
		TreeLinkNode g = new TreeLinkNode(7);
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = g;
		test.connect(a);
		System.out.println(a.toString());
	}

}
