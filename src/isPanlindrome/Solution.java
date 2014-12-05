package isPanlindrome;

public class Solution {
	//negative is non-panlindrome
	//no extra space, so not convert it to string
	public boolean isPalindrome(int x) {
		int digit = 0;
		long res = 0;
		int copy = x;
		boolean f;
		while(x != 0){
			digit = x % 10;
			x = x / 10;
			res = 10 * res + digit;
		}
		if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
			f = false;
		else
			f = true;
		if(f)
			if(copy == res && copy >= 0)
				return true;
		return false;
	}
	//just compare first and last digit
	boolean isPalindrome2(int x) {
		  if (x < 0) return false;
		  int div = 1;
		  while (x / div >= 10) {
		    div *= 10;
		  }        
		  while (x != 0) {
		    int l = x / div;
		    int r = x % 10;
		    if (l != r) return false;
		    x = (x % div) / 10;
		    div /= 100;
		  }
		  return true;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.isPalindrome2(0));
		System.out.println(test.isPalindrome2(-1));
		System.out.println(test.isPalindrome2(123));
		System.out.println(test.isPalindrome2(-123));
		System.out.println(test.isPalindrome2(12321));
		System.out.println(test.isPalindrome2(-1221));
		
	}

}
