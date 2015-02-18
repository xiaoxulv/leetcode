package twoSum;

import java.util.HashMap;

public class Solution {
	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < numbers.length; i++){
			if(!map.containsKey(numbers[i]))
				map.put(target-numbers[i], i);
		}
		for(int i = 0; i < numbers.length; i++){
			if(map.containsKey(numbers[i]))
				if(map.get(numbers[i]) != i)// self double not allowed
					return new int[]{i + 1, map.get(numbers[i]) + 1};//index not 0 base
		}
		return new int[2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		int []a = {1,3,5};
		System.out.println(test.twoSum(a, 6)[0]);
		System.out.println(test.twoSum(a, 6)[1]);
	}

}
