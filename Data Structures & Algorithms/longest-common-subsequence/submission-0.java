class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int l=text1.length(),s=text2.length();
        int[][] dp=new int[l+1][s+1];
         for(int i=0;i<l;i++)
            dp[i][0]=0;
        for(int i=0;i<s;i++)
            dp[0][i]=0;
        for(int i=1;i<l+1;i++){
            for(int j=1;j<s+1;j++){
                if(text2.charAt(j-1)==text1.charAt(i-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[l][s];
        
    }
}
