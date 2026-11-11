class Solution {
    public int numRookCaptures(char[][] board) {

        int row = 0, col = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    row = i;
                    col = j;
                    break;
                }
            }
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        int count = 0;

        for (int d = 0; d < 4; d++) {

            int r = row + dr[d];
            int c = col + dc[d];

            while (r >= 0 && r < 8 && c >= 0 && c < 8) {

                if (board[r][c] == 'B') {
                    break;
                }

                if (board[r][c] == 'p') {
                    count++;
                    break;
                }

                r += dr[d];
                c += dc[d];
            }
        }

        return count;
    }
}