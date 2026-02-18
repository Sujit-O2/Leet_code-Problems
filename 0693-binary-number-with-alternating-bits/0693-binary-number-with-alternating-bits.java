class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=Integer.toBinaryString(n);
        char c='a';
        for(char i:s.toCharArray()){
            if(c==i)return false;
            c=i;


        }
        return true;
        
    }
}