class Solution {
    public int numSub(String s) {
        int count = 0;
        int result = 0;
        int MOD = 1_000_000_007;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
                result = (result + count) % MOD;
            } else {
                count = 0;
            }
        }
        
        return result;
    }
}
