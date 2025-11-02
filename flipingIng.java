public class flipingIng {
    
}
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int a[][]=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                a[i][image[i].length-1-j]=(image[i][j]==0)?1:0;

            }
        }
        return a;
        
    }
}