package climbStairs;

public class Solution {
    public int climbStairs(int n) {
    	if(n == 0||n == 1) return 1;
        int count[] = new int[n+1];
        count[0] = 1;
        count[1] = 1;
        count[2] = 2;
        for(int i = 3; i <= n; i++)
        	count[i] = count[i-1] + count[i-2];
        return count[n];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.climbStairs(5));
	}

}
