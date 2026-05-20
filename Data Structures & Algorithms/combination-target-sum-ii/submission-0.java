class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates,0,new ArrayList(),target);
        return res;
    }
   void helper(int[] can,int id,List<Integer> cur,int remain){
        if(remain<0) return;
        if(remain==0) { res.add(new ArrayList<>(cur)); return; }
        for(int i=id;i<can.length;i++){
            if(i>id && can[i]==can[i-1])
                continue;
            cur.add(can[i]);
            helper(can,i+1,cur,remain-can[i]);
            cur.remove(cur.size()-1);
            
        }
    }
    
}
