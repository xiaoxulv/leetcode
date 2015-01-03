package generateParenthesis;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<String>();
		String str = "";
		genParen(n, n, str, list);
		return list;
	}
	public void genParen(int l, int r, String s, List<String> list){
		if(l == 0 && r == 0)
			list.add(s);
		if(l > 0)
			genParen(l-1, r, s+"(", list);
		if(l < r && r > 0)
		//if(r > 0)
			genParen(l, r-1, s+")", list);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.generateParenthesis(3));
	}

}
