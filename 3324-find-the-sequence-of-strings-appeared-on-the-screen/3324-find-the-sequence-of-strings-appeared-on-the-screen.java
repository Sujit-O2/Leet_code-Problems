class Solution {
    public List<String> stringSequence(String target) {
        List<String> ss=new ArrayList();
        for(int i=0;i<target.length();i++){
            int size =ss.size();
            for(int j=0;j<=target.charAt(i)-'a';j++){
                if(i==0){
                    ss.add(""+(char)('a'+j));

                }
                else{
                    ss.add(ss.get(size - 1) + (char)('a' + j));
                }
            }
        }
        return ss;
        
    }
}
