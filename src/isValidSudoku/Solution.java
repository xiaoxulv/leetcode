package isValidSudoku;

import java.util.HashSet;


public class Solution {
    public boolean isValidSudoku(char[][] board) {
    	// col
    	for(int i=0; i<board[0].length; i++){  
            boolean[] f = new boolean[256];  
            for(int j=0; j<board.length; j++){  
                if(board[j][i]!='.'){  
                    if(f[board[j][i]]==true) return false;  
                    else f[board[j][i]] = true;                      
                }  
            }  
        }  
          
        // row  
        for(int i=0; i<board.length; i++){  
            boolean[] f = new boolean[256];  
            for(int j=0; j<board[0].length; j++){  
                if(board[i][j]!='.'){  
                    if(f[board[i][j]]==true) return false;  
                    else f[board[i][j]] = true;                      
                }  
            }  
        }     
          
        // sub-box  
        for(int i=0; i<3; i++){  
            for(int j=0; j<3; j++){ 
                boolean[] f = new boolean[256];  
                for(int m=i*3; m<i*3+3; m++){ 
                    for(int n=j*3; n<j*3+3; n++){ 
                        if(board[m][n] != '.'){  
                            if(f[board[m][n]]==true) return false;  
                            else f[board[m][n]] = true;                                 
                        }  
                    }  
                }  
            }  
        }  
          
        return true;  
    }  
    //more elegant approach
    public boolean isValidSudoku2(char[][] board) {
        HashSet[] row  = new HashSet[9];
        HashSet[] col  = new HashSet[9];
        HashSet[] area = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            row[i]  = new HashSet<Character>();
            col[i]  = new HashSet<Character>();
            area[i] = new HashSet<Character>();
        }

        for (int i = 0; i < 9; i++) { //rows
            for (int j = 0; j < 9; j++) { //cols
                if (board[i][j] != '.') {
                    int nArea = (3 * (i  / 3)) + (j  / 3);
                    if (row[i].contains(board[i][j]) || 
                        col[j].contains(board[i][j]) || 
                        area[nArea].contains(board[i][j]))
                        return false;

                    row[i].add(board[i][j]);
                    col[j].add(board[i][j]);
                    area[nArea].add(board[i][j]);
                }
            }
        }

        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
