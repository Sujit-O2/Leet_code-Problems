class Solution {
    public int removePalindromeSub(String s) {
        int i=0;
        int j=s.length();
        if(j==0)return 0;
        while(i<=j){
            if (s.charAt(i)!= s.charAt(j-1)){
                return 2;
            }
            i++;
            j--;
        }
        return 1;
        
        
    }
}