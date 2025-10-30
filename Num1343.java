public class Num1343 {
    
}
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int cnt=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum/k>=threshold){
            cnt+=1;
        }
        for(int i=k+1;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
             if(sum/k>=threshold){
            cnt+=1;
        }

        }
        return cnt;
        
    }
}