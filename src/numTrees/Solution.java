package numTrees;

public class Solution {
    public int numTrees(int n) {
        int []count = new int[n+1];
        count[0] = 1;
        count[1] = 1;
        for(int i = 2; i <= count.length-1; i++)
        	for(int j = 0 ; j < i; j++)
        		count[i] += count[j] * count[i-1-j];
        return count[n];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.numTrees(4));
	}

}
