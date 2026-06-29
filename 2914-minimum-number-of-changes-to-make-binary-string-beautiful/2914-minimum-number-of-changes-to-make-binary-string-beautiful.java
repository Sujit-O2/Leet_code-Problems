class Solution {
    public int minChanges(String s) {
        int a=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(++i)) a++;
        }
        return a;
        
    }
}