package pow;

public class Solution {
	public double pow(double x, int n) {
		if(n == 0)
			return 1.0;
		double bi = pow(x, n/2);// avoid stack overflow
		if(n % 2 == 0)
			return bi * bi;
		else if(n > 0)
			return bi * bi * x;
		else
			return bi * bi / x;	
	}
	// more elegant version
	//Consider the binary representation of n. 
	//For example, if it is "10001011", then x^n = x^(1+2+8+128) = x^1 * x^2 * x^8 * x^128. 
	//Thus, we don't want to loop n times to calculate x^n. //
	//To speed up, we loop through each bit, if the i-th bit is 1, then we add x^(1 << i) to the result. 
	//Since (1 << i) is a power of 2, x^(1<<(i+1)) = square(x^(1<<i)). 
	//The loop executes for a maximum of log(n) times.
	public double pow1(double x, int n){
		if(n == 0)
			return 1.0;
		if(n < 0)
			return 1/pow(x, -n);
		double res = 1.0;
		while(n > 0){
			if((n&1) > 0)
				res *= x;
			n = n>>1;
			x *= x;	
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.pow1(2,5));
	}

}
