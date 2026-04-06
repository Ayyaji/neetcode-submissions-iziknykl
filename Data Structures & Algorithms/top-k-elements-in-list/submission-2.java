class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: count frequencies
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Step 2: bucket sort — index = frequency
        List<Integer>[] freq = new List[nums.length + 1];
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }
        for (int n : map.keySet()) {
            freq[map.get(n)].add(n);
        }

        // Step 3: collect top k from highest frequency
        int[] result = new int[k];
        int idx = 0;
        for (int i = freq.length - 1; i >= 0 && idx < k; i--) {
            for (int n : freq[i]) {
                result[idx++] = n;
                if (idx == k) break;
            }
        }

        return result;
    }
}