class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> cc=new HashSet();
        for(char c: s.toCharArray()){
            cc.add(c);
        }
        return cc.size();
        
    }
}