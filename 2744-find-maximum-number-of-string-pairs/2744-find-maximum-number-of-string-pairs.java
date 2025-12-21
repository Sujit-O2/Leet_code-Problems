class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int cnt=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j< words.length;j++){
                StringBuffer bb=new StringBuffer(words[j]);
                bb.reverse();
                if(words[i].equals(bb.toString())){
                    cnt++;
                }
            }
        }
        return cnt;
        
    }
}