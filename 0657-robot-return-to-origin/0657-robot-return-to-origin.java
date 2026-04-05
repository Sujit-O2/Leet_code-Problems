class Solution {
    public boolean judgeCircle(String moves) {
        int vorg =0;
        int horg=0;
        for(char c: moves.toCharArray()){
            if(c=='L')horg++;
            else if(c=='R') horg--;
            else if(c=='U')vorg++;
            else vorg--;
        }
        if( vorg==0 && horg==0)return true;
        return false;

        
    }
}