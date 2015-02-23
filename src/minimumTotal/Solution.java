package minimumTotal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	//bottom up dp
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null) return 0;
        int s = triangle.size()-1;
        int[][] dp = new int[s+1][s+1];
        
        for(int i = 0; i <= s; i++){
        	dp[s][i] = triangle.get(s).get(i);
        }
        for(int i = s-1; i >= 0; i--){
        	for(int j = 0; j <= i; j++){
        		dp[i][j] = triangle.get(i).get(j)+
        				Math.min(dp[i+1][j], dp[i+1][j+1]);
        		//System.out.println(dp[i][j]);
        	}
        }
        
        return dp[0][0];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		List<List<Integer>> a = new ArrayList<List<Integer>>();
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(2);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(3);
		l2.add(4);
		List<Integer> l3 = new ArrayList<Integer>();
		l3.add(6);
		l3.add(5);
		l3.add(7);
		List<Integer> l4 = new ArrayList<Integer>();
		l4.add(4);
		l4.add(1);
		l4.add(8);
		l4.add(3);
		
		a.add(l1);
		a.add(l2);
		a.add(l3);
		a.add(l4);
		System.out.println(test.minimumTotal(a));
	}

}
