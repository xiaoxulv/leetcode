package minDistance;

public class Solution {
	// recursive TLE!!!!
/*    public int minDistance(String word1, String word2) {
    	if(word1 == "" && word2 == "") return 0;
        return minDis(word1, word1.length()-1, word2, word2.length()-1);
    }
    public int minDis(String word1, int len1, String word2, int len2){
    	if(len1 == 0) return len2;
    	if(len2 == 0) return len1;
    	int cost = 0;
    	if(word1.charAt(len1) != word2.charAt(len2))
    		cost = 1;
    	int delete = minDis(word1, len1-1, word2, len2) + 1;
    	int insert = minDis(word1, len1, word2, len2-1) + 1;
    	int sub = minDis(word1, len1-1, word2 ,len2-1) + cost;
    	
    	return min(delete, insert, sub);
    }
*/
    public int min(int a, int b, int c){
    	return Math.min(Math.min(a, b), c);
    }

	public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        
        int[][] dp = new int[n+1][m+1];
        for(int i = 0; i< m+1; i++)
            dp[0][i] = i; 
        for(int i = 0; i<n+1; i++)
            dp[i][0] = i;
        
        for(int i = 1; i < n+1; i++){
            for(int j=1; j < m+1; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else
                    dp[i][j] = 1 + min(dp[i-1][j-1], dp[i-1][j], dp[i][j-1]);   
            }
        }
        return dp[n][m];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.minDistance("asda", "addasd"));
	}

}
