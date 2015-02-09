package anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {
    public List<String> anagrams(String[] strs) {
        List<String> res = new ArrayList<String>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        
        for(String s : strs){
        	char[] ch = s.toCharArray();
        	Arrays.sort(ch);
        	String str = new String(ch);
        	System.out.println(ch);
        	if(map.containsKey(str))
        		map.get(str).add(s);
        	else{
        		List<String> list = new ArrayList<String>();
        		list.add(s);
        		map.put(str, list);
        		System.out.println("!!!!!");
        	}
        }
        
        for(List<String> l : map.values()){
        	if(l.size() > 1){
        		res.addAll(l);
        		System.out.println("!!");
        	}
        }
        return res;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		String[] strs = {"and", "dan"};
		System.out.println(test.anagrams(strs));
		
	}

}
