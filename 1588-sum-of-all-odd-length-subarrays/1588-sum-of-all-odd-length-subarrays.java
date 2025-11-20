class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int length = 1; length <= n; length += 2) { 
            for (int start = 0; start + length <= n; start++) {
                int temp = 0;
                for (int i = start; i < start + length; i++) {
                    temp += arr[i];
                }
                sum += temp;
            }
        }

        return sum;
    }
}
