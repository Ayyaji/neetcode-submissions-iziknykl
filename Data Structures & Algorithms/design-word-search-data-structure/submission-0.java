class WordDictionary {
    class Node{
        Node[] child=new Node[26];
        boolean flag=false;
    }
    Node root;
    public WordDictionary() {
        root=new Node();
    }

    public void addWord(String word) {
        Node cur=root;
        for(int i=0;i<word.length();i++){
            if(cur.child[word.charAt(i)-'a']==null)
                cur.child[word.charAt(i)-'a']=new Node();
            cur=cur.child[word.charAt(i)-'a'];
        }
        cur.flag=true;
    }

  public boolean search(String word) {
    return dfs(root, 0, word);
}
     boolean dfs(Node cur,int i, String word){
        if(i == word.length()) return cur.flag;
        char ch = word.charAt(i);
        if(ch=='.')
           { for(int j=0;j<26;j++){
                  if(cur.child[j] != null && dfs(cur.child[j], i+1, word))
                       return true;
            }
            return false;
            }
        else{
              if(cur.child[word.charAt(i)-'a']==null)
                    return false;
        } 
        return dfs(cur.child[word.charAt(i)-'a'],i+1,word);
     }
}
