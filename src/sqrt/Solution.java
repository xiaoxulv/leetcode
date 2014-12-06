package sqrt;

public class Solution {
	//return int instead of double...
	public int sqrt(int x) {
		if(x == 0)
			return 0;
		if(x == 1)
			return 1;
		long start = 0, end = x;
		while(start <= end){
			long mid = (start + end)/2;
			long guess = mid * mid;
			//System.out.println(guess);
			if(guess == x)
				return (int)mid;
			else if(guess > x)
				end = mid - 1;
			else//guess < x
				start = mid + 1;
				
		}
		return (int)(start + end)/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		//System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.sqrt(1579205274));
		//System.out.println(Math.sqrt(214431));	
		System.out.println(test.sqrt(1579205274));

	}

}
