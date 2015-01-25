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
	}

}
