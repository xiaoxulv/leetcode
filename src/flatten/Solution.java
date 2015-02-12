package flatten;

import java.util.Stack;

import util.TreeNode;

public class Solution {
	// straight forward recursion
	public void flatten(TreeNode root) {
        if(root == null) return;
        
        if(root.left != null){
        	TreeNode tmp = root.right;
        	root.right = root.left;
        	root.left = null;
        	flatten(root.right);
        	TreeNode rightest = root.right;
        	while(rightest.right != null){
        		rightest = rightest.right;
        	}
        	rightest.right = tmp;	
        }
        flatten(root.right);
    }
	// elegant approach using a stack
	public void flattenStack(TreeNode root) {
        if(root == null) return;
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        while(!s.isEmpty()){
        	TreeNode cur = s.pop();
        	if(cur.right != null)
        		s.push(cur.right);
        	if(cur.left != null)
        		s.push(cur.left);
        	if(!s.isEmpty())
        		cur.right = s.peek();
        	cur.left = null;
        }
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
		//test.flatten(root);
		test.flattenStack(root);
		System.out.println(root);
	}

}
