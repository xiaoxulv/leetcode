package removeElement;

public class Solution {
    public int removeElement(int[] A, int elem) {
        int len = A.length;
        if(len == 0)
        	return 0;
        int i = 0;
        int j = len-1;
        
        while(i <= j){
        	if(A[i] == elem){
        		while(A[j] == elem && i < j){
        			j--;
        			len--;
        			if(j == -1)
        				return 0;
        		}
            		A[i] = A[j];
                	j--;
                	len--;
        	}	
    		i++;	
        }
    	return len;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		int []a = {4,5};
		int res =test.removeElement(a, 5);
		System.out.println(res);
		for(int i = 0 ;i < res; i++){
			System.out.println(i + ""+ a[i]);
		}
	}

}
