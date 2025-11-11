class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int cnt=0;
        for(int a:hours){
            if(a>=target){
                cnt++;
            }
        }
        return cnt;
        
    }
}