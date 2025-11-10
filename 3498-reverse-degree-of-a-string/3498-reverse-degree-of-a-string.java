class Solution {
    public int reverseDegree(String s) {
        int a=26;
        int sum=0;
        int i=1;
        for(char c:s.toCharArray()){
            sum+=(a-(c-'a'))*i;
            i++;

        }
        return sum;
        
    }
}