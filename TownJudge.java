public class TownJudge {
    
}
class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 1) return 1;
        if(trust.length<=0){
            return -1;


        }
        int in[]=new int[n+1];
        int out[]=new int[n+1];

        for(int t[]:trust){
            in[t[0]]++;
            out[t[1]]++; 
        }
        for(int i=0;i<=n;i++){
            if(in[i]==0&&out[i]==n-1)
            return i;
        }
        return -1;
        
    }
}