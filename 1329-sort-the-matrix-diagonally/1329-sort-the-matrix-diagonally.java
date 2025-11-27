class Solution {
    public int[][] diagonalSort(int[][] mat) {
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int row =i;
                int col=j;
                ArrayList<Integer> aa=new ArrayList();
                while(row<mat.length&&col<mat[0].length){

                    aa.add(mat[row][col]);
                    row++;
                    col++;


                }
                Collections.sort(aa);
                System.out.println(aa);
                 row =i;
                 col=j;
                while(row<mat.length&&col<mat[0].length){

                    mat[row][col]=aa.getFirst();
                    aa.remove(0);
                    row++;
                    col++;


                }
                
            }
            
        }
        return mat;

        
    }
}