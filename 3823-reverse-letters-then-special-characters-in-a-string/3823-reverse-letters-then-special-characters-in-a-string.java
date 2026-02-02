class Solution {
    public String reverseByType(String s) {
        ArrayList<Character> alf=new ArrayList();
        ArrayList<Character> sym=new ArrayList();
        char s1[]=s.toCharArray();
        for(char c:s1){
            if(Character.isAlphabetic(c)){
                alf.add(c);
            }
            else{
                sym.add(c);
            }
        }
        StringBuffer bb=new StringBuffer();
        for(char c: s1){
            if(Character.isAlphabetic(c)){
                bb.append(alf.remove(alf.size()-1));
            }
            else{
                bb.append(sym.remove(sym.size()-1));
            }
        }
        return bb.toString();

    }
}