package divide;

public class Solution {
	public int divide(int dividend, int divisor) {
        boolean neg = (dividend>0&&divisor<0) || (dividend<0&&divisor>0);
        long res = 0;
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);// Integer.Min_Value....
        while(a >= b){
        	int shift = 0;
            while ((b << shift) <= a) 
            	shift++;
        	res += 1<<(shift-1);
        	a -= b<<(shift-1);
        }
        //System.out.println(res);
        if(dividend == Integer.MIN_VALUE && divisor == -1)
        	return Integer.MAX_VALUE;
        if(res > Integer.MAX_VALUE)
        	return Integer.MAX_VALUE;
        if(neg) res = -res;
        return (int)res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		//System.out.println(test.divide(14, 3));
		//System.out.println(test.divide(15, 3));
		System.out.println(test.divide(-2147483648, -1));//max
		System.out.println(test.divide(-2147483648, 1));//min
		
	}

}
