class Solution {
    public int[] getConcatenation(int[] nums) {
        nums=Arrays.copyOf(nums,nums.length*2);
        for(int i=(nums.length/2);i<nums.length;i++)
                nums[i]=nums[i-(nums.length/2)];
            return nums;
    }
}