package rotate;

public class Solution {
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		for(int j = 0; j < n/2; j++){
			int first = j;
			int last = n-j-1;
			for(int i = first; i < last; i++){
				int offset = i-first;
				//System.out.println(offset);
				int temp = matrix[first][i];
				matrix[first][i] = matrix[last-offset][first]; 
				matrix[last-offset][first] = matrix[last][last-offset]; 
				matrix[last][last-offset] = matrix[i][last]; 
				matrix[i][last] = temp; 
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		int [][]a = {{1,2,3},{4,5,6},{7,8,9}};
		test.rotate(a);
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++)
				System.out.print(a[i][j]);
			System.out.println();
		}
	}

}
