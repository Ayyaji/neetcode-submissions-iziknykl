class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        String res = strs[0];
        
        for (int i = 0; i < res.length(); i++) {
            for (String j : strs) {
                if (i == j.length() || j.charAt(i) != res.charAt(i)) {
                    return res.substring(0, i); 
                }
            }
        }
        
        return res;
    }
}
