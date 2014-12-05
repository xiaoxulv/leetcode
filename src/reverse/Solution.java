package reverse;

public class Solution {
	public int reverse(int x) {
		int digit = 0;
		long res = 0;
		int copy = x;
		while(x != 0){
			digit = x % 10;
			x = x / 10;
			res = 10 * res + digit;
		}
		if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
			return 0;
		else
			return (int) (res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.reverse(0));
		System.out.println(test.reverse(1534236469));
		System.out.println(test.reverse(1000000003));
		System.out.println(test.reverse(-2147483412));
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);
	}

}
