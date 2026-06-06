class Solution {
        int res=0;
    public int countSubstrings(String s) {
        int start = 0, end = 0;

for (int i = 0; i < s.length(); i++) {
    int[] odd = expand(s, i, i);
    int[] even = expand(s, i, i+1);
}
    return res;
}
    int[] expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            res++;
        }
        return new int[]{left + 1, right - 1}; 
    }
}


