class PrefixTree {
    class Node{
        Node[] child=new Node[26];
        boolean flag=false;
    }
    Node root;
    public PrefixTree() {
        root=new Node();
    }

    public void insert(String word) {
       Node cur=root;
       for(int i=0;i<word.length();i++)  {
            if(cur.child[word.charAt(i)-'a']==null)
                cur.child[word.charAt(i)-'a']=new Node();
            cur = cur.child[word.charAt(i) - 'a'];
        }
        cur.flag=true;

    }

    public boolean search(String word) {
        Node cur=root;
        for(int i=0;i<word.length();i++){
            if(cur.child[word.charAt(i)-'a']==null)
                return false;
            cur=cur.child[word.charAt(i)-'a'];
        }
        if(cur.flag) return true;
        return false;
    }

    public boolean startsWith(String prefix) {
        Node cur=root;
        for(int i=0;i<prefix.length();i++){
            if(cur.child[prefix.charAt(i)-'a']==null)
                return false;
            cur=cur.child[prefix.charAt(i)-'a'];
        }
        return true;
    }
}
