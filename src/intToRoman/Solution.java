package intToRoman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;



public class Solution {
	public String intToRoman(int num) {
		HashMap<Integer, String> roman = new HashMap<Integer, String>();
		roman.put(1, "I");
		roman.put(5, "V");
		roman.put(10, "X");
		roman.put(50, "L");
		roman.put(100, "C");
		roman.put(500, "D");
		roman.put(1000, "M");
		roman.put(4, "IV");
		roman.put(9, "IX");
		roman.put(40, "XL");
		roman.put(90, "XC");
		roman.put(400, "CD");
		roman.put(900, "CM");
		Set<Integer> key = roman.keySet();
		List<Integer> k = new ArrayList<Integer>();
		for(Integer i : key)
			k.add(i);
		Collections.sort(k);
		Collections.reverse(k);
		String res = "";
		for(int i = 0; i < roman.size(); i++){
			while(k.get(i) <= num){
				num -= k.get(i);
				res += roman.get(k.get(i));
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.intToRoman(3333));
	}

}
