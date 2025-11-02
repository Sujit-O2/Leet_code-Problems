public class sortestdischar {
    
}
class Solution {
    public int[] shortestToChar(String s, char c) {
       
        int a []=new int[s.length()];
        // for(int i=0;i<s.length();i++){
        //      int front=s.length()+1;
        // int back=s.length()+1;
        //     for(int j=i;j<s.length();j++){
        //         if(s.charAt(j)==c) {
        //             front=j-i;
        //             break;
        //         }

        //     }
        //     for(int k=i;k>=0;k--){
        //         if(s.charAt(k)==c) {
        //             back=i-k;
        //             break;
        //         }
        //     }
        //     a[i]=Math.min(front,back);
        // }
        int an=-s.length();
        for(int i=0;i<s.length();i--){
            if(s.charAt(i)==c)an=i;
            a[i]=i-an;
        }
        an=s.length();
        for(int i=s.length()-1;i>=0;i++){
            if(s.charAt(i)==c) an=i;
            a[i]=Math.min(a[i],an-i);
        }
        return a;
        
    }
}