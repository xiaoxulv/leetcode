package zigzagLevelOrder;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Solution {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	    List<List<Integer>> out = new ArrayList<List<Integer>>();  
	    List<Integer> in = new ArrayList<Integer>();
		Stack<TreeNode> cur = new Stack<TreeNode>();
		Stack<TreeNode> next = new Stack<TreeNode>();
	
		boolean lr = true;
		
		if(root == null)
			return out;
		cur.add(root);
		while(!cur.isEmpty()){
			TreeNode t = cur.pop();
			in.add(t.val);
			if(lr){
				if(t.left != null)
					next.push(t.left);
				if(t.right != null)
					next.push(t.right);
			}
			else{
				if(t.right != null)
					next.push(t.right);
				if(t.left != null)
					next.push(t.left);
			}
			
			if(cur.isEmpty()){
				cur.addAll(next);
				next.clear();
				out.add(new ArrayList<Integer>(in));
				in.clear();
				lr = !lr;
			}
		}
		return out;
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
		a.left = c;
		a.right = d;
		System.out.println(test.zigzagLevelOrder(root));
	}
}
