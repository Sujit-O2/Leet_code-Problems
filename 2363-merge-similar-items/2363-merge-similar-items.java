class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {

        HashMap<Integer, Integer> aa = new HashMap<>();

        for (int[] item : items1) {
            aa.put(item[0], aa.getOrDefault(item[0], 0) + item[1]);
        }

        for (int[] item : items2) {
            aa.put(item[0], aa.getOrDefault(item[0], 0) + item[1]);
        }

        List<List<Integer>> aa1 = new ArrayList<>();

        for (int key : aa.keySet()) {
            aa1.add(Arrays.asList(key, aa.get(key)));
        }

        aa1.sort((a, b) -> a.get(0) - b.get(0));

        return aa1;
    }
}