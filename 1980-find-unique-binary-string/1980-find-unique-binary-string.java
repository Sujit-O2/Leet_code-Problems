class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuffer bb=new StringBuffer();
        for(int i=0;i<nums.length;i++){
            char c=nums[i].charAt(i);
            bb.append(c=='0'?'1':'0');
           
        }
        return bb.toString();
        
    }
}