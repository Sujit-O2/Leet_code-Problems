class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ss=new ArrayList();
        for(String s2:words){
            String s[]=s2.split("\\" + separator);
            for(String s1:s){
                if(!s1.isEmpty())
                ss.add(s1);
            }
        }
        return ss;
        
    }
}