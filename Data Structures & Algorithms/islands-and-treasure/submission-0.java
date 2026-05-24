class Solution {
    Queue<int[]> q = new LinkedList<>();
    public void islandsAndTreasure(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                q.add(new int[]{i,j});
                }
            }
        }
        bfs(grid,q);
    }
    void bfs(int[][] grid, Queue<int[]> q){
          while(!q.isEmpty()){
        int[] cell=q.poll();
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int[] d : dirs) {
    int nr = cell[0] + d[0];
    int nc = cell[1] + d[1];
    if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && grid[nr][nc] == Integer.MAX_VALUE) {
        grid[nr][nc] = grid[cell[0]][cell[1]] + 1;
        q.add(new int[]{nr, nc});
        }
    }

    }
}}
