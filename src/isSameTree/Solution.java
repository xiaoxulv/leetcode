package isSameTree;

import util.TreeNode;

public class Solution {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null)
			return true;
		if(p == null && q!= null)
			return false;
		if(p != null && q == null)
			return false;
		if(p.val != q.val)
			return false;
		return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		TreeNode root = new TreeNode(3);
		TreeNode a = new TreeNode(5);
		TreeNode b = new TreeNode(7);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(5);
		TreeNode e  = new TreeNode(7);
		root.left = a;
		root.right = b;
		c.left = d;
		c.right = e;
		System.out.println(test.isSameTree(root, c));
	}

}
