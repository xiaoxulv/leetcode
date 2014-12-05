package minStack;

public class Solution {
	class MinStack {
		int s[] = new int[99999];
		int p = -1;
		int min = Integer.MAX_VALUE ;
	    public void push(int x) {
	        p++;
	        s[p] = x;
	        if(min > x)
	        	min = x;
	    }

	    public void pop() {
	        if(s[p] == min){
	        	if(p >= 1){
		        	min = s[p-1];
		        	for(int i = p-1; i >= 0; i--){
		        		if(s[i]< min)
		        			min = s[i];
		        	}
	        	}
		        else{//set to initial
		        	min = Integer.MAX_VALUE;
		        }
	        }
	        //real pop here
	    	p--; 
	    }

	    public int top() {
	    	return s[p];
	    }

	    public int getMin() {
	    	return min;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution test = new Solution();
		MinStack m = test.new MinStack();
		m.push(0);
		m.push(1);
		m.push(0);
		System.out.println(m.getMin());
		m.pop();
		System.out.println(m.getMin());

	}

}
