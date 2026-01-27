class Solution {
    public int commonFactors(int a, int b) {
        int x = a, y = b;
        while (y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        int hcf = x;
        
        int cnt = 0;
        for (int i = 1; i <= hcf; i++) {
            if (hcf % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
