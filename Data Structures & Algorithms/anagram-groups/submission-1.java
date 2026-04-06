class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // defaultdict(list) → HashMap<String, List<String>>
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            
            // count = [0]*26
            int[] count = new int[26];
            
            // for c in s → count[ord(c)-ord("a")] += 1
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            
            // tuple(count) → Arrays.toString(count)
            String key = Arrays.toString(count);
            
            // has[key].append(s)
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        
        // return list(has.values())
        return new ArrayList<>(map.values());
    }
}