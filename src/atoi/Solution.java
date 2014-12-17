package atoi;

public class Solution {
	public int atoi(String str) {
		str = str.trim();
		if(str.isEmpty())
			return 0;
		double res = 0;
		char sign = '+';
		int i = 0;
		if(str.charAt(i) == '+'){
			i++;
		}
		else if(str.charAt(i) == '-'){
			i++;
			sign = '-';
		}
		for(; i < str.length(); i++){
			if(Character.isDigit(str.charAt(i)))
				res = 10*res + (str.charAt(i) - '0');
			else
				break;
		}

		if(str.isEmpty())
			return 0;
		if(sign == '-')
			res = -res;
		return (int)res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.atoi("   98*&"));
		System.out.println(test.atoi("     +-2  "));
		System.out.println(test.atoi("   (&*^&"));
		System.out.println(test.atoi("  -2147483649"));
		System.out.println(test.atoi("1"));
		//System.out.println(Long.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(test.atoi("   9223372036854775809092384509"));
		
	}

}
