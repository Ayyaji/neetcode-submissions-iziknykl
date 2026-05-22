class Solution {
     List<List<String>> res=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');   
        helper(board,n,0);
        return res;
    }
    void helper(char[][] board,int n ,int row){
        if(n==row){ 
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++)
            list.add(new String(board[i]));
            res.add(list);
            return ;
        }
        for(int i=0;i<n;i++){
            if(safe(board,n,row,i)){
                board[row][i]='Q';
                helper(board,n,row+1);
            }
            board[row][i]='.';
        }
        return ;
    }
    boolean safe(char[][] board,int n,int r,int c){
        for(int i=0;i<n;i++){
            if(board[i][c]=='Q') return false;
        }
        for(int i=0;i<n;i++){
            if(board[r][i]=='Q') return false;
        }
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;
        for (int i = r, j = c; i >= 0 && j <n; i--, j++)
            if (board[i][j] == 'Q') return false;
        return true;
    }
}
