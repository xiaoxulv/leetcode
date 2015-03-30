package search;

public class Solution {
    public int search(int[] A, int target) {
        int len = A.length;
        int left = 0;
        int right = len-1;
        int mid;
        while(left <= right){
        	mid = left + (right-left)/2;
        	if(A[mid] == target)
        		return mid;
        	if(A[left] <= A[mid]){
        		 if(A[left] <= target && A[mid] > target)
        			 right = mid-1;
        		 else
        			 left = mid+1;
        	}
        	else if(A[left] > A[mid]){
       		 if(A[mid] < target && A[right] >= target)
    			 left = mid+1;
    		 else
    			 right = mid-1;
        	}
        }
    	return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,1};
		Solution test = new Solution();
		System.out.println(test.search(a,1));
	}

}
