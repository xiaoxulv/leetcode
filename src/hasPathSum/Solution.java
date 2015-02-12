package hasPathSum;

import util.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
        	return false;
        if(root.val == sum&&root.left == null&&root.right == null)
        	return true;
        return hasPathSum(root.left,sum - root.val)||
        		hasPathSum(root.right, sum- root.val);

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		TreeNode a = new TreeNode(3);
		TreeNode b = new TreeNode(7);
		TreeNode c = new TreeNode(1);
		TreeNode d = new TreeNode(9);
		root.left = a;
		root.right = b;
		a.left = c;
		b.right = d;
		Solution test = new Solution();
		System.out.println(test.hasPathSum(root, 5));
	}

}
