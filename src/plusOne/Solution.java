package plusOne;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] plusOne(int[] digits) {
    	if(digits == null||digits.length == 0)
    		return digits;
    	int carry = 1;
    	for(int i = digits.length-1; i >= 0; i--){
    		int tmp = carry+digits[i];
    		carry = tmp/10;
    		digits[i] = tmp%10;
    		if(carry == 0)
    			return digits;
    	}
    	int []res = new int[digits.length+1];
    	res[0] = 1;
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		int a[] = {1,2,3};
		int []r = test.plusOne(a);
		for(int i = 0 ; i < r.length; i++)
			System.out.println(r[i]);
	}

}
