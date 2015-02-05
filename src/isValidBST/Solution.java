package isValidBST;

import util.TreeNode;

public class Solution {
	static TreeNode prev = null;
	public boolean isValidBST(TreeNode root) {
		if(root == null)
			return true;
		if(!isValidBST(root.left))
			return false;
		if(prev != null)
			if(prev.val >= root.val)
				return false;
		prev = root;
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
	}

}
