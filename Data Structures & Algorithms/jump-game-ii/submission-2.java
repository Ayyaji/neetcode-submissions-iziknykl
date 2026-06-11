class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1) return 0;
        int ce=0,f=0;
        int j=0;
        for(int i=0;i<nums.length-1;i++){
             f=Math.max(f,i+nums[i]);
            if(i==ce)
               { j++;
               ce=f;
               }
        }
        return j;
    }
}
