class Solution {
    public int numTilePossibilities(String tiles) {
        int a[]=new int[26];
        for(int i=0;i<tiles.length();i++){
        a[tiles.charAt(i)-'A']+=1;
       

        }
 return sujit(a);
        
    }
    int sujit(int a[]){
        int res=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0) continue;
            a[i]--;
            res+=1+sujit(a);
            a[i]++;
        }
        return res;

    }
}