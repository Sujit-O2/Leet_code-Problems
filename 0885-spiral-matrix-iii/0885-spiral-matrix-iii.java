class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int an[][]=new int[rows*cols][2];
        int aa[][]={{0,1},{1,0},{0,-1},{-1,0}};
        int cnt=0;
        int ro=rStart;
        int co=cStart;
        an[cnt++]=new int[]{ro,co};
        int stp=1;
        while(cnt<rows*cols){
            for(int i=0;i<4;i++){
                for(int j=0;j<stp;j++){
                    ro+=aa[i][0];
                    co+=aa[i][1];
                    if(ro>=0&&ro<rows&&co>=0&&co<cols){
                        an[cnt++]=new int[]{ro,co};
                        if(cnt==rows*cols)return an;
                    }
                }
                if(i==1||i==3)stp++;
            }
        }
        return an;
        
    }
}