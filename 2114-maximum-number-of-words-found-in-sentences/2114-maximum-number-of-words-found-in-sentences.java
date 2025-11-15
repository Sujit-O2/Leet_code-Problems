class Solution {
    public int mostWordsFound(String[] sentences) {
        int cnt=0;
        for(String s: sentences){
            cnt =Math.max(cnt,s.split(" ").length);

        }
        return cnt;
        
    }
}