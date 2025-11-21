class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (isSymmetric(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isSymmetric(int num) {
        String s = String.valueOf(num);
        int n = s.length();
        if (n % 2 != 0) return false;

        int half = n / 2;
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < half; i++) {
            leftSum += s.charAt(i) - '0';
        }
        for (int i = half; i < n; i++) {
            rightSum += s.charAt(i) - '0';
        }

        return leftSum == rightSum;
    }
}
