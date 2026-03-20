class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int cnt=0;
        int c=0;
        if(sum%3==0){
            for(int i=0;i<arr.length;i++){
                cnt+=arr[i];
                if(cnt==sum/3){
                    c++;
                    cnt=0;
                }
            }
            if(c>=3){
                return true;
            }
        }
        return false;
        
    }
}