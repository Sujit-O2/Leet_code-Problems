public class IISum {
    
}
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // for(int i=0;i<numbers.length;i++){
        //     for(int j=i+1;j<numbers.length;j++){
        //         if(numbers[i]+numbers[j]==target){
        //             int a[]={i+1,j+1};
        //             return a;
        //         }

        //     }
        // }
        int left=0;
        int right=numbers.length-1;
        while(right>left){
            int sum =numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }
            if(sum>target){
                right--;
            }
            if(sum<target){
                left++;
            }
        }
        
        
        return null;
        
    }
}