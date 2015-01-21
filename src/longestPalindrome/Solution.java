package longestPalindrome;

public class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0||s.length() == 1)
        	return s;
    	String longest = s.substring(0,1);

        for(int i = 0; i < s.length()-1; i++){
        	if(maxExpandCenter(s, i, i).length() > longest.length())
        		longest = maxExpandCenter(s, i, i);
     
        	if(maxExpandCenter(s, i, i+1).length() > longest.length())
        		longest = maxExpandCenter(s, i, i+1);
        }
        return longest;
    }

    public String maxExpandCenter(String s, int i, int j){
    	while(i >= 0&& j <= s.length()-1 && s.charAt(i) == s.charAt(j)){
    		i--;
    		j++;
    	}
    	return s.substring(i+1, j);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cdfsa"; 
		Solution test = new Solution();
		System.out.println(test.longestPalindrome(s));
	}

}
