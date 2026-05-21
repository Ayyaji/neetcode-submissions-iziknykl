class Solution {
    public boolean exist(char[][] board, String word) {
        for(int k=0;k<board.length;k++)
            for(int l=0;l<board[0].length;l++)
                 if (helper(board, word, k, l, 0)) return true;

        return false;
             
    }
  boolean helper(char[][] board,String word,int i,int j,int m){
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
        if (board[i][j] != word.charAt(m)) return false;
        if (m == word.length() - 1) return true;
        char original=board[i][j];
        board[i][j] = '#';
        boolean found = helper(board, word, i+1, j, m+1) || helper(board,word,i-1,j,m+1) || helper(board,word,i,j+1,m+1) || helper(board,word,i,j-1,m+1);
        board[i][j] = original;  
        return found;
                
                }
            }
    