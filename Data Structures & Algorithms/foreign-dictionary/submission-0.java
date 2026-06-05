class Solution {
    public String foreignDictionary(String[] words) {
        Map<Character, List<Character>> adj=new HashMap<>();
        Map<Character, Integer> deg=new HashMap<>();
        Queue<Character> q=new LinkedList();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                adj.putIfAbsent(c, new ArrayList<>());
                deg.putIfAbsent(c, 0);
                }
        }
        for(int i=0;i<words.length-1;i++){
            String w1 = words[i], w2 = words[i+1];
            if (w1.length() > w2.length() && w1.startsWith(w2)) {
                return "";
            }
            int min=Math.min(w1.length(),w2.length());
            for(int j=0;j<min;j++){
                if (w1.charAt(j) != w2.charAt(j)) {
                    if (!adj.get(w1.charAt(j)).contains(w2.charAt(j))) {
                        adj.get(w1.charAt(j)).add(w2.charAt(j));
                        deg.put(w2.charAt(j), deg.get(w2.charAt(j)) + 1);
                        }
                    break;
                    }
            }
        }
        for (Map.Entry<Character, Integer> entry : deg.entrySet()) {
            if (entry.getValue() == 0) {
                q.offer(entry.getKey());
                }
        }
        StringBuilder res = new StringBuilder();
        while (!q.isEmpty()) {
            char cur = q.poll();
            res.append(cur);
            for (char nei : adj.get(cur)) {
                deg.put(nei, deg.get(nei) - 1);
                if (deg.get(nei) == 0)
                    q.offer(nei);
                }
            }
    return res.length() == adj.size() ? res.toString() : "";
    }
}
