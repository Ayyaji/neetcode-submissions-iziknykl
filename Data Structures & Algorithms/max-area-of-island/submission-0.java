class Solution {
    int max=0;
    public int maxAreaOfIsland(int[][] grid) {
      for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                max=Math.max(dfs(grid,i,j),max);
                }

            }
        }
        return max;
    }
    int dfs(int[][] grid,int i, int j){
        int res=0;
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return res;
        if(grid[i][j]!=1) return res;
        grid[i][j]=0;
        res++;
         res+=dfs(grid,i+1,j);
         res+=dfs(grid,i,j+1);
         res+=dfs(grid,i-1,j);
         res+=dfs(grid,i,j-1);
         return res;
    }    
    
}
