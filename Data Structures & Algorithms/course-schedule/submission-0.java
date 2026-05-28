class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] state= new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());
            for (int[] pre : prerequisites) adj.get(pre[0]).add(pre[1]);
        for (int i = 0; i < numCourses; i++)
            if (!dfs(i, state, adj)) return false;
        return true;
    }
    boolean dfs(int co,int[] state,List<List<Integer>> adj){
        if(state[co]==1)
            return false;
        if(state[co]==2) return true;
           state[co] = 1;
        for(int n:adj.get(co)){
            if(!dfs(n, state, adj)) return false;
        }
        state[co] = 2;
            return true;
    }
}
