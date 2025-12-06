class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int m = s.length();
        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {
            int col = startPos[0];
            int row = startPos[1];
            int cnt = 0;

            for (int j = i; j < m; j++) {
                char c = s.charAt(j);

                if (c == 'L') row--;
                else if (c == 'R') row++;
                else if (c == 'U') col--;
                else if (c == 'D') col++;

                if (row < 0 || row >= n || col < 0 || col >= n) break;

                cnt++;
            }

            ans[i] = cnt;
        }

        return ans;
    }
}
