package findMin;

import util.ListNode;

public class Solution {
	public int findMin(int[] num) {
		int start = 0;
		int end = num.length-1;
		
		while(start <= end){
			int mid = (start + end) / 2;
			if(num[start] > num[mid]){
				end = mid;
				continue;
			}	
			if(num[mid] > num[end]){
				start = mid + 1;
				continue;
			}
			else 
				break;
		}
	
		return num[start];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		int []a = new int[6];
		a[0] = 2;
		a[1] = 3;
		a[2] = 4;
		a[3] = 5;
		a[4] = 6;
		a[5] = 1;

		System.out.println(test.findMin(a));
	}

}
