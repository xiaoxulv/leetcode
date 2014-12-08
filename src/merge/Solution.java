package merge;

public class Solution {
	public void merge(int A[], int m, int B[], int n) {
		int i = 0, j = 0, k = 0;
		int res[] = new int[m+n];
		while(i < m && j < n){
			if(A[i] <= B[j]){
				res[k] = A[i];
				i++;
			}
			else{
				res[k] = B[j];
				j++;
			}
			k++;
		}
		if(i == m){
			for(int p = j; p < n; p++){
				res[k] = B[p];
				k++;
			}
		}
		else if(j == n){
			for(int p = i; p < m; p++){
				res[k] = A[p];
				k++;
			}
		}
		for(int p = 0; p < m+n; p++)
			A[p] = res[p];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		int a[] = new int[10];
		a[0] = 1;
		a[1] = 3;
		a[2] = 6;
		int b[] = {2,9,11};
		test.merge(a, 3, b, 3);
		for(int i = 0; i < 6; i++)
			System.out.println(a[i]);
	}

}
