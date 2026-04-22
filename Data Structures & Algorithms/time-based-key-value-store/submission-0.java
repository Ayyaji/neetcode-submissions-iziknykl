class TimeMap {
        class Pair {
        int timestamp;
        String val;
        
        public Pair(int timestamp, String val) {
            this.timestamp = timestamp;
            this.val = val;
        }
    }
    
    private Map<String, List<Pair>> map;
    public TimeMap() {
        map = new HashMap<>();
       
    }
    
    public void set(String key, String value, int timestamp) {
            if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
            map.get(key).add(new Pair(timestamp, value));        

    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        
        List<Pair> list = map.get(key);
        int left = 0;
        int right = list.size() - 1;
        String res = "";
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (list.get(mid).timestamp <= timestamp) {
             
                res = list.get(mid).val;
                left = mid + 1;
            } else {
               
                right = mid - 1;
            }
        }
        
        return res;
    }
}

    

