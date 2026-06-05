class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> adj = new HashMap<>();
        List<String> result = new LinkedList<>();
        for(List<String> ticket : tickets){
            adj.computeIfAbsent(ticket.get(0),k->new PriorityQueue<>()).add(ticket.get(1));
        }
        dfs("JFK",adj,result);
        return result;
    }
    void dfs(String s,Map<String, PriorityQueue<String>> adj, List<String> res){
        while(adj.containsKey(s) && !adj.get(s).isEmpty())
            dfs(adj.get(s).poll(),adj,res);
        res.add(0,s);
    }
}
