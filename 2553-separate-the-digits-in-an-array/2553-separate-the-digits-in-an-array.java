class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> aa=new ArrayList();
        for(int i:nums){
            String s= i+"";
            for(int j=0;j<s.length();j++){
                aa.add(s.charAt(j)-'0');
            }
        }
        int aaa[]=new int[aa.size()];
        int cnt=0;
        for(int i:aa){
            aaa[cnt++]=i;


        }
        return aaa;
        
    }
}