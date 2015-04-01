package hammingWeight;

public class Solution {
    public int hammingWeight(int n) {
    	int count = 0;
		while (n > 0) {
			n &= n - 1;
			count++;
		}
		return count;
    }
    public int hammingWeight2(int n) {
        int count = 0;
        for (; n != 0; n &= n-1){
        	count++;
    }
    return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.hammingWeight(2147483647));
		System.out.println(test.hammingWeight2(2147483647));
		
	}

}
