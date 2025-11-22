class Solution {
    public boolean isAcronym(List<String> words, String s) {
        char c[]=s.toCharArray();
        int i=0;
        if(words.size()!=c.length){
            return false;

        }
        for(String s1:words){
            if(s1.charAt(0)!=c[i])
            return false;
            i++;

        }
        return true;
        
    }
}