package minDepth;


import util.TreeNode;

public class Solution {
    public int minDepth(TreeNode root) {
//        if(root == null)
//        	return Integer.MAX_VALUE;
//        if(root.left == null && root.right == null)
//        	return 1;
//        int l = minDepth(root.left);
//        int r = minDepth(root.right);
//      
//        return Math.min(l,r)+1;
    	if(root == null)
    		return 0;
    	int l = 1 + minDepth(root.left);
    	int r = 1 + minDepth(root.right);
    	if(l == 1)
    		return r;
    	if(r == 1)
    		return l;
    	return Math.min(l,r);
  
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
		System.out.println(test.minDepth(root));
	}

}
