class Solution {
    public int countLargestGroup(int n) {
        int[] freq = new int[37]; // max digit sum for n <= 10000 is 36

        // Count frequency of each digit sum
        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            freq[sum]++;
        }

        int max = 0;

        // Find largest group size
        for (int x : freq) {
            max = Math.max(max, x);
        }

        int count = 0;

        // Count how many groups have max size
        for (int x : freq) {
            if (x == max) {
                count++;
            }
        }

        return count;
    }

    private int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}