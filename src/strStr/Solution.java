package strStr;

public class Solution {
    public int strStr(String haystack, String needle) {
        //return haystack.indexOf(needle);
    	if(haystack.isEmpty() && needle.isEmpty())
    		return 0;
    	if(needle.isEmpty())
    		return 0;
    	if(haystack.isEmpty())
    		return-1;
    	int n = haystack.length();
    	int m = needle.length();
    	int i = 0;
    	int k = 0;
    	for(; i < n-m+1; i++){
    		k = i;
    		int j = 0;
    		while(j < m && k < n && haystack.charAt(k) == needle.charAt(j)){
    			j++;
    			k++;
    			if(j == m)
    				return i;
    		}
    	}
    	return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.strStr("abcdefg", "dyfdsfdf"));
	}

}
