class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), target);
        return res;
    }

    void helper(int[] nums, int index, List<Integer> cur, int remain) {
        if (remain == 0) { res.add(new ArrayList<>(cur)); return; }
        if (remain < 0) { return; }

        for (int i = index; i < nums.length; i++) {
            cur.add(nums[i]);
            helper(nums, i, cur, remain - nums[i]); 
            cur.remove(cur.size() - 1);          
        }
    }
}