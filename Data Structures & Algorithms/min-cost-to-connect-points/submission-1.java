class Solution {
    public int minCostConnectPoints(int[][] points) {
        int res=0;
        int[] visited=new int[points.length];
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b) -> a[0] - b[0]);
        q.add(new int[]{0,0});
        while(!q.isEmpty()){
            int[] cell =q.poll();
                if(visited[cell[1]]==1)
                      continue;
                res+=cell[0];
                visited[cell[1]]=1;
                for(int j=0;j<points.length;j++){
                  int cost=Math.abs(points[cell[1]][0] - points[j][0]) + Math.abs(points[cell[1]][1] - points[j][1]);
                    q.add(new int[]{cost,j});
                }
            }
         return res;
        }
    }
