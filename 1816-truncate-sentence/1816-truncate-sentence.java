class Solution {
    public String truncateSentence(String s, int k) {
        String sa[]=s.split(" ");
        s=sa[0];
        for(int i=1;i<k;i++){
            s=s+" "+sa[i];

        }
        return s;
        
    }
}