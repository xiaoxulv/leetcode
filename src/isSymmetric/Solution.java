package isSymmetric;

import util.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        	if(root == null) return true;
        	if(root.left == null && root.right == null)
        		return true;
        	if(root.left == null && root.right != null)
        		return false;
        	if(root.left != null && root.right == null)
        		return false;
        	if((root.left.left == root.right.right) &&
        			(root.left.right == root.right.left))
        		return true;
        	return isSymmetric(root.left)&&isSymmetric(root.right);		
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
