class Solution {
    public int countKeyChanges(String s) {
        char c[]=s.toCharArray();
        int left=0;
        int right=1;
        int cnt =0;
        while(right<c.length){
            if(c[left]==c[right]||c[right]==(c[left]-'a'+'A')||c[left]==(c[right]-'a'+'A')){
                cnt++;

            }
            left++;
            right++;
            
        }
        return c.length-cnt-1;
        
    }
}