package levelOrderBottom;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import util.TreeNode;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
    	List<Integer> inner = new ArrayList<Integer>();
    	Queue<TreeNode> cq = new LinkedList<TreeNode>();
    	Queue<TreeNode> nq = new LinkedList<TreeNode>();
    	Stack<List<Integer>> s = new Stack<List<Integer>>();
    	
    	if(root == null)
    		return res;
    	cq.add(root);
    	while(!cq.isEmpty()){
    		TreeNode t = cq.poll();
    		inner.add(t.val);
    	
    		if(t.left != null)
    			nq.add(t.left);
    		if(t.right != null)
    			nq.add(t.right);
    		if(cq.isEmpty()){
    			s.push(new ArrayList<Integer> (inner));
    			inner.clear();
    			cq.addAll(nq);
    			nq.clear();
    		}
    	}
    	//one more stack process than level order
    	while(!s.isEmpty()){
    		List<Integer> l = s.pop();
    		res.add(new ArrayList<Integer> (l));
    	}
        return res;
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
		//System.out.println(root.toString());
		//System.out.println(root.toStringlevel());
		System.out.println(test.levelOrderBottom(root));
	}

}
