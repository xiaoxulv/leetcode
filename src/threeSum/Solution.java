package threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	// 2 pointers, timeO(n^2), space(n)
	public List<List<Integer>> threeSum(int[] num) {
    	Arrays.sort(num);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i = 0; i < num.length-2; i++){
        	if(i != 0 && num[i-1] == num[i])
        		continue;// avoid duplicate here
        	int left = i+1, right = num.length-1; // 2 pointers
        	int sum = 0 - num[i];
        	while(left < right){
        		// now doing the same as two sum
        		if(num[left] + num[right] == sum){
        			res.add(Arrays.asList(num[i], num[left], num[right]));
        			// avoid duplicate here too
        			while(left < right && num[left] == num [left+1])
        				left++;
        			while(left < right && num[right] == num[right-1])
        				right--;
        			left++;
        			right--;
        		}
        		else if(num[left] + num[right] < sum)
        			left++;
        		else
        			right--;
        	}
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		int[] num = {-1,0,1,2,-1,-4};
		System.out.println(test.threeSum(num));
	}

}
