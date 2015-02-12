package pathSum;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
		find(root, sum, res, cur);
		return res;
    }
    public void find(TreeNode root, int sum, List<List<Integer>> res , List<Integer> cur){
		if(root == null) return;
		cur.add(root.val);
		if(root.val == sum && root.left == null && root.right == null){
			res.add(new ArrayList<Integer>(cur));
		}
		else{
			find(root.left, sum-root.val, res, cur);
			find(root.right, sum-root.val, res, cur);
		}
		cur.remove(cur.size()-1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		TreeNode root = new TreeNode(5);
		TreeNode a = new TreeNode(3);
		TreeNode b = new TreeNode(7);
		TreeNode c = new TreeNode(13);
		TreeNode d = new TreeNode(9);
		root.left = a;
		root.right = b;
		a.left = c;
		b.right = d;
		System.out.println(test.pathSum(root, 21));
	}

}
