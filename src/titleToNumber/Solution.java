package titleToNumber;

public class Solution {
	public int titleToNumber(String s) {
		int len = s.length();
		int res = 0;
		for(int i = 0; i < len ; i++){
			int t = s.charAt(i) - 'A' + 1;
			res = res * 26 + t;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.titleToNumber("AB"));
	}

}
