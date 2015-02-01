package inorderTraversal;

import java.util.ArrayList;
import java.util.List;


import util.TreeNode;

public class Solution {
	// recursive
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        visit(root, l);
        return l;
    }
    public static void visit(TreeNode t, List<Integer> l){
    	if(t == null)
    		return;
    	visit(t.left,l);
    	l.add(t.val);
    	visit(t.right,l);
    	
    }
    //iterative
   
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
		System.out.println(test.inorderTraversal(root));
	}

}
