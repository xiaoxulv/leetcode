package subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	// iteration
	public List<List<Integer>> subsets(int[] S) {
		Arrays.sort(S);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		res.add(new ArrayList<Integer>());
		for (int i = S.length - 1; i >= 0; i--) {
			for (int j = res.size() - 1; j >= 0; j--) {
				ArrayList<Integer> in = new ArrayList<Integer>();
				in.add(S[i]);
				in.addAll(res.get(j));
				res.add(in);
			}
		}
		return res;
	}

	// recursion
	public List<List<Integer>> subset(int[] S) {
		Arrays.sort(S);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		LinkedList<Integer> in = new LinkedList<Integer>();
		helper(res, in, S, 0);
		return res;
	}
	private void helper(List<List<Integer>> res, LinkedList<Integer> in,
			int[] s, int index) {
		if (s.length == index) {
			res.add(new ArrayList<Integer>(in));
			return;
		}
		in.add(s[index]);
		helper(res, in, s, index + 1);
		in.removeLast();
		helper(res, in, s, index + 1);
	}
	
	
	//bit manipulation
	public List<List<Integer>> sub(int[] S){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		int max = 1<<S.length;
		for(int i = 0; i < max; i++){
			ArrayList<Integer> in = convert(i,S);
			res.add(in);
		}
		return res;
	}
	private ArrayList<Integer> convert(int n, int[] S){
		ArrayList<Integer> res = new ArrayList<Integer>();
		int index = 0;
		for(int i = n; i > 0; i>>=1){
			if((i&1) ==1)
				res.add(S[index]);
			index++;
		}
		return res;	
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = { 2, 3, 1 };
		Solution test = new Solution();
		System.out.println(test.subset(n));
		System.out.println(test.subsets(n));
		System.out.println(test.sub(n));
	}

}
