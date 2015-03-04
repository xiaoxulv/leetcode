package rotateArray;

public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
    	k = k%n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    public void reverse(int[] n, int start, int end){
    	while(start < end){
    		swap(n,start,end);
    		start++;
    		end--;
    	}
    }
    public void swap(int[] n, int i, int j){
    	int temp = n[i];
    	n[i] = n[j];
    	n[j] = temp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		int[] n = {1,2,3,4,5,6,7};
		test.rotate(n,3);
		for(int i = 0; i < n.length;i++)
			System.out.print(n[i]);
	}

}
