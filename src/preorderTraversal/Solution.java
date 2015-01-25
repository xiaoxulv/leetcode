package preorderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import util.TreeNode;

public class Solution {
	// recursive
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        helper(root, l);
        return l;
    }
    public void helper(TreeNode t, List<Integer> l){
    	if(t == null)
    		return;
    	l.add(t.val);
    	helper(t.left,l);
    	helper(t.right,l);
    }
    //iterative
    public List<Integer> preorderTraversalItera(TreeNode root) {
 
        List<Integer> l = new ArrayList<Integer>();
       	if(root == null) return l;
        LinkedList<TreeNode> s = new LinkedList<TreeNode>();
        while(root != null || !s.isEmpty()){
        	if(root != null){
        		s.push(root);
        		l.add(root.val);
        		root = root.left;
        	}
        	else{
        		root = s.pop();
        		root = root.right;
        	}
        }
        return l;
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
		System.out.println(test.preorderTraversal(root));
		System.out.println(test.preorderTraversalItera(root));
	}

}
