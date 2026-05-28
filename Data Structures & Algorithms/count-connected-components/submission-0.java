class Solution {
    public int countComponents(int n, int[][] edges) {
        int[] state =new int[n];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int []pre : edges){
            adj.get(pre[0]).add(pre[1]);
            adj.get(pre[1]).add(pre[0]);
        }
        int res=0;
        for(int i=0;i<n;i++){
            if(state[i]!=1){
                 res++;
                 dfs(i,state,edges,adj);
            }
        }
        return res;
    }
    void dfs(int node,int[] state,int[][] edges,List<List<Integer>> adj){
        if(state[node]==1) return ;
        state[node]=1;
        for(int n : adj.get(node))
            dfs(n,state,edges,adj);
        
    }
}
