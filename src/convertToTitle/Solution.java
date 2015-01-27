package convertToTitle;

public class Solution {
    public String convertToTitle(int n) {
        String res = "";;
        while(n != 0){
        	n--;
        	int mod = n % 26;
        	n /= 26;
        	char c = (char) ((int)'A'+ mod);
        	res = c + res;
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.convertToTitle(27));
	}

}
