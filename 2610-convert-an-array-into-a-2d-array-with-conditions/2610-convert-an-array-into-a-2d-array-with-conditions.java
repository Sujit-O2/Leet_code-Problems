class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        while (!freq.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            List<Integer> keys = new ArrayList<>(freq.keySet());
            for (int key : keys) {
                list.add(key);
                freq.put(key, freq.get(key) - 1);
                if (freq.get(key) == 0) {
                    freq.remove(key); 
                }
            }
            result.add(list);
        }

        return result;
    }
}
