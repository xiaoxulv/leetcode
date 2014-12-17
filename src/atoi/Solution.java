package atoi;

public class Solution {
	public int atoi(String str) {
		str = str.trim();
		if (str.isEmpty())
			return 0;
		double res = 0;
		char sign = '+';
		int i = 0;
		if (str.charAt(i) == '+') {
			i++;
		} else if (str.charAt(i) == '-') {
			i++;
			sign = '-';
		}
		for (; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				res = 10 * res + (str.charAt(i) - '0');
			else
				break;
		}

		if (str.isEmpty())
			return 0;
		if (sign == '-')
			res = -res;
		return (int) res;
	}

	public int atoi2(String str) {
		str = str.trim();
		if (str.isEmpty())
			return 0;
		int res = 0;
		boolean neg = false;
		boolean overflow = false;
		int i = 0;
		if (str.charAt(i) == '+') {
			i++;
		} else if (str.charAt(i) == '-') {
			i++;
			neg = true;
		}
		while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			int d = str.charAt(i) - '0';
			if (res >= 214748364) {
				if ((!neg && d >= 7) || (neg && d >= 8) || (res >= 1000000000)) {
					overflow = true;
					break;
				}
			}
			res = res * 10 + d;
			i++;
		}

		System.out.println(overflow);
		if (str.isEmpty())
			return 0;
		if (overflow) {
			if (!neg)
				return Integer.MAX_VALUE;
			if (neg)
				return Integer.MIN_VALUE;
		}
		if (!overflow && neg)
			res = -res;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		// System.out.println(test.atoi2("   98*&"));
		// System.out.println(test.atoi2("     +-2  "));
		// System.out.println(test.atoi2("   (&*^&"));
		// System.out.println(test.atoi2("  -2147483649"));
		System.out.println(test.atoi2("-2147483647"));
		// System.out.println(test.atoi2("1"));
		// System.out.println(Long.MAX_VALUE);
		// System.out.println(Integer.MAX_VALUE/10);
		// System.out.println(test.atoi2("   9223372036854775809092384509"));

	}

}
