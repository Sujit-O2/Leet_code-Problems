class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int i=0;
        int zo=0;
        int on=0;
        int j=0;
        int sum=0;

        for(j=0;j<s.length();j++){
            if(s.charAt(j)=='0') zo++;
            else on++;
            while(k<zo&&k<on){
                if(s.charAt(i)=='0')zo--;
                else on--;
                i++;

            }
        sum += (j - i + 1);
        }
        return sum;
        
    }
}