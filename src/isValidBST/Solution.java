package isValidBST;

import util.TreeNode;

public class Solution {

	int prev = Integer.MIN_VALUE;
	boolean first = true;
	public boolean isValidBST(TreeNode root) {
		if(root == null)
			return true;
		if(!isValidBST(root.left))
			return false;
		if(prev >= root.val && !first)
			return false;
		prev = root.val;
		first = false;
		if(!isValidBST(root.right))
			return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		TreeNode root = new TreeNode(5);
		TreeNode a = new TreeNode(3);
		TreeNode b = new TreeNode(7);
		TreeNode c = new TreeNode(1);
		TreeNode d = new TreeNode(9);
		root.left = a;
		root.right = b;
		a.left = c;
		b.right = d;
		System.out.println(test.isValidBST(root));
		Solution test1 = new Solution();
		System.out.println(test1.isValidBST(root));
	
	}

}
