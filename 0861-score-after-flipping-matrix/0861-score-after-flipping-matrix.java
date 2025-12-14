class Solution {
    public int matrixScore(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            if(grid[i][0]==0){
                for(int j=0;j<grid[0].length;j++){
                    grid[i][j]^=1;
                }
            }
        }
        for(int i=1;i<grid[0].length;i++){
            int ons=0;
            for(int j=0;j<grid.length;j++){
                ons+=grid[j][i];
            }
            if(ons<grid.length-ons){
                for(int j=0;j<grid.length;j++){
                    grid[j][i]^=1;
                }
            }

        }
        int score=0;
        for(int i=0;i<grid.length;i++){
            int val=0;
            for(int j=0;j<grid[0].length;j++){
                val=(val<<1)+grid[i][j];

            }
            score+=val;
        }
        return score;
        
    }
}