class Solution {
    class Node{
        Node[] child=new Node[26];
        String w;
    }
    Node root;
    List<String> res=new ArrayList<>();
    public List<String> findWords(char[][] board, String[] words) {
        root=new Node();
        boolean[][] visited=new boolean[board.length][board[0].length];
        for(String word: words){
            Node cur=root;
            for(int i=0;i<word.length();i++){
                if(cur.child[word.charAt(i)-'a']==null)
                    cur.child[word.charAt(i)-'a']=new Node();
                cur=cur.child[word.charAt(i)-'a'];
        }
        cur.w = word;
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(!visited[i][j]){
                dfs(board,i,j,root,visited);
                }
            }
        }
        return res;
    }
    void dfs(char[][] board,int i,int j,Node cur,boolean[][] visited){
        cur=cur.child[board[i][j]-'a'];
        if(cur==null) return;
        if(cur.w!=null){
            res.add(cur.w);
            cur.w=null;
        }
        visited[i][j]=true;
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        for(int[] d : dirs) {
            int nr = i + d[0];
            int nc = j + d[1];
            if(nr >= 0 && nc >= 0 && nr < board.length && nc < board[0].length && !visited[nr][nc])
                    dfs(board, nr, nc, cur, visited);
        }
        visited[i][j]=false;

    }
}
