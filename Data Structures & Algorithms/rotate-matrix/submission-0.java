class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int tmp=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=tmp;
            }
        }
        for(int i=0;i<matrix.length;i++){
           int l=0,r=matrix.length-1;
           while(l<r){
             int tmp=matrix[i][l];
            matrix[i][l]=matrix[i][r];
            matrix[i][r]=tmp;
            l++;r--;
           }
        }
    }
}
