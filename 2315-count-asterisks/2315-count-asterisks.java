class Solution {
    public int countAsterisks(String s) {
        int ors=0;
        int cnt=0;
        String ss[]=s.split("\\|");
        for(int i=0;i<ss.length;i+=2){
            for(int j=0;j<ss[i].length();j++){
                if(ss[i].charAt(j)=='*'){
                    cnt++;
                }

            }
        }
        return cnt;
        
    }
}