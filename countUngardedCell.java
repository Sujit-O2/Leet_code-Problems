public class countUngardedCell {
    
}
class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int a[][]=new int[m][n];
        for(int a1[]:guards){
            a[a1[0]][a1[1]]=1;
        }
        for(int a1[]:walls){
            a[a1[0]][a1[1]]=2;
        }
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
        for(int i[]:guards){
            for(int j[]:dir){
                int x=i[0]+j[0];
                int y=i[1]+j[1];

                while(x>=0&&x<m&&y>=0&&y<n&&a[x][y]!=2&&a[x][y]!=1){
                    if(a[x][y]==0) a[x][y]=3;
                    x+=j[0];
                    y+=j[1];

                }
            }
        }
        int cnt=0;
        for(int a1[]:a){
            for(int a2:a1){
                if(a2==0) cnt++;
            }
        }

        
        return cnt;
    }
}