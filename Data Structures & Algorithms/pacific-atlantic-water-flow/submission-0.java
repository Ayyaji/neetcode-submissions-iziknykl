class Solution {
    boolean[][] pacific;
    boolean[][] atlantic ;
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int row = heights.length, col = heights[0].length;
        pacific = new boolean[row][col];
        atlantic = new boolean[row][col];
        helper(heights,row,col);
        for(int i=0;i<heights.length;i++)
        for(int j=0;j<heights[0].length;j++)
        if (pacific[i][j] && atlantic[i][j])
        res.add(Arrays.asList(i,j));
        return res;
    }
    void helper(int[][] heights,int row,int col){
        Queue<int[]> pq=new LinkedList<>();
        Queue<int[]> aq= new LinkedList<>();
        for(int i=0;i<row;i++){
        pq.add(new int[]{i,0});
        aq.add(new int[]{i,col-1});
        pacific[i][0]=true;
        atlantic[i][col-1]=true;
        }
        for(int i=0;i<col;i++){
            pq.add(new int[]{0,i});
            aq.add(new int[]{row-1,i});
            pacific[0][i]=true;
            atlantic[row-1][i]=true;
        }
        bfs(heights,aq,atlantic,row,col);
        bfs(heights,pq,pacific,row,col);

    }
    void bfs(int[][] heights, Queue<int[]> q, boolean[][] visited, int row, int col){
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] cell=q.poll();
            int m=0;
            for (int[] d : dirs) {
                int nr = cell[0] + d[0];
                int nc = cell[1] + d[1];
                if (nr >= 0 && nr < row && nc >= 0 && nc < col 
                    && !visited[nr][nc] 
                    && heights[nr][nc] >= heights[cell[0]][cell[1]]) {
                    visited[nr][nc] = true;
                    q.add(new int[]{nr, nc});
                }
            }
            
        }
        
    }
}
