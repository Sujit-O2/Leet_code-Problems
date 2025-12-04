class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int cnt=0;
        int i=0;
        int lsp=0,lsm=0,lsg=0;
        for(String s:garbage){
            cnt+=s.length();
            if(s.indexOf('M')>-1)lsm=i;
            if(s.indexOf('P')>-1)lsp=i;
            if(s.indexOf('G')>-1)lsg=i;
            i++;

        }
        for( i=0;i<travel.length;i++){
            if(lsm>i)cnt+=travel[i];
            if(lsg>i)cnt+=travel[i];
            if(lsp>i)cnt+=travel[i];

        }
        return cnt;
        
    }
}