class Solution {
    public int longestConsecutive(int[] nums) {
     HashSet<Integer> n =new HashSet<>();
     int s=0;
     int max=0;
     for(int i:nums)
     {
        n.add(i);
     }
     for(int i:nums){
        int cur=i;
        if(!n.contains(i-1))
      {
            cur=i;        
           s=1;
     
         
         while(n.contains(cur+1))
         {cur++;
         s++;}
         max=Math.max(max,s);
     }
     }
   return max ;
    }

}
