class Solution {
    public String reversePrefix(String s, int k) {
        StringBuffer bb=new StringBuffer();
       bb.append(s.substring(0,k));
       bb.reverse();
       bb.append(s.substring(k));
        return bb.toString();
        
    }
}