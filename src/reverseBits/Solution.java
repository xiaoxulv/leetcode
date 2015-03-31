package reverseBits;

public class Solution {
    public int reverseBits(int n) {
        int res = 0;
		for(int i = 0; i < 32; i++){
			int t = n&1;
			res =  res<<1;
			res |= t;
			n >>= 1;
		}
		return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.reverseBits(4));
	}

}
