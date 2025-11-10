class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt=0;
        for(String s: words){
            boolean check=true;
            for(char c:s.toCharArray()){
                if(!allowed.contains(c+"")){
                    check =false;
                    break;

                }
                

            }
            if(check){
                    cnt ++;
                }
        }
        return cnt;
        
    }
}