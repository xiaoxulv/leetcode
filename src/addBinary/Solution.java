package addBinary;

public class Solution {
    public String addBinary(String a, String b) {
        if(a == null) return b;
        if(b == null) return a;
        if(a.length() < b.length()){
        	String tmp = a;
        	a = b;
        	b = tmp;
        }
        String res = "";
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(j >= 0){
        	int sum = (int)a.charAt(i)-'0' + (int)b.charAt(j)-'0' + carry;
        	res = String.valueOf(sum%2) + res;
        	carry = sum/2;
        	i--;
        	j--;
        }
    	while(i >= 0){
          	int sum = (int)a.charAt(i)-'0' + carry;
        	res = String.valueOf(sum%2) + res;
        	carry = sum/2;
        	i--;
    	}
    	if(carry == 1) res = "1" + res;
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.addBinary("1011", "11"));
	}

}
