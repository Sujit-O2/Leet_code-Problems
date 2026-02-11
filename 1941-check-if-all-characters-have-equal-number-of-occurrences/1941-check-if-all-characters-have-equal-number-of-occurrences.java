class Solution {
    public boolean areOccurrencesEqual(String s) {
        int a[]=new int[26];
        for(char c: s.toCharArray()){
            a[c-'a']++;
        }
        int val=a[s.charAt(0)-'a'];
        for(int i:a){
            if(i==0)continue;
            if(i!=val)return false;

        }
        return true;
        
    }
}