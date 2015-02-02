package sortedArrayToBST;

import util.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        return helper(num, 0, num.length-1);
    }
    public TreeNode helper(int[] num, int start, int end){
    	if(end < start)
    		return null;
    	int mid = (start+end)/2;
    	TreeNode t = new TreeNode(num[mid]);
    	t.left = helper(num, start, mid-1);
    	t.right = helper(num, mid+1, end);
    	return t;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		int[] n = {1,2,3,4,5,6,7};
		System.out.println(test.sortedArrayToBST(n).toStringlevel());
	}

}
