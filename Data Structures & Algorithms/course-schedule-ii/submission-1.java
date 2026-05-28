class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
         boolean res=true;
         int[] state= new int[numCourses];
         List<Integer> order=new ArrayList<>(numCourses);
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());
            for (int[] pre : prerequisites) adj.get(pre[0]).add(pre[1]);
        for (int i = 0; i < numCourses; i++)
            if (!dfs(i, state,order, adj)) {res=false;break;}
        if(res==false)
        return new int[]{};
        else
         return order.stream().mapToInt(i->i).toArray();
      
    }
    boolean dfs(int co,int[] state,List<Integer> order,List<List<Integer>> adj){
        if(state[co]==1)
            return false;
        if(state[co]==2) return true;
           state[co] = 1;
        for(int n:adj.get(co)){
            if(!dfs(n, state,order, adj)) return false;
        }
        state[co] = 2;
        order.add(co);
            return true;
    }
}
    
