package maxSubArray;

public class Solution {
	//dp O(n)
    public int maxSubArray(int[] A) {	
    	if(A.length == 0)
    		return 0;
    	int sum = 0;
    	int res = A[0];
    	for(int i = 0; i < A.length; i++){
    		if(A[i] + sum >= A[i])
    			sum += A[i];
    		else
    			sum = A[i];
    		if(sum > res)
    			res = sum;
    		//System.out.println(res);
    	}
    	return res;
    }
    //divide and conquer
    public int MaxSubArray(int[] A){
    	if(A.length == 0)
    		return 0;
    	int res = A[0];
    	
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		int a[]  = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(test.maxSubArray(a));
		
	}

}
