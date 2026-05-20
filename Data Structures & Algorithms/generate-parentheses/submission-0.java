class Solution {
    List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper(n,new String(),0,0);
        return res;
    }
    
    void helper(int n,String cur,int open,int close){
        if(open<n){
        helper(n, cur + "(", open + 1, close);
        }

        if(close<open){
            helper(n, cur + ")", open, close + 1);
            }
            
if (cur.length() == 2*n) { res.add(cur); return; }
            
        
    }
}
