class Solution {
    public int maxProduct(int[] nums) {
        int cmax=nums[0],cmin=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++){
            int tmp=cmax;
            cmax = Math.max(nums[i], Math.max(nums[i]*cmax, nums[i]*cmin));
            cmin = Math.min(nums[i], Math.min(nums[i]*tmp, nums[i]*cmin));
            res = Math.max(res, cmax);
        }
        return res;
    }
}
