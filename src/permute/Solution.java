package permute;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> permute(int[] num) {
		List<List<Integer>> out = new ArrayList<List<Integer>>();
		List<Integer> in = new ArrayList<Integer>();
		boolean[] vis = new boolean[num.length];
		permute(num, 0, vis, in, out);
		return out;
	}

	public void permute(int[] num, int depth, boolean[] visit,
			List<Integer> cur, List<List<Integer>> out) {
		if (depth == num.length) {
			out.add(new ArrayList<Integer>(cur));
			//cur.clear();
			

		} else {
			for (int i = 0; i < num.length; i++) {
				if(!visit[i]){
					visit[i] = true;
					cur.add(num[i]);
					permute(num, depth+1, visit, cur, out);
					visit[i] = false;
					cur.remove(new Integer(num[i]));
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		int[] num = { 1, 2, 3, 4 };
		System.out.println(test.permute(num));

	}

}
