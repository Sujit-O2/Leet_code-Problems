class Solution {
    public int countBinarySubstrings(String s) {
        int prun=0;
        int crun=0;
        int ans=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                crun++;
            }
            else{
                ans+=Math.min(prun,crun);
                prun=crun;
                crun=1;
            }
        }
        ans+=Math.min(crun.prun);
        return ans;
        
    }
}