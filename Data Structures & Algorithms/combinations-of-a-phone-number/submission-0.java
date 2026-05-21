class Solution {
    List<String> res=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
       
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        helper(digits,0,"",map);
        return res;
    }
    void helper(String digits,int index,String cur,String[] map){
         if (digits.isEmpty()) return;
        if(index==digits.length()){
            res.add(cur);
            return;
        }
        String letters=map[digits.charAt(index)-'0'];
        for(char l : letters.toCharArray()){
                    helper(digits,index+1,cur+l ,map);
                    
            }
            
    }
}
