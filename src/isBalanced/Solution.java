package isBalanced;

import util.TreeNode;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
        	return true;
        if(Math.abs(depth(root.left) - depth(root.right)) > 1)
        	return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    public int depth(TreeNode root){
    	if(root == null)
    		return 0;
    	return Math.max(depth(root.left), depth(root.right))+1;
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
		System.out.println(test.isBalanced(root));
	}

}
