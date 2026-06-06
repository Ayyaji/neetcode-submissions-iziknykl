class Solution {
    public int findCheapestPrice(int n,int[][] flights,int src,int dst,int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        int[][] dist = new int[n][k+2];
        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        for (int[] f : flights) {
            adj.computeIfAbsent(f[0],x-> new ArrayList<>()).add(new int[] { f[1], f[2] });
        }
        q.offer(new int[]{src,0,0});
        dist[src][0] = 0;
        while(!q.isEmpty()){
            int[] cell=q.poll();
            int a=cell[0];
            int c=cell[1];
            int s=cell[2];
            for (int[] nei : adj.getOrDefault(a, new ArrayList<>())) {
                if(s<=k && dist[nei[0]][s+1]>c+nei[1]){
                    dist[nei[0]][s+1]=c+nei[1];
                    q.offer(new int[]{nei[0],c+nei[1],s+1});
                }
            }

        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<=k+1;i++){
            ans=Math.min(ans,dist[dst][i]);
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
