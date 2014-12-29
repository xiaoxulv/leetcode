package isValid;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty())
        	return true;
        Stack<Character> stack = new Stack<Character>();
        char p;
        for(int i = 0; i < s.length(); i++){
        	char cur = s.charAt(i);
        	if(cur == '(' || cur == '[' || cur == '{')
        		stack.push(cur);
        	if(cur == ')' || cur == ']' || cur == '}'){
        		if(stack.isEmpty())
        			return false;
        		p = stack.pop();
        		if(cur == ')' && p != '(')
        			return false;
        		if(cur == ']' && p != '[')
        			return false;
        		if(cur == '}' && p != '{')
        			return false;
        	}
        }
        if(stack.isEmpty())
    	    return true;
        else
    	    return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		String s = "[{)}]";
		System.out.println(test.isValid(s));
	}

}
