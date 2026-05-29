class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> adj= new ArrayList<>();
        int n=edges.length;
        int[] state;
        for(int i=0;i<=n;i++) adj.add(new ArrayList<>());
        for(int[] pre : edges){
            state = new int[n+1];
            if(dfs(pre[0], pre[1], state, adj)) return pre;  
                adj.get(pre[0]).add(pre[1]);                      
                adj.get(pre[1]).add(pre[0]);
        }
        return new int[]{};
}
    boolean dfs(int n1,int n2,int[] state, List<List<Integer>> adj){
        if(n1==n2) return true;
        if(state[n1]==1) return false;
        state[n1]=1;
        for(int n:adj.get(n1)){
            if(dfs(n,n2,state,adj)) return true;
        }
        return false;
    }

    
}
