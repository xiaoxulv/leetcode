package generate;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i = 0; i < numRows; i++){
        	ArrayList<Integer> in = new ArrayList<Integer>();
        	in.add(1);
        	if(i != 0){
        		for(int j = 0; j < i-1; j++)
        			in.add(res.get(i-1).get(j)+res.get(i-1).get(j+1));
        		in.add(1);
        	}
        	res.add(in);
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.generate(5));
	}

}
