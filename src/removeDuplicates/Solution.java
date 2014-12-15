package removeDuplicates;

public class Solution {
	public int removeDuplicates(int[] A) {
		if(A.length < 2)
			return A.length;
		int i = 0;
		int j = 1;
	 
		while (j < A.length) {
			if (A[i] == A[j]) {
				j++;
			} else {
				i++;
				A[i] = A[j];
				j++;
			}
		}
	 
		return i + 1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		int[] a = { 1, 2, 2, 3, 3, 4, 4 };
		int len = test.removeDuplicates(a);
		System.out.println(len);
		for (int i = 0; i < len; i++)
			System.out.println(i+" "+a[i]);

	}

}
