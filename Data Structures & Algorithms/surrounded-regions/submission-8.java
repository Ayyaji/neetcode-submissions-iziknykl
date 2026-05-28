class Solution {
    public void solve(char[][] board) {
        for (int i = 0; i < board[0].length; i++) {
    if (board[0][i] == 'O') dfs(board, 0, i);
    if (board[board.length-1][i] == 'O') dfs(board, board.length-1, i);
}
        
        for (int i = 0; i < board.length; i++) {
    if (board[i][0] == 'O') dfs(board, i, 0);
    if (board[i][board[0].length-1] == 'O') dfs(board, i, board[0].length-1);
}
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                if(board[i][j]=='T')
                    board[i][j]='O';
            }
        }

    }
    void dfs(char[][] board,int r,int c){
        board[r][c] = 'T';
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int[] d : dirs){
            int nr=d[0]+r;
            int nc=d[1]+c;
        
            if (nr < 0 || nr >= board.length || nc < 0 || nc >= board[0].length || board[nr][nc] != 'O') 
            continue;
            board[nr][nc]='T';
                dfs(board,nr,nc);
        }
    }
}
