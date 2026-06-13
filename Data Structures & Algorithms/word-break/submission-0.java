class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; 
        for(int i=1;i<=s.length();i++ ){
            for(String st : wordDict){
                    int j = i - st.length();
               if (j >= 0 && dp[j] && s.substring(j, i).equals(st)) {
                    dp[i] = true;
                    break;
                }
            }
            
        } 
        return dp[s.length()];
    }
}
