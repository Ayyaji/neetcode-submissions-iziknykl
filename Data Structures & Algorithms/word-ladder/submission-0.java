class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q=new LinkedList<>();
        Set<String> v=new HashSet<>();
        q.add(beginWord);
        int l=1;
        while(!q.isEmpty()){
            int size = q.size(); 
            for(int i = 0; i < size; i++){
                String t = q.poll();
                if (t.equals(endWord))
                    return l+1;
                for(String s:wordList){
                    int diff=0;
                    if(v.contains(s)) continue;
                    for(int j=0;j<t.length();j++){
                        if(t.charAt(j)!=s.charAt(j))
                        diff++;
                    }
                    if(diff==1){
                        if(endWord.equals(s))
                            return l+1;
                        else
                            {
                            q.add(s);
                            v.add(s);
                            }
                    }
                }
            }
        l++; 
                
        }
        return 0;
    }
    
}
