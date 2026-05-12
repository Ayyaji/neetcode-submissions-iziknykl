class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] map=new int[26];
        int matches=26;
        for(int i=0;i<s1.length();i++){
            map[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(map[i]>0)
             matches--;
        }
        for(int i=0;i<s2.length();i++){
           
            map[s2.charAt(i)-'a']--;
            if(map[s2.charAt(i)-'a']==0)
                matches++;
                
                
            if(i-s1.length()>=0)
                {

                map[s2.charAt(i-s1.length())-'a']++;
                if(map[s2.charAt(i-s1.length())-'a']==1)
                   matches--;
                }
             if(matches==26)
              return true;
            }

        return false;
    }
}
