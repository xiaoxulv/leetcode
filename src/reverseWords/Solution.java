package reverseWords;

public class Solution {
	public String reverseWords(String s) {
		s = " " + s.trim();//add space for easy check 
		String t = "";
		int end = s.length()-1;
		int start = s.length()-1;
		while(start >= 0){//from end to start
			if(s.charAt(start) != ' ')
				start--;
			else{
				t += s.substring(start+1, end+1) + " ";//need to romove last space
				start--;
				end = start;
				}	
		}
		return t.substring(0, t.length()-1).replaceAll("\\s+", " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.reverseWords("I am not coding!"));
		System.out.println(test.reverseWords("   b   a"));
	}

}
