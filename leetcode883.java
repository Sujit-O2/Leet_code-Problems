import java.util.ArrayList;

class Solution {
    public int projectionArea(int[][] grid) {
        int xy=0,yz=0,zx=0;
        int maxcnt=0;
        for(int i=0;i<grid.length;i++){
            int row=0,col=0;
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]>0)xy++;
                row=Math.max(row,grid[i][j]);
                col=Math.max(col,grid[j][i]);


            }
     
     
            yz+=row;
            zx+=col;

        }
            return xy+yz+zx;
        
    }
}