package singleNumber;

public class Solution {
	public int singleNumber(int[] A) {
		int res = 0;
		for(int i = 0; i < A.length; i++)
			res = res^A[i];
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		int []a = {1,2,3,2,1};
		System.out.println(test.singleNumber(a));
	}

}
