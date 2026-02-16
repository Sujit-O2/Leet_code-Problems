class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuffer bb=new StringBuffer();
        for(String s:words){
            int sum=0;
            for(char c:s.toCharArray()){
                sum+=weights[c-'a'];
            }
            sum=sum%26;
            System.out.println(sum);
            bb.append((char)('z'-sum)+"");
        }
        return bb.toString();
        
    }
}