class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int i1[]=new int[score[0].length];
        for(int i=0;i<score.length;i++){
            int max=i;
            for(int j=i;j<score.length;j++){
                if(score[max][k]<score[j][k]){
                    max=j;
                }
            }
            i1=score[max];
            score[max]=score[i];
            score[i]=i1;
            
            
        }
        return score;
        
    }
}