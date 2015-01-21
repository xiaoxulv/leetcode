package singleNumberII;

public class Solution {
	public int singleNumber(int[] A) {
		int n = A.length;
		int count[] = new int[32];
		int res = 0;
		for (int i = 0; i < 32; i++) {
			for (int j = 0; j < n; j++) {
				if (((A[j] >> i) & 1) == 1)
					count[i]++;
			}
			res |= ((count[i] % 3) << i);
		}
		return res;
	}

	public int singleNumberII(int[] A) {
		int n = A.length;
		int ones = 0, twos = 0, threes = 0;
		for (int i = 0; i < n; i++) {
			threes = twos & A[i]; // 已经出现两次并且再次出现
			twos = twos | (ones & A[i]); // 曾经出现两次的或者曾经出现一次但是再次出现的
			ones = ones | A[i]; // 出现一次的

			twos = twos & ~threes; // 当某一位出现三次后，我们就从出现两次中消除该位
			ones = ones & ~threes; // 当某一位出现三次后，我们就从出现一次中消除该位
		}

		return ones; // twos, threes最终都为0. ones是只出现一次的数

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		int[] a = { 5, 5, 6, 5 };
		System.out.println(test.singleNumber(a));
		System.out.println(test.singleNumberII(a));
	}

}
