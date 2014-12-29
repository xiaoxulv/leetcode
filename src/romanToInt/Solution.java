package romanToInt;

import java.util.HashMap;

public class Solution {
	public int romanToInt(String s) {
		int res = 0;
		if(s.length() == 0)
			return res;
		HashMap<Character, Integer> roman = new HashMap<Character, Integer>();
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);
		int i = s.length()-1;
		while(i >= 0){
			if(i == s.length()-1){
				res = roman.get(s.charAt(i));
				i--;
				continue;
			}
			if(roman.get(s.charAt(i)) >= roman.get(s.charAt(i+1)))
				res += roman.get(s.charAt(i));
			else
				res -= roman.get(s.charAt(i));
			i--;
			System.out.println(res);
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.romanToInt("DCXXI"));
	}

}
