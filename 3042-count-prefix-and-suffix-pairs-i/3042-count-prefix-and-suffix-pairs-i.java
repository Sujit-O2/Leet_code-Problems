class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int cnt=0;
        for(int i=0;i<words.length;i++){
        for(int a=i+1;a<words.length;a++){
            if(i==a)continue;
            if (words[a].startsWith(words[i]) && words[a].endsWith(words[i]))
                    cnt++;
        }
        
    }
    return cnt;

}
}
