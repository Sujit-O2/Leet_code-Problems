class NeighborSum {

    int[][] grid;
    int n;
    HashMap<Integer, int[]> map = new HashMap<>();

    public NeighborSum(int[][] grid) {
        this.grid = grid;
        n = grid.length;

        // Store value -> position
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                map.put(grid[i][j], new int[]{i,j});
            }
        }
    }

    public int adjacentSum(int value) {
        int[] pos = map.get(value);
        int r = pos[0];
        int c = pos[1];

        int sum = 0;

        // up
        if(r-1 >= 0) sum += grid[r-1][c];

        // down
        if(r+1 < n) sum += grid[r+1][c];

        // left
        if(c-1 >= 0) sum += grid[r][c-1];

        // right
        if(c+1 < n) sum += grid[r][c+1];

        return sum;
    }

    public int diagonalSum(int value) {
        int[] pos = map.get(value);
        int r = pos[0];
        int c = pos[1];

        int sum = 0;

        // top-left
        if(r-1 >= 0 && c-1 >= 0)
            sum += grid[r-1][c-1];

        // top-right
        if(r-1 >= 0 && c+1 < n)
            sum += grid[r-1][c+1];

        // bottom-left
        if(r+1 < n && c-1 >= 0)
            sum += grid[r+1][c-1];

        // bottom-right
        if(r+1 < n && c+1 < n)
            sum += grid[r+1][c+1];

        return sum;
    }
}