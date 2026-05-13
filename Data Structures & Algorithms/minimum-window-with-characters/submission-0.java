class Solution {
    public String minWindow(String s, String t) {
        int [] map=new int[128];
        int matches=0;
        int need=0;
        int l=0,r=0;
        int start=0,minLen=Integer.MAX_VALUE;       
        for(int i=0;i<t.length();i++){
            map[t.charAt(i)-'A']++;
        }
        for(int i=0;i<128;i++){
            if(map[i]>0)
             need++;
        }
        for(int i=0;i<s.length();i++){
            r=i;
            map[s.charAt(i)-'A']--;
            if(map[s.charAt(i)-'A'] ==0)
            {
                matches++;
                while(matches==need){
                    if(r - l + 1 < minLen) {
                        minLen = r - l + 1;
                       start = l;
                        }
                        map[s.charAt(l)-'A']++;
                        if(map[s.charAt(l)-'A']==1)
                            matches--;
                        l++;
                    }
               }
        }       
            if(minLen == Integer.MAX_VALUE) 
                return "";
            return s.substring(start, start + minLen);
}
}
