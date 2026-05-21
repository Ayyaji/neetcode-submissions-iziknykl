class Solution {
    List<List<String>> res=new ArrayList<>();
    public List<List<String>> partition(String s) {
        helper(s,s.length(),0,new ArrayList<>());
        return res;
    }

    void helper(String s,int len,int index,List<String> cur){
      if(index==len){
            res.add(new ArrayList<>(cur));
            return;
        }
      for(int i=index+1;i<=len;i++){
        if(isPalindrome(s,index,i-1)){
        cur.add(s.substring(index,i));
        helper(s,len,i,cur);
        cur.remove(cur.size()-1);
        }
      }   
    }
    boolean isPalindrome(String s, int l, int r) {
    while (l < r) {
        if (s.charAt(l) != s.charAt(r)) return false;
        l++; r--;
    }
    return true;
}
}
