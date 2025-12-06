class Solution {
    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (canSplit(String.valueOf(i * i), 0, i)) {
                sum += i * i;
            }
        }
        return sum;
    }

    private boolean canSplit(String s, int idx, int target) {
        if (idx == s.length()) return target == 0;

        int num = 0;
        for (int j = idx; j < s.length(); j++) {
            num = num * 10 + (s.charAt(j) - '0');

            if (num > target) break;

            if (canSplit(s, j + 1, target - num)) return true;
        }
        return false;
    }
}
