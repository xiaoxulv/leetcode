package searchInsert;

public class Solution {
	public int searchInsert(int[] A, int target) {
		if(A.length == 0)
			return 0;
		int low = 0;
		int high = A.length-1;
		int mid = 0;
		while(low <= high){
			mid = low + (high - low)/2;
			if(A[mid] == target)
				return mid;
			if(A[mid] < target)
				low = mid + 1;
			if(A[mid] > target)
				high = mid - 1;
		}
		return low;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		int []A = {1,3,5,7};
		int t = 2;
		System.out.println(test.searchInsert(A, t));
	}

}
