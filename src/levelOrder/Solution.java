package levelOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import util.TreeNode;

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> inner = new ArrayList<Integer>();
		Queue<TreeNode> cur = new LinkedList<TreeNode>();
		Queue<TreeNode> next = new LinkedList<TreeNode>();

		if(root == null)
			return res;
		
		cur.add(root);
		while(!cur.isEmpty()){
			TreeNode t = cur.poll();
			inner.add(t.val);
	
			if(t.left != null)
				next.add(t.left);
			if(t.right != null)
				next.add(t.right);
			if(cur.isEmpty()){
				//System.out.println(res);
				res.add(new ArrayList<Integer> (inner));
				//res.add(inner);
				inner.clear();
				cur.addAll(next);
				next.clear();
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
//		TreeNode root = new TreeNode(3);
//		TreeNode a = new TreeNode(5);
//		TreeNode b = new TreeNode(7);
//		TreeNode c = new TreeNode(8);
//		TreeNode d = new TreeNode(9);
//		root.left = a;
//		root.right = b;
//		a.right = c;
//		b.right = d;
		System.out.println(test.levelOrder(null));
	}

}
