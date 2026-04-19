class Solution {
    public int minTimeToType(String word) {
        int current = 0;
        int sum = 0;
        for (char c : word.toCharArray()) {
            int target = c - 'a';
            int diff = Math.abs(target - current);
            int steps = Math.min(diff, 26 - diff);

            sum += steps + 1;
            current = target;
        }

        return sum;
    }
}