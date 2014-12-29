package lengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0)
        	return 0;
        int len = s.length();
        int res = 0;
        int i = len-1;
        while(i >= 0){
        	if(s.charAt(i) == ' ')
        		i--;
        	else
        		break;
        }
        while(i >= 0){
        	if(s.charAt(i) != ' ')
        		res++;
        	else
        		break;
    		i--;
        }
        return res;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		String s = "a ";
		System.out.println(test.lengthOfLastWord(s));
	}

}
