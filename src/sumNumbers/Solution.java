package sumNumbers;

import util.TreeNode;

public class Solution {
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
        
    }
    public int helper(TreeNode root, int sum){
    	if(root == null) return 0;
    	if(root.left == null && root.right == null)
    		return sum*10 + root.val;
    	return helper(root.left, root.val+sum*10) + helper(root.right, root.val+sum*10);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		TreeNode root = new TreeNode(1);
		TreeNode a = new TreeNode(2);
		TreeNode b = new TreeNode(3);
		TreeNode c = new TreeNode(4);
		TreeNode d = new TreeNode(5);
		TreeNode e = new TreeNode(6);
		root.left = a;
		root.right = b;
		a.left = c;
		b.left = d;
		b.right = e;
		System.out.println(test.sumNumbers(root));
	}

}
