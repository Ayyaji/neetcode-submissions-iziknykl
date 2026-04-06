class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     int l=0;
     int h=(matrix.length*matrix[0].length)-1;
     int m=0;
     while(l<=h)
     {
        m=(l+h)/2;
        if(target==matrix[m/matrix[0].length][m%matrix[0].length])
            return true;
       else if(target<matrix[m/matrix[0].length][m%matrix[0].length])
            h=m-1;
            else
                l=m+1;
   
     }
     return false;   
    }

}
