package MajorityElement;

public class Solution {
	public int majorityElement(int[] num) {
		int len = num.length;
		int candiIndex = 0;
		int count = 1;
		for(int i = 1; i < len; i++){
			if(num[candiIndex] == num[i])
				count++;
			else
				count--;
			if(count == 0){
				candiIndex = i;
				count = 1;
			}
		}
		return num[candiIndex];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test =new Solution();
		int num[] = {1,0,0}; 
		System.out.println(test.majorityElement(num));
	}

}
