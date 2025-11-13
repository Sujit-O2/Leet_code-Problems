class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int a[]=new int [A.length];
        Set <Integer> aa=new HashSet();
        for(int i=0;i<a.length;i++){
            aa.add(A[i]);
            for(int j=i;j>=0;j--)
            if(aa.contains(B[j])){
                a[i]++;
            }
            
        }
        return a;
        
    }
}