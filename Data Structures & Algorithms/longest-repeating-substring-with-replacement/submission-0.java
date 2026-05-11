class Solution {
    public int characterReplacement(String s, int k) {
        int maxf=0,ml=0,l=0,r=0;
        int[] count=new int[26];
        for(r=0;r<s.length();r++){
                count[s.charAt(r)-'A']++;

                maxf = Math.max(maxf, count[s.charAt(r)-'A']);
                if(r -l + 1-maxf>k)
                {
                    count[s.charAt(l)-'A']--;
                    l++;
                    
                }

                 ml=Math.max(ml,r-l+1);

        }

        return ml;
    }
}
