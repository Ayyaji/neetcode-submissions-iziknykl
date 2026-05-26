class Solution {
    int res=0;
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2)
                q.add(new int[]{i,j});

            }
        }
        bfs(grid,q);
        for (int i = 0; i < grid.length; i++)
    for (int j = 0; j < grid[0].length; j++)
        if (grid[i][j] == 1) return -1;
            
        return res;
    }
    void bfs(int[][] grid,Queue<int[]> q){
        int ro=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                 int[] cell=q.poll();
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int[] d : dirs) {
    int nr = cell[0] + d[0];
    int nc = cell[1] + d[1];
    if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && grid[nr][nc] ==1) {
        grid[nr][nc] = 2;
        q.add(new int[]{nr, nc});
           ro=1;
            }
        }
    }
    
    if(ro==1){
    res++;
    ro=0;
    }
}
    }
    }
