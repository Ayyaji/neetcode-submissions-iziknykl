class Solution {
    public int[] twoSum(int[] numbers, int target) {
     int l=0,h=numbers.length-1;
     int m;
  
     while(l<h)
     {if(numbers[l]+numbers[h]==target)
            return new int[]{l+1,h+1};
      if(numbers[l]+numbers[h]>target)
          h--;
      else if(numbers[l]+numbers[h]<target)
        l++;

     }   
        return new int[]{0,0};
    }
}