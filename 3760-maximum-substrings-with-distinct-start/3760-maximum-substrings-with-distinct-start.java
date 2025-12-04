class Solution {
    public int maxDistinct(String s) {
        Set<Character> cc= new HashSet();
        for(char c:s.toCharArray()){
            cc.add(c);
        }
        return cc.size();
        
    }
}