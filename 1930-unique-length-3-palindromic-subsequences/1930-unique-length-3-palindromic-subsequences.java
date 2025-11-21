class Solution {
    public int countPalindromicSubsequence(String s) {
        int ans=0;
        for(char c='a';c<='z';c++){
            int fst=s.indexOf(c);
            int fst1=s.lastIndexOf(c);
            if(fst!=-1&&fst1-fst>1){
                Set<Character> ii=new HashSet();
                for(int i=fst+1;i<fst1;i++){
                    ii.add(s.charAt(i));
                }
                ans+=ii.size();
                
            }

        }
        return ans;
        
    }
}