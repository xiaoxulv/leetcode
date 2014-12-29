package longestCommonPrefix;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		int num = strs.length;
		if(num == 0)
			return "";
		if(num == 1)
			return strs[0];
		int i = 0;
		String pre = strs[0];
		for(; i < num; i++){
			int j = 0;
			int min = Math.min(pre.length(), strs[i].length());
			for(; j < min ;j++){
				if(pre.charAt(j) != strs[i].charAt(j))
					break;
			}
			pre = pre.substring(0, j);
		}
		return pre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		String[] s = {"abcd", "abc","abcde"};
		String[] s1 = {"a", "a"};
		System.out.println(test.longestCommonPrefix(s1));
	}

}
