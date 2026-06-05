class Solution {
    public int swimInWater(int[][] grid) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        boolean[][] visited = new boolean[grid.length][grid.length];
        q.offer(new int[]{grid[0][0],0,0});
        while(!q.isEmpty()){
            int[] cell = q.poll();
            int t = cell[0], r = cell[1], c = cell[2];
            if (visited[r][c]) continue;
            visited[r][c] = true;
            if (r == grid.length-1 && c == grid[0].length-1) 
            return t; 
            int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
            for(int[] d:dirs){
                if(r+d[0]<0 || c+d[1]<0 || r+d[0]>=grid.length || c+d[1]>=grid[0].length)
                    continue;
                    q.offer(new int[]{Math.max(t, grid[r+d[0]][c+d[1]]), d[0]+r, d[1]+c});
            }

        }
        return 0;
    }
}
