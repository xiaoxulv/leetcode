package isPalindrome_string;

public class Solution {
    public boolean isPalindrome(String s) {
    	if(s.length() == 0)
    		return true;
    	s = s.toLowerCase();
    	s = s.replaceAll("\\p{Punct}+", "");
    	s = s.replaceAll("\\s+", "");
    	//System.out.println(s);
    	boolean f = true;
    	int left = 0;
    	int right = s.length()-1;
    	while(left < right && f){
			if(s.charAt(left) == s.charAt(right)){
				left++;
				right--;
			}
			else
				f = false;	
		}
    	return f;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.isPalindrome("A man, a plan, a canal: Panama"));
		
	}

}
