class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer Bb=new StringBuffer();
        int f1=word1.length();
        int f2=word2.length();
        int a=0;
        int b=0;
        while(a<f1&&b<f2){
            Bb.append(word1.charAt(a++));
            Bb.append(word2.charAt(b++));

        }
        
        if(a<f1)
        Bb.append(word1.substring(a));
        else if(b<f2)
        Bb.append(word2.substring(b));

    return Bb.toString();
    }
}