class CountSquares {
    Map<Integer, Map<Integer, Integer>> pc;
    public CountSquares() {
        pc=new HashMap<>();
    }
    
    public void add(int[] point) {
        pc.putIfAbsent(point[0],new HashMap<>());
         Map<Integer, Integer> inner = pc.get(point[0]);
        inner.put(point[1], inner.getOrDefault(point[1], 0) + 1);    
    }

    public int count(int[] point) {
         int x = point[0], y = point[1];
    int ans = 0;
    
    if(!pc.containsKey(x)) return 0;
    for(int y2 : pc.get(x).keySet()) {
        if(y2 == y) continue; 
        int side = Math.abs(y2 - y);
        
       
        for(int x2 : new int[]{x + side, x - side}) {
           if(pc.containsKey(x2) && pc.get(x2).containsKey(y) && pc.get(x2).containsKey(y2)) {
    ans += pc.get(x).get(y2) * pc.get(x2).get(y) * pc.get(x2).get(y2);
}
        }
    }
    return ans;
}

}
