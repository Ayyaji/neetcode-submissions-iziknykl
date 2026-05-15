class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int index=0;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
                dq.pollLast();
            dq.offerLast(i);
            if(dq.peekFirst() < i - k + 1)
                dq.pollFirst();
            if(i >= k-1)
               res[index++] = nums[dq.peekFirst()];

            }
              
            
        

        return res;
    }
}
