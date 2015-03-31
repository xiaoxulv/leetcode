package searchWithDup;

public class Solution {
	 public boolean search(int[] A, int target) {
		 	int len = A.length;
	        int left = 0;
	        int right = len-1;
	        int mid;
	        while(left <= right){
	        	mid = left + (right-left)/2;
	        	if(A[mid] == target)
	        		return true;
	        	if(A[right] > A[mid]){
	        		 if(A[left] <= target && A[mid] > target)
	        			 right = mid;
	        		 else
	        			 left = mid+1;
	        	}
	        	else if(A[right] < A[mid]){
	       		 if(A[mid] < target && A[right] >= target)
	    			 left = mid+1;
	    		 else
	    			 right = mid;
	        	}
	        	else{
	        		right--;
	        	}
	        }
	    	return A[left]==target ;
 }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,3};
		Solution test = new Solution();
		System.out.println(test.search(a,3));
	}

}
