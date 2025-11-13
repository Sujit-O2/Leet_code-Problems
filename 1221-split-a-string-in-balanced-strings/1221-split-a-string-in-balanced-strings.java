class Solution {
    public int balancedStringSplit(String s) {    
        int cnt=0;
        int bal=0;
        for(char c:s.toCharArray()){
            if(c=='L') bal++;
            else bal--;
            if(bal==0)cnt++;

        }    
        return cnt;
        
    }
}