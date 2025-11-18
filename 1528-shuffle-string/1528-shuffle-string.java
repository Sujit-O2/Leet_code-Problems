class Solution {
    public String restoreString(String s, int[] indices) {
        char AA[]=new char[s.length()];
        for(int i=0;i<indices.length;i++){
            AA[indices[i]]=s.charAt(i);
        }
        return new String (AA);
        
    }
}