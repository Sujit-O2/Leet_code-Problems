class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
    HashSet<String>aa=new HashSet();
    for(int i:arr1){
        String s1=String.valueOf(i);
        for(int j=0;j<=s1.length();j++){
            aa.add(s1.substring(0,j));
        }
    }
    int max=0;
    for(int i:arr2){
        String s=String.valueOf(i);
        for(int j=0;j<=s.length();j++){
            if(aa.contains(s.substring(0,j))){
                max=Math.max(max,j);
            }
        }
    }
    return max;
        
    }
}