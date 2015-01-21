package maxDepth;

import util.TreeNode;

public class Solution {
	public int maxDepth(TreeNode root) {
        if(root == null)
        	return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return Math.max(l, r)+1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		TreeNode root = new TreeNode(3);
		TreeNode a = new TreeNode(5);
		TreeNode b = new TreeNode(7);
		TreeNode c = new TreeNode(8);
		TreeNode d = new TreeNode(9);
		root.left = a;
		root.right = b;
		a.right = c;
		b.right = d;
		System.out.println(test.maxDepth(root));
	}

}
