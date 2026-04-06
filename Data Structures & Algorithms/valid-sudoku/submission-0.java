class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer>[] rs=new HashSet[9];
        HashSet<Integer>[] cs=new HashSet[9];
        HashSet<Integer>[] sq=new HashSet[9];
       for(int i = 0; i < 9; i++){
    rs[i] = new HashSet<>();
    cs[i] = new HashSet<>();
    sq[i] = new HashSet<>();
}
        for (int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                continue;
                int x=board[i][j]-'0';
                if(rs[i].contains(x))
                  return false;
                else
                  rs[i].add(x);
                if(cs[j].contains(x))
                  return false;
                else
                  cs[j].add(x);
                 int n=(i/3)*3+j/3;
                if(sq[n].contains(x))
                  return false;
                else
                  sq[n].add(x);
                  
                   
                
            }            
        }
        return true;
    }
}
