class Solution {
    public int missingNumber(int[] nums) {
        int e=nums.length*(nums.length+1)/2;
        int a=Arrays.stream(nums).sum();
        return e-a;
    }
}
