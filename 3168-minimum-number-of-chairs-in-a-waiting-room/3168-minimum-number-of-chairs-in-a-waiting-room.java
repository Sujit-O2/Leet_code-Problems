class Solution {
    public int minimumChairs(String s) {
        int cnt=0;
        int maxcnt=0;
        for(char c:s.toCharArray()){
            if(c=='E'){
                cnt++;
                maxcnt=Math.max(maxcnt,cnt);
            }
            else{
                cnt--;
            }
        }
        return maxcnt;
    }
}