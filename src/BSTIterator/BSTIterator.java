package BSTIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import util.TreeNode;

public class BSTIterator {
	Stack<TreeNode> s;
	public BSTIterator(TreeNode root) {
        s = new Stack<TreeNode>();
        while(root != null){
        	s.push(root);
        	root = root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !s.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode t = s.pop();
    	int res = t.val;
    	if(t.right != null){
    		t = t.right;
    		while(t != null){
    			s.push(t);
    			t = t.left;
    		}
    	}
        return res;
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
		List<Integer> list = new LinkedList<Integer>();
		BSTIterator i = new BSTIterator(root);
		while (i.hasNext()) 
			list.add(i.next());
		System.out.println(list);
	}

}
