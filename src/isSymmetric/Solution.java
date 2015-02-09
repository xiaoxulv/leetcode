package isSymmetric;

import util.TreeNode;

public class Solution {
	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		return helper(root.left, root.right);
	}

	public boolean helper(TreeNode left, TreeNode right) {
		if (left == null)
			return right == null;
		if(right == null)
			return false;
		if(left.val != right.val)
			return false;
		if(!helper(left.left, right.right))
			return false;
		if(!helper(left.right, right.left))
			return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		TreeNode root = new TreeNode(5);
		TreeNode a = new TreeNode(3);
		TreeNode b = new TreeNode(7);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(7);
		root.left = a;
		root.right = b;
		a.left = c;
		b.right = d;
		System.out.println(test.isSymmetric(root));
	}

}
