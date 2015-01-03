package nextPermutation;

public class Solution {
	public void nextPermutation(int[] num) {
		int len = num.length;
		int i = len-2;
		for(; i >= 0 ; i--){
			if(num[i] < num[i+1]){
				int k = len-1;
				while(num[k] <= num[i])
					k--;
				swap(i, k, num);
				reverse(i+1, len-1, num);
				return;
			}
		}
		reverse(0, len-1, num);
		return;
	}

	private void swap(int i, int j, int[] num){
		int temp = num[j];
		num[j] = num[i];
		num[i] = temp;
	}
	private void reverse(int i, int j, int[] num){
		while(i <= j){
			swap(i, j ,num);
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		int[] num = {4,3,2};
		test.nextPermutation(num);
	    for(int i = 0; i < num.length; i++)
	    	System.out.println(num[i]);
	}

}
