class Solution {
    public int[] findDegrees(int[][] matrix) {
        int a[]=new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            int sum=0;
            for(int j=0;j<matrix[i].length;j++){
                sum+=matrix[i][j];

            }
            a[i]=sum;
        }
        return a;
    }
}