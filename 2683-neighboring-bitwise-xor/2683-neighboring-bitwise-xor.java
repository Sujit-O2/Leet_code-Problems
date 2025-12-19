class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int x = 0;
        for (int d : derived) {
            x ^= d;
        }
        return x == 0;
    }
}
