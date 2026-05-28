    class Solution {
    public boolean validTree(int n, int[][] edges) {
        boolean res;
        List<List<Integer>> adj = new ArrayList<>();
        int[] state = new int[n];
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
            for (int[] pre : edges){
                adj.get(pre[0]).add(pre[1]);
                adj.get(pre[1]).add(pre[0]);
            }
        res= dfs(0,-1,state,adj);
        for (int s : state) if (s == 0) return false;
        return res;

    }
    boolean dfs(int node, int p, int[] state, List<List<Integer>> adj){
        if(state[node]==1) return false;
        state[node]=1;
        for (int n : adj.get(node)) {
    if (n == p) continue;
    if (!dfs(n, node, state, adj)) return false;
}
            return true;
    }
}
