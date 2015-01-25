package setZeroes;

public class Solution {
	// no extra space
	public void setZeroes(int[][] matrix) {
        int row = matrix.length;
  
        int col = matrix[0].length;
        boolean r0 = false;
        boolean c0 = false;
        for(int j = 0; j < col; j++)
        	if(matrix[0][j] == 0){
        		r0 = true;
        		break;
        	}
        for(int i = 0; i < row; i++)
        	if(matrix[i][0] == 0){
        		c0 = true;
        		break;
        	}
    	for(int i = 1; i < row; i++)
    		for(int j = 1; j < col; j++)
    			if(matrix[i][j] ==  0){
    				matrix[i][0] = 0;
    				matrix[0][j] = 0;
    			}
    	for(int i = 1; i < row; i++)
    		for(int j = 1; j < col; j++)
    			if(matrix[i][0] == 0||matrix[0][j] == 0)
    				matrix[i][j] = 0;
    	if(r0)
    		for(int j = 0; j < col; j++)
    			matrix[0][j] = 0;
    	if(c0)
    		for(int i = 0; i < row; i++)
    			matrix[i][0] = 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] m = { { 1, 0, 2 }, { 1, 2, 0 }, { 1, 1, 2 } };
		int [][]m = {{0},{1}}; 
		Solution test = new Solution();
		test.setZeroes(m);
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++)
				System.out.print(m[i][j]);
			System.out.println();
		}
	}

}
